import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int temp = n, sumn = 0;

		while (temp > 0) {
			int dgt  = temp % 10;
			sumn += Math.pow(dgt, 3);
			temp /= 10;
		}
		System.out.println((n == sumn));
	}
}