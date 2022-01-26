/*
	for any input string - abcd
	all substrings are -
	a     b   c   d
	ab    bc  cd
	abc   bcd
	abcd
*/

public class PrintSubString extends IO {
	public static void main(String[] args) {
		String str = in.nextLine();

		for (int idx = 0; idx < str.length(); idx++) {
			for (int sbdx = idx; sbdx <= str.length(); sbdx++) {
				out.print(str.substring(idx, sbdx) + " ");
			}
			out.println();
		}
	}
}