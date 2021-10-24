package absinclass;

public class Browser {
	public void navigate(String adrs) {
		String ip = findIpAddress(adrs);
		String res = sendRequest(ip);
		System.out.println(res);
	}

	private String findIpAddress(String adrs) {
		return "127.0.0.1";
	}

	private String sendRequest(String ip) {
		return "<html></html>";
	}
}