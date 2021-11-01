import java.util.*;

public class Eight {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int noOfAplliances = arg.nextInt();

		double pusage;
		float hours;

		int cost = 7;
		double total = 0;

		while (noOfAplliances > 0) {
			pusage = arg.nextDouble();
			hours = arg.nextFloat();
			total += pusage * hours;
			noOfAplliances--;
		}
		System.out.println(total);
		System.out.println(7 * total);

	}
}