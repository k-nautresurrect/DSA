#include <iostream>

using namespace std;
// to define function after the main first declarw on top then define.
int mul(int a, int b);

// procedural should be upper than main function.
/*
	int main() {
		cout << sum(4, 5);
	}

	int sum(int a, int b) {
		return a + b;
	}
*/
// the upper code is wrong due to procedural restriction.

// prototype, header, signature of a function
// int sum(int a,int b)

// defination of the function
// { int c = a+b; return c; }

// sum(4,5) the 4 and 5 are actual parameters
// sum(int a,int b) these are the formal params

/*
	scopes and defination of variables are in the function only
	+---------+
	| sum(4,5)|  the variable define in sum are not accesible to main
	+---------+
*/


// Parameter passing in function
/*
	pass by vlaue is used for taking the value and just processing
	and returning the processed output but if we want to actually take
	action on the input itself and change the input we use call by refrence
	or call by adress
*/
// call by adress.

void swap(int *a, int *b) { // adress is accepted as a pointer
	int temp;
	temp = *a; // here *a is pointing to the refrence to passed parameter
	*a = *b;
	*b = temp;
}

// call by refrence. this function now act as like in monolithic pogramming.

// will become inline
void swapp(int &a, int &b) {   // refrences doesn't take any memory
	int temp;
	temp = a; // here &a -> adress of a but a is paramter is actual
	a = b;
	b = temp;
}

int sum(int a, int b) {
	int c = a + b;
	return c;
}

int main() {
	int a, b;
	cin >> a >> b;
	cout << sum(a, b) << endl;
	cout << mul(a, b) << endl;
	cout << a << " " << b << endl;
	swap(&a, &b); // adress is passed as to maintain pass by adress.
	cout << a << " " << b << endl;
	swapp(a, b);
	cout << a << " " << b << endl;
	return 0;
}

int mul(int a, int b) {
	return a * b;
}