package classinherit;

public class Main extends IO {
	public static void main(String[] args) {
		/*
			- inheritence
			- extend
			- super, sub
			- casting object
			- upcasr downcast
			- super()...
			- method overridding
			- method overloading
		*/
		/*
			class A <--functionality-- class b
			class A i can use everymethod
			without refrencing class.
		*/

		// IO.cmd.println("Hello world");
		// var cntrl = new Control(false);
		var txtbox = new Textbox();
		// show(cntrl);
		// show(txtbox);

		// showsub(cntrl);
		showsub(txtbox);
		IO.cmd.println(txtbox.toString());


		// cmd.println("Hello World");
	}

	public static void showsub(Textbox txt) {
		IO.cmd.println(txt);
	}

	public static void show(Control control) {
		IO.cmd.println(control);
	}
}