package refractor;

public class Console {

	public static double readNum(String comment) {
		IO.cmd.println(comment);
		return IO.arg.nextDouble();
	}

	public static double readNum(String comment, double min, double max) {
		double value;
		while (true) {
			IO.cmd.println(comment);
			value = IO.arg.nextDouble();
			if (value >= min && value <= max) {
				break;
			}
			IO.cmd.println("Enter a value between " + min + " and " + max);
		}
		return value;
	}
}