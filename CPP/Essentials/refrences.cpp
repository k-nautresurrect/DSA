/*
	it is highly used in parameter passing and also
	get rid of the complexity given by the pointers.

*/

#include <iostream>

using namespace std;

int main() {
	int a = 10;
	int &r = a;

	cout << a << endl;
	cout << r << endl;
	cout << *(&r) << endl; // derefreced to refrenced r
	cout << &r << endl; //refrenced to r

	r++;
	/*
		it will change value of a as well as r because r
		is the refrence to a so any change in r leds to change in a
		same for a
	*/
	a++;
	cout << a << endl;
	cout << r << endl;

	int t = 10;
	char ch = 'a';
	char &c = ch;

	c++;
	cout << ch << endl;

	// How refrences work in C++ ?

	return 0;
}