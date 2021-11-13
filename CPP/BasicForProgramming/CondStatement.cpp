#include<iostream>

using namespace std;

int main() {
	bool flag = false;

	if (flag) { cout << true; }
	else { cout << false; }

	int f = 1;

	if (f) { cout << true; }
	if (!f) { cout << false; }

	cout << !f;
	cout << ~f;

	char c = 'a';

	if (c) { cout << c << " " << true; }
	if (!c) { cout << !c << " " << false; }

	cout << !c << endl;
	cout << ~c << endl;

	if (!flag) { cout << "IF" << endl; }
	else if (!flag) { cout << "ELSE_IF" << endl; }
	else { cout << "ELSE"; }

	return 0;
}