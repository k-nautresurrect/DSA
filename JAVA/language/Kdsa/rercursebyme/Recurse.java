import java.util.*;
import java.io.*;


public class Recurse {
	public static void main(String[] args) {
		System.out.println(Call.Instack.push("nToOne(n:5)"));
		nToOne(5);
		System.out.println(Call.Instack);
		// System.out.println(Call.Outstack);
	}

	static void nToOne(int n) {
		if (n == 0) {
			System.out.println(Call.Instack.push(/*String.valueOf(n) + */" - Returned at 0"));
			return;
		}
		System.out.println(n);
		System.out.println(Call.Instack.push("ntoOne(n:" + String.valueOf(n - 1) + ")"));
		nToOne(n - 1);
		System.out.println(Call.Instack.push("ntoOne(n:" + String.valueOf(n) + ")"));

	}
}

class Call {
	public static Stack<String> Instack = new Stack<String>();
	public static Stack<String> Outstack = new Stack<String>();

}