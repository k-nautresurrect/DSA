/*
	for input string hello
	output should be :
	h
	e
	l
	l
	o
*/

public class PrintChar extends IO {
	public static void main(String[] args) {

		String str = in.next();

		for (int ch = 0; ch < str.length(); ch++) {
			out.println(str.charAt(ch));
		}

	}
}