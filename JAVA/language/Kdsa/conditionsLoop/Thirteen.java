import java.util.*;

public class Thirteen {
	public static void main(String[] args) {
		Scanner arg = new Scanner(System.in);

		int salary = arg.nextInt();
		double cPrcent = arg.nextInt();
		int sales = arg.nextInt();
		int salesDone = arg.nextInt();

		double comission = 0;

		if (salesDone > sales) {
			comission = (salesDone - sales) * (cPrcent / 100);
			salary += comission;
		} else {
			System.out.println(salary);
		}
		System.out.println(salary);
	}
}