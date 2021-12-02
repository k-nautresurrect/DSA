/*  you are given a list of N number and Q queries.
	Each query is specified by 2 number i and j .
	the awnser to each query is the sum of every no,
	btw i and j (inclusive)
	N <= 10^5
	Q <= 10^4
	0 <= i, j <= N-1

	input
	4 3
	1 4 5 6  [1,5,10,16]
	0 2
	1 3
	1 1

	output
	10
	15
	4
*/
/*
	1. n , q             ----> O(1)
	2. arr[n]            ----> O(n)
	3. while(q-- > 0)    ----> O(q)
	4. 	i, j, sum        ----> O(1 * q)
	5.  for(i -> j)      ----> O(q * (j-i+1)) !
	6.   sum += arr[i]   ----> O(q * (j-i+1)) !
	7.  prnt(sum)        ----> O(q)

    O(Q * N) => 10^9 => 10
	O(Q) => 10^4
	1sec = 10^8

*/


#include<bits/stdc++.h>

using namespace std;

void prefix(int arr[], int n, int q) {
	int pre[n], sum = 0;
	for (int i = 0; i < n; i++) {
		sum += arr[i];
		pre[i] = sum;
	}
	while (q-- > 0) {
		int l, r; cin >> l >> r;
		if ((l - 1) >= 0) {
			cout << pre[r] - pre[l - 1] << "\n";
		} else {
			cout << pre[r] << "\n";
		}
	}
}

int main() {
	int n, q; cin >> n >> q;
	int arr[n];
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	prefix(arr, n, q);

	/*
	while (q-- > 0) {
		int i, j, sum = 0; cin >> i >> j;
		for (; i <= j; i++) {
			sum += arr[i];
		}
		cout << sum << endl;
	}
	*/
}

