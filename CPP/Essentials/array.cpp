#include<iostream>

using namespace std;

int main() {
	int A[5]; // 5*4 = 20
	A[0] = 2; A[1] = 3; A[3] = 4; A[4];

	int n; cin >> n;
	int arry[n] = {0}; // compiler dependent
	int a[] = {1, 2, 3, 4, 5, 9, 10};

	int ar[10] = {2, 3, 4, 6};
	int arr[10] = {0};

	cout << sizeof(ar) << " " << sizeof(ar[0]) << endl;
	cout << ar[9] << " " << ar[7] << endl;
	cout << sizeof(A) << endl;
	cout << sizeof(a) << endl;
	printf("%d\n", A[2]);

	for (int x : arr) {
		cout << x << " ";
	}
	cout << endl;

	return 0;
}