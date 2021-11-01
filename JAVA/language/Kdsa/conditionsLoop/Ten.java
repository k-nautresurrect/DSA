import java.util.*;
import java.lang.*;

public class Ten {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);

		double rate = arg.nextDouble();
		double discount = arg.nextDouble();

		double disAmount = rate - (rate * (discount / 100));
		System.out.println(String.format("%.4f", disAmount));
	}
}