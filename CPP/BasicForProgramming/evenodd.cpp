#include <iostream>

using namespace std;

void isevnod(int n) {
	if ((n & 1) == 1) { cout << "is Odd" << endl; }
	else { cout << "is Even" << endl; }
}

int main() {
	int n;  cin >> n;

	if (n % 2 == 0) { cout << "Is Even" << endl; }
	else { cout << "Is odd" << endl; }

	isevnod(n);
}