package string;

import io.IO;

public class Implementstring extends IO {

	public static void main(String[] args) {
		// string cannot be initialized like array

		// how ever this operation is costly
		int n = in.nextInt();
		String s = "";

		for (int i = 0; i <= n; i++) {
			s += i;
		}
		out.println(s);

		// to forcefully work like an array ( taking input )
		String str = in.next(); // ends input when space is pressed
		// .next() method does not take spaces in a string

		in.nextLine(); // add this line to avoid the count of enter
		String nstr = in.nextLine(); // it will count the enter
		// takes input via spaces do not press enter

		// printing input
		out.println("str  : " + str);
		out.println("nst : " + nstr);

		// traversing the string
		/*
		 * for each will not work as string is not an 
		 * instance of java.lang.itreable
		 * 
		 * for(char ch: nstr) { out.print(ch + " "); }
		 */
		for (int i = 0; i < str.length(); i++) {
			out.print(str.charAt(i) + " ");
		}
		out.println();
		int itr = 0;
		while (itr < str.length()) {
			/*
			 * indexOf always print the index of the string 
			 * in intern pool, no matter how many times 
			 * it is repeated it will give the index 
			 * of the substring repeated in the intern pool
			 */
			out.print(str.indexOf(str.charAt(itr)) + " ");
			itr++;
		}

		// however indexOf works same in heap also
		in.nextLine();
		String st = new String(in.nextLine());
		for (int it = 0; it < st.length(); it++) {
			out.print(st.charAt(it) + " ");
		}
		out.println();
		int it = 0;
		while (it < st.length()) {
			out.print(st.indexOf(st.charAt(it)) + " ");
			it++;
		}
		// indexOf may be useful to find the unique char in a str
		out.println();
		// strings are immutable so to update them we can only add
		String hey = "hey";
		String bye = "bye";
		var heybye = hey.concat(bye); // it will return added str
		// concat method will not change anything in string hey,
		out.println(hey);
		out.println(bye);
		out.println(heybye.getClass().getName());

		// use of indexOf (kindOff)
		String example = "hey this is a new string.";
		int sp = 0;
		for (int i = 0; i < example.length(); i++) {
			if (example.charAt(i) == ' ') {
				sp = i;
				break;
			}
		}
		for (int i = 0; i < example.length(); i++) {
			if (example.indexOf(example.charAt(i)) == sp) {
				continue;
			} else {
				out.print(example.charAt(i));
			}
		}
		out.println();
		out.println(example.trim());//get rid of trailing spaces
		out.println(example.substring(5,8));
		out.println(example.substring(8)); // starts from 8
		out.println(example.startsWith("he"));
		out.println();

	}

}
