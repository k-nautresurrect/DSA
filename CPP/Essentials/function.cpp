#include<iostream>

using namespace std;

// call by value
void func(int c) {
	cout << c*c << endl;
	return void(c);
}

int fun(int d) {
	cout << d*d << endl;
	return int(d);
}

// call by refrence
float function(int &t) {
	return t * t / 100.00;
}

void change(int &t) {
	t = t * t;
}

int mul(int *t) {
	return (*t) * (*t);
}

// inline function
inline long cube(long int a) {
	return a * a * a;
}

/*
inline long cube(int a) {
	return a * a * 1000;
}
// will not return untill long is passed
*/

// default arguments
int sum(int a, int b, int c = 0, int t = 10) {
	return a + b + c + t;
}

int main() {
	func(3);
	fun(4);
	int c = 89;
	int t = 90;
	cout << function(c) << endl;
	cout << mul(&c) << endl;
	int *ptr = &c;
	cout << &c << " " << *ptr << endl;
	change(t);
	cout << t << endl;
	cout << cube(t) << endl;
	cout << sum(1, 2) << endl;
	cout << sum(1, 2, 3, 4) << endl;
	return 0;
}