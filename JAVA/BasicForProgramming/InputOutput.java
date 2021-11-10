import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;


public class InputOutput {
	public static void main(String[] args) {
		Scanner arg = new Scanner(System.in);
		PrintStream io = new PrintStream(System.out);

		int a = arg.nextInt();
		boolean flag = arg.nextBoolean();
		arg.nextLine();     // collecting another character after entering boolean
		String name = arg.nextLine();
		double db = arg.nextDouble();
		float f = arg.nextFloat();
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) { arr[i] = arg.nextInt(); }
		for (int x : arr) { io.print(x + " "); }
		io.println();
		io.println(a);
		io.println(flag);
		io.println(name);
		io.println(db);
		io.println(f);
		io.print(Arrays.toString(arr));
	}
}