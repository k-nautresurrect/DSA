#include <iostream>

using namespace std;

int main() {
	int n;  cin >> n;
	int temp = n, sumn = 0;

	while (temp > 0) {
		int dgt = temp % 10;
		sumn += dgt * dgt * dgt;
		temp /= 10;
	}
	if (sumn = n) { cout << "Armstrong" << endl; }
	else { cout << "Not Armstrong" << endl; }
	return 0;
}