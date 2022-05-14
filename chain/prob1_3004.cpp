#include <bits/stdc++.h>

using namespace std;

void stressTest() {}

int main() {
	int n; cin >> n;
	if (n & 1 == 1) {
		int nsp = n - 1;
		int nval = 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= nsp; col++) {
				cout << " ";
			}
			for (int col = nval; col >= 1; col--) {
				cout << col;
			}
			if (row <= (n / 2)) {
				nsp -= 2;
				nval++;
			}
			else {
				nsp += 2;
				nval--;
			}
			cout << endl;
		}
	}
	return 0;
}