package classinherit;

public class Control {
	private boolean isEnable = true;

	public Control(boolean isEnable) {
		this.isEnable = isEnable;
		if (isEnable) {
			IO.cmd.println("Textbox initiated");
		} else {
			IO.cmd.println("Textbox disabled");
		}
	}
}