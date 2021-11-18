#include <iostream>

using namespace std;

void swap(int &n1, int &n2) {   // passed by refrence to affect orignal value.
	n1 = n1 + n2;
	n2 = n1 - n2;
	n1 = n1 - n2;

	cout << n1 << " " << n2 << endl;
}

int main() {
	int n1, n2;  cin >> n1 >> n2;
	cout << n1 << " " << n2 << endl;

	int temp = n1;
	n1 = n2;
	n2 = temp;

	cout << n1 << " " << n2 << endl;
	swap(n1, n2);
	cout << n1 << " " << n2 << endl;
	return 0;
}