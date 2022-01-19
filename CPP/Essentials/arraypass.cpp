#include <iostream>

using namespace std;
/*
	size should be given as an param because
	A[] will only points starting elements of the array
*/
// arrays can only be passed as an adress

// returning array
/*
	this feature is known as structured binding
	int [] funct(int n) //only available in c++17
*/

int * funct(int n) {
	int *ptr;
	ptr = (int*)malloc(n * (sizeof(int)));
	return ptr;
}

void foo(int A[], int n) {
	/*
		// returns the size of pointer to A
		int size = sizeof(A)/sizeof(A[0]);
	*/
	for (int i = 0; i < n; i++) {
		cout << A[i] << " ";
	}
}

void func(int *A, int n) {
	for (int i = 0; i < n; i++) {
		cout << *(A + i) << " ";
	}
	cout << endl;
	// for each loop only works with containers
	// in c++ having begin and end iterators
	/*for(auto x: A){	}*/
}

int main() {
	int A[5] = {1, 2, 3, 4, 5};

	// it will give the correct size because
	// array is in this function not passed
	// as an adress of the first element
	int n = sizeof(A) / sizeof(A[0]);
	cout << n << endl;
	foo(A, n);
	cout << endl;
	func(A, 5);
	cout << endl;
	int *ar;
	ar = funct(8);
	for (int i = 0; i < 8; i++) {
		cout << ar[i] << " ";
	}

	return 0;
}