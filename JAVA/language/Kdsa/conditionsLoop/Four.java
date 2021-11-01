import java.util.*;

public class Four {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		int num = arg.nextInt();
		int mltpl = 1;
		while (mltpl <= num) {
			if (num % mltpl == 0) {
				System.out.println(mltpl);
			}
			mltpl++;
		}
	}
}