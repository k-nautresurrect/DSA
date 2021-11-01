package classinherit;

public class Textbox extends Control {

	private String text = ".";

	public Textbox() {
		super(false);
	}

	@Override
	public String toString() {
		return text;
	}
}