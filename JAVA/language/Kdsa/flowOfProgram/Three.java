import java.util.*;

public class Three {
	public static void main(String[] args) {
		Scanner arg = new Scanner(System.in);
		int num = arg.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}