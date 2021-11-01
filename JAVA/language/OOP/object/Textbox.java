package object;

public class Textbox extends Control {
	private String text = "";

	public Textbox() {
		super(false);
		System.out.println("this is textbox");
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}