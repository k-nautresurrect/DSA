import java.util.*;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int temp = n, revn = 0;
		while (temp > 0) {
			int dgt = temp % 10;
			revn = revn * 10 + dgt;
			temp /= 10;
		}
		if (revn == n) { System.out.println("Pallindrome"); }
		else { System.out.println("not Pallindrome"); }
		System.out.println(pall(n));
	}


	static boolean pall(int n) {
		int cnt = (int)Math.log10(n);
		int temp = n, revn = 0;

		while (temp > 0) {
			int dgt = temp % 10;
			revn += dgt * Math.pow(10, cnt);
			cnt--;
			temp /= 10;
		}

		return (n == revn);
	}
}