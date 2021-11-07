#include<iostream>
#include<cmath>

using namespace std;

bool ispallindrome(int n) {
	int p = 0, tmp = n;
	while (tmp != 0) {
		int dgt = tmp % 10;
		p = p * 10 + dgt;
		tmp /= 10;
	}
	return p == n;
}

int main() {
	int n;  cin >> n;
	cout << ispallindrome(n);
}