package object;

public class Control {
	protected boolean isEnabled = false;

	public Control(boolean isEnabled) {
		this.isEnabled = isEnabled;
		if (isEnabled) {
			System.out.println("Control");
		} else {
			System.out.println("please enable first");
		}
	}

	public void enable() {
		isEnabled = true;
	}

	public void disable() {
		isEnabled = false;
	}


}