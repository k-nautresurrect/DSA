package stringBuilder;

import io.IO;

public class ImplementStringBuilder extends IO {

	public static void main(String[] args) {
		// String Builder acts like an char Array
		// but it is mutable

		StringBuilder str = new StringBuilder(in.nextLine());
		var sb = new StringBuilder(); // valid from java 10

		out.println(sb);
		out.println(str);

		// string to StringBuilder
		String s = "this is a string";
		StringBuilder nstr = new StringBuilder(s);

		out.println(s.getClass().getName());
		out.println(nstr.getClass().getName());

		// updating the String using StringBuilder
		StringBuilder newstr = new StringBuilder(in.nextLine());
		newstr.ensureCapacity(25); // ensure the starting capacity
		out.println(newstr.capacity());// the array will grow *2+2
		out.println(newstr);

		// traversing string builder
		/*
		 * for each cannot be used because it is not an array or an instance of
		 * java.lang.iterable
		 * 
		 * for (char ch : newstr) { out.print(ch + " "); }
		 */
		for (int i = 0; i < newstr.length(); i++) {
			if (newstr.charAt(i) == ' ') {
				continue;
			} else {
				newstr.setCharAt(i, 'f');
			}
		}
		out.println(newstr);

	}

}
