public class ConditionStatement {
	public static void main(String[] args) {

		// In java Boolean and basic integer are different

		/*
			if (1) { System.out.println("!"); }
		*/
		// int 1 cannot be converted in boolean

		boolean flag = true;

		// block start with if
		if (flag) { System.out.println("!"); }
		else { System.out.println("?"); }
		// should end with  either all if's or last else

		if (flag) { System.out.println("<>"); }
		if (flag) { System.out.println(":"); }
		else { System.out.println("?"); }

		// in this block else if only executes iff if or upper statement is false.
		if (flag) { System.out.println(flag); }
		else if (!(!flag)) { System.out.println(!flag); }
		else { System.out.println(":_:"); }
		// if any of these is true then it only run that statement.

	}
}