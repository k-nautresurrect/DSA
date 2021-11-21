#include <iostream>

using namespace std;
int a = 9;

int main() {
	/*
		Operators
			- Airthmetic
			- logical
			- bitwise *
			- relational
			- Assignment
			- others
	*/

	// Airthmetic
	int a, b;  cin >> a >> b;
	cout << a + b << endl;
	cout << a - b << endl;
	cout << a * b << endl;
	cout << a / b << endl;
	cout << a % b << endl;

	// increment, decrement by 1
	cout << a++ << " " << b++ << endl; //printed first then increase
	cout << a-- << " " << b-- << endl;
	cout << ++a << " " << ++b << endl; //incremented first then printed
	cout << --a << " " << --b << endl;

	// Relational  ->  returns boolean
	cout << (a > b) << endl;
	cout << (a < b) << endl;
	cout << (a == b) << endl;
	cout << (a != b) << endl;
	cout << (a >= b) << endl;
	cout << (a <= b) << endl;

	// Assignment -> assigning from left to right
	cout << (a = b) << endl;  // prints the value of right after assigning.
	cout << (a += b) << endl;
	cout << (a -= 1) << endl;
	cout << (a *= b) << endl;
	cout << (a /= b) << endl;
	cout << (a %= b) << endl;

	// Logical -> returns boolean
	cout << (a && a) << endl;  // truthy list in c++ contains all +ive and -ive exxcept 0
	cout << (-4 && 8) << endl;
	cout << (-6 && -8) << endl;
	cout << (a && b) << endl;
	cout << (a && 0) << endl;
	cout << (a || b) << endl;
	cout << (0 || 0) << endl;
	cout << !a << endl; // truthy value turns to falsy value -> 0, but not stored
	cout << (a = !a) << " " << a << endl;

	// Other
	cout << sizeof(int) << endl;  //gives size of anything passed
	cout << &a << endl;  // gives adress of the variable storage
	cout << a << endl;   // gives the local scope variable
	cout << :: a << endl;// gives the global scope variable

	return 0;
}