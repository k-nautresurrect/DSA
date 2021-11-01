import java.util.*;

public class Four {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int a = arg.nextInt();
		int b = arg.nextInt();
		char c = arg.next().charAt(0);

		if (c == '+') { System.out.println(a + b); }
		else if (c == '-') { System.out.println(a - b); }
		else if (c == '*') { System.out.println(a * b); }
		else if (c == '/') { System.out.println(a / b); }
		else { System.out.println(a + " " + b); }
	}
}