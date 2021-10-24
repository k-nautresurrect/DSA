package classabstrct;

public class Browser {

	public static void hello() {
		System.out.println("this is static");
	}

	public String response(String adrss) {
		String request = sendRequest(adrss);
		return request;
	}

	private String sendRequest(String adrss) {
		return "{ <html><h1>hello world</h1></html> } = " + adrss;
	}
}