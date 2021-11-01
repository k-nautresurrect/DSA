import java.util.Scanner;
import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;

public class Five {
	public static void main(String[] args) {
		var paisa = new Scanner(System.in);

		Locale crnt = new Locale.getDefault();
		var cnvrtpaise = new NumberFormat.getCurrencyInstance(crnt);
		String npaisa = cnvrtpaise.format(paisa);
		System.out.println(npaisa);
	}
}