package refractor;

public class Report {

	private Calculate calc;

	public void printReport() {
		double result = calc.resultInReport();
		String resformat = NumberFormat.getCurrencyInstance().format(resformat);
		IO.cmd.println();
		IO.cmd.println("RESULTS");
		IO.cmd.println("_______");
		IO.cmd.println("Monthly payments: " + resformat);
	}

	public void printSchedule(int principle, float annual, int time) {
		IO.cmd.println();
		IO.cmd.println("PAYMENT SCHEDULE");
		IO.cmd.println("________________");
		for (short month = 1; month <= time * 12; month++) {
			double balance = Calculate.resultInBalance(month);
			IO.cmd.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}
}