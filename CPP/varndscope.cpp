#include <iostream>

/*
	in c++ there is a declarative region
	which provide the scope for any identifier
	known as namespace std, global are some examples of it
	also we can define our own namespace in c++ and can access them
	with the help of scope resolution opertor
*/

namespace varscope {
int Sum(int a, int b) {
	return a + b;
}
}

// using namespace std;

const int n = 80;

void func() {
	int n = 12;
	std :: cout << n << std :: endl;
	std :: cout <<::n << std :: endl;
	std :: cout << &n << std :: endl;  // refrence of n
	std :: cout << *(&n) << std :: endl;  // pointer to the refrence => number itself.
}

int main() {
	int n = 10;
	std :: cout << n << "\n";	// it is not possible to access function variable outside in c++
	std :: cout << ::n << "\n"; // accesing global scope
	func();
	int m = varscope :: Sum(n, ::n);
	std :: cout << m << std::endl;

	return 0;
}