#include<iostream>
#include<cmath> //for logarithmic function

using namespace std;

// simple itreative solution -> O(n);
int count(int n) {
	int cnt = 0;
	while (n > 0) {
		cnt++;
		n /= 10;
	}
	return cnt;
}

// simple recurssive solution -> O(n), space -> O(n);
int count_recurse(int n) {
	if (n == 0) {
		return 0;
	}
	return 1 + count_recurse(n / 10);
}

// logarithmic solution -> O(logn)
int count_Optimizd(int n) {
	return (int)(log10(n) + 1);
}

int main() {
	int n; cin >> n;
	cout << count(n) << "\n";
	cout << count_recurse(n) << "\n";
}