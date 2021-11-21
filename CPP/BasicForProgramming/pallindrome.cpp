#include <iostream>
#include <cmath>

using namespace std;

bool plndrmchck(int n) {
	int revn = 0, temp = n;

	while (temp > 0) {
		int dgt = temp % 10;
		revn = revn * 10 + dgt;
		temp /= 10;
	}
	if (revn == n) { return true; }
	else { return false; }
}

int main() {
	int n;  cin >> n;

	cout << plndrmchck(n);

	int revn = 0, temp = n;
	int cn = (int)log10(n);  // from 1's 10's 100's ...

	while (temp > 0) {
		int dgt = temp % 10;

		revn += dgt * pow(10, cn);
		cn--;
		temp /= 10;
	}
	if (n == revn) { cout << "is palindrome" << endl; }
	else { cout << "is not pallindrome" << endl; }
	return 0;
}