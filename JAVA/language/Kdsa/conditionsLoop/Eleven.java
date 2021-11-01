import java.util.*;

public class Eleven {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int x1 = arg.nextInt();
		int y1 = arg.nextInt();
		int x2 = arg.nextInt();
		int y2 = arg.nextInt();

		double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(dist);
	}
}