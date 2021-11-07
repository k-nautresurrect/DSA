#include<iostream>

using namespace std;

bool isArmstrong(int n) {
	int A = 0, tmp = n;
	while (tmp != 0) {
		int dgt = tmp % 10;
		A += (dgt * dgt * dgt);
		tmp /= 10;
	}
	return A == n;
}

int main() {
	int n;  cin >> n;
	cout << isArmstrong(n);
}