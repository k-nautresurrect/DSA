import java.util.*;


public class One {
	public static void main(String[] args) {
		Scanner arg = new Scanner(System.in);
		int year = arg.nextInt();

		if (year % 4 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
