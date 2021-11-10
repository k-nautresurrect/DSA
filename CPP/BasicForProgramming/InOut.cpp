#include<iostream>

using namespace std;

int main() {
	int n; cin >> n;

	// if initialized will give segmentation fault for line 16.
	// char* Pstr; cin >> Pstr;

	cout << n << "\n";

	// cout << Pstr << endl;

	int arr[5];
	cout << *(arr + 1) << endl;    //segmentation fault because of Pstr pointer
	arr[4] = 8;
	cout << *(arr + 4) << endl;
	cout << *(arr + 3) << endl;
	cout << arr[8] << endl;

	// for (int i = 0; i < 5; i++) { cout << arr[i] << " "; }

	char carr[5] = {'T'};   // if not initialized-> line 26
	cout << *(carr) << endl;
	// this program will give unpredictable output
	// that's why either use dynamic memory allocation*
	// Or say no to pointers.
	return 0;
}