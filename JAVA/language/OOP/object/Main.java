package object;

public class Main {
	public static void main(String[] args) {
		var obj = new Object();
		var textbox = new Textbox();
		var control = new Control(true);
		textbox.setText("Hello World");
		show(control);
		show(textbox);
		System.out.println(textbox.toString());
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
	}

	public static void show(Control control) {
		if (control instanceof Textbox) {
			var textbox = (Textbox) control;
			textbox.setText("Hello ");
		}
		System.out.println(control);
	}
}