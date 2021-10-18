#include<iostream>

using namespace std;

int main() {

	// comma Operator
	int a, b, c;

	// Asignment Operate
	a = 10;
	b = 20;
	c = 30;

	// Logical operator
	if (c > a and c > b) { cout << "c is Largest"; }

	//Ternary Operator
	int x = c % 2 == 0 ? 1 : 0;
	c % 2 == 0 ? cout << "Even" : cout << "Odd";


}