#include <iostream>

using namespace std;

int fact(int n) {
	if (n == 1) {
		return 1;
	}
	return fact(n - 1) * n;
}

int main() {
	int n;  cin >> n;

	int i = 1, fac = 1;
	while (i <= n) {
		fac *= i;
		i++;
	}

	cout << fac << endl;
	cout << fact(n) << endl;
}