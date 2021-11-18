#include <iostream>
#include <cmath>

using namespace std;

void dcltobin(int n) {

	while (n > 0) {
		int r = n % 2;
		cout << r;
		n /= 2;
	}
	cout << endl;
}

int main() {
	long long int n;  cin >> n;
	long long int temp = n;
	int no = 0;
	int p = 1;

	while (temp > 0) {
		int dgt = temp % 10;
		no += dgt * p;
		p *= 2;
		temp /= 10;
	}
	cout << no << endl;
	dcltobin(no);
}