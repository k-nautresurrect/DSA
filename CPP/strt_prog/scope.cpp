#include<iostream>

using namespace std;

int x = 100;

int main() {

	int x = 10;
	cout << x << "\n"; //if x is not defined in the local scope then it uses global.

	for (int x = 0; x < 5; x++) {
		cout << x << "\n";
	}

	cout << "Local x" << x << "\n";
	cout << "global x" <<::x << "\n";

	return 0;
}