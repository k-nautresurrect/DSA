package refractor;

public class Calculate {
	private int principle;
	private float annual;
	private byte years;

	public Calculate(int principle, float annual, byte years) {
		this.principle = principle;
		this.annual = annual;
		this.years = years;
	}

	public double resultInReport() {
		float monthIntrest = annual / Main.PERCENT / 12;
		float numOfPay = years * 12;
		double balance = principal
		                 * (monthlyInterest * Math.pow(1 + monthlyInterest, numOfPay))
		                 / (Math.pow(1 + monthlyInterest, numOfPay) - 1);
		return balance;
	}

	public double resultInBalance(short numOfPayMade) {
		float monthlyInterest = annualInterest / Main.PERCENT / 12;
		float numOfPay = years * 12;
		double balance = principal
		                 * (Math.pow(1 + monthlyInterest, numOfPay) - Math.pow(1 + monthlyInterest, numOfPayMade))
		                 / (Math.pow(1 + monthlyInterest, numOfPay) - 1);
		return balance;
	}
}