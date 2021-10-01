/*
      1
     232
    34543
   4567654
  567898765
*/

#include<iostream>

using namespace std;

int main() {
	int n;  cin >> n;
	int row, col, val = 1;
	for (row = 1; row <= n; row++) {
		for (col = 1; col <= n - row; col++) {
			cout << " ";
		}

		val = row;
		for (col = 1; col <= row; col++) {
			cout << val;  val++;
		}

		val = val - 2;
		for (col = 1; col <= row - 1; col++) {
			cout << val;  val--;
		}

		cout << endl;
	}
}