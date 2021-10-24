package classabstrct;

public class Main {
	public static void main(String[] args) {
		// browser
		// i want page
		// - i only want page
		/*
			adress
			request
			response
		*/
		Browser.hello();
		Browser req = new Browser();
		System.out.println(req.response("192.168.1.1"));
	}
}