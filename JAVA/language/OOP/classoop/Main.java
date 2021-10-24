/*
	class is a template for creating an object
	fields - parameters that are useful for class
	methods - behaviour of the class (state)
*/

/*
	+---------+
	|  cars   |		car1
	+---------+
	| started |		car2
	| speed   |
	| gear    |		car3
	+---------+
	| start() |
	| stop () |
	| brake() |
	+---------+
*/

/*
	+----------+
	| textbox  |
	+----------+
	| text     |
	| limit    |
	| length   |
	| isFocused|
	+----------+
	| setText()|
	| clear()  |
	| focus()  |
	+----------+
*/
package classoop;

public class Main {
	public static void main(String[] args) {
		TextBox textbox1 = new TextBox();  //creating new instance of class textbox
		var textbox = new TextBox(); //static type and java detect type based on the right of '='
		var tecbok = textbox;
		textbox.setText("hello World");

		// textbox.setText("Box1");
		System.out.println(textbox.text);
		System.out.println(tecbok.text);
		// cmd.println(textbox.text);

		var textbox2 = new TextBox();
		textbox2.setText("Box 2");
		System.out.println(textbox2.text);
		System.out.println(textbox1.text);

	}
}

