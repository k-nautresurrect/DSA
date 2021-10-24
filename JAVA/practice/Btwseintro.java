public class Btwseintro extends IO {
	public static void main(String[] args) {
		/*
			anything in the computer is in binary
			why binary?
			- on which electronic things computer is based on?
			  - transistor - resistor - capacitor
			    - on, off
			     - 1,   0
			- lightspeed ~
			in real world we calculate in decimal system.
			bitwise operation : operation on binary
			- it is fastest operation
			base 2 -> representation of anything in power of 2
			       -> 2 variables 0,1...1,2.....3,4
			base 10 -> representation in power of 10 // 355 = 3*10^2 + 5*10^1 + 5*10^0
			        -> 10 -> 0,1,2,3,4,5,6,7,8,9,
			base 16 ->representation in power of 16
					-> 16 -> ...
		*/

		/*
			and ( & ) -> all bits should be 1 then only it return 1 else 0
			          -> if any no gets (&) by 1 then the result is the no itself
			             -> 1010
			             &	1111
			             --------
			                1010
			or ( | ) -> atleast one bit should be 1
			* xor ( ^ ) -> if there is an opposite bit return high
			            -> if there is odd no of ones then it return 1.
			            -> 1011
			            -> 1101
			            ^  1111
			            -------
			               1001
			            -> a^1 = comp(a)
			               a^0 = a
			               a^a = 0
		*/

		int a = input.nextInt(); // 0011
		int b = input.nextInt(); // 0101
		int c = input.nextInt(); // 0111
		// output.println(a & b);   // 0001
		// output.println(a | b);   // 0111

		output.println(a ^ b ^ c);  // 0001

		/*
			 111 -> 2^(no of bits) - 1
			 2^10 ~= 1000
			(<<)leftshift - 10001010
					 -> 00010100
					 -> if no gets leftshifted then the result is
					    on both odd and even - num * 2^(no of time let shift occured)
			(>>)right - 010101110
					 -> 001010111
					 -> 1011101
					 -> 1101110
					 -> num / 2^(no of time rightshift occured)
			(>>>)unsigned right shift - 101101
									->  010110
		*/
		// output.println((a << 2) + " " + (b << 1) + " " + (c << 3));
		// output.println((a >> 2) + " " + (b >> 1) + " " + (c >> 3));
		// output.println((a <<< 2) + " " + (b <<< 1) + " " + (c <<< 3));

		//to check even or odd

		/*
		  011 -> 2^0 -> 1
		  001
		  ---
		  001
		*/
		// if(1) -> bad operation , truthy, falsy
		// if(true ) ->
		// a % n = a - n(a/n)
		if ((a & 1) == 1) { output.println("odd"); }
		else { output.println("even"); }


		int v = 0;
		int[] arr = {2, 3, 2, 5, 4, 3, 5, 8, 8};
		for (int i = 0 ; i < 9; i++) {

			v = v ^ arr[i];
			// output.println(v);
		}
		output.println(v);
		/*
			0 ^ a = a
			v ^ 2 ^ 2 ^ 3 ^ 3 ^ 4 ^ 5 ^ 5 ^ 8 ^ 8
			2 ->
		*/

	}
}