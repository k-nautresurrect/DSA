public class Seive extends IO {
	public static void main(String[] args) {
		/*
			divisor
			36 = 1 * 36
				 2 * 18
				 3 * 12
				 4 * 9
				 6 * 6  -> 6^2 = 36 => sqrt(n) -> i < sqrt(36) <-logn == i*i < n
				 9 * 4
				 12 * 3
				 18 * 2
				 36 * 1
			13 = 2 ~
				 3 ~	prime(13) "//"
			O(nlognlogn)

			n -> input number
			to find prime number from 1 to n
			seive -> array[n+1] = {true}
			      -> 2,3,5 to n = {false}
			      -> remaining array has all the multiple of a
				2,3,5,7  -> 7 * 8
			1. arra[n+1] = true
			   -  2, 4, 8,
			   -  3, 6, 9, 12, 15  -> + i
			   -  5, 10, 15, 20, 25

			2* 3* 4* 5* 6** 7 8* 9* 10**
			11 12** 13 14* 15** 16* 17
			18** 19 20** 21* ..... √n.
			  - 2, 4, 8,
			  - 3, 9, 27
			  - 2, 2+2, 2+2+2
			3. for(int i =2 ; i<=n;i++)
			2. for (j = i*i; i<=n; j = j+i)

		*/
		int n = input.nextInt();
		boolean[] arr = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = true;
		}
		int cnt2 = 0, cnt = 0;
		for (int i = 2; i <= n; i++) {
			// output.println(cnt + " " + arr[i]);
			if (arr[i]) {
				output.print(i + " ");
				for (int j = i * i; j <= n; j = j + i) {
					// output.println( "cnt2" + " " + cnt2 + " " + arr[j]);
					arr[j] = false;
				}
			}
			cnt++;
		}

		//O(nloglogn)
		//O(n+1)


	}
}