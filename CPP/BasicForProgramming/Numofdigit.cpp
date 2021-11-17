#include<iostream>
#include<cmath> //for logarithm

using namespace std;

int countn(int n) {
	if (n / 10 == 0) {
		return 1;
	}
	return 1 + countn(n / 10);
}

int countopn(int n) {
	return (int) log10(n) + 1;
}

int main() {
	int n; cin >> n;
	int temp = n, count = 0;

	while (temp != 0) {
		count ++;
		temp /= 10;
	}
	cout << count << endl;
	cout << countn(n) << endl;
	cout << countopn(n) << endl;
	return 0;
}