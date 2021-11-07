#include <iostream>
#include<vector> // for vector

using namespace std;

float sum(vector<int> vec, int n) {
	int d = (vec[n - 1] - vec[0]) / (n - 1); // yet another formula for calculating d
	return (n / 2.00) * (2 * vec[0] + ((n - 1) * d));
}

int main() {
	int n; cin >> n;
	vector<int> vec(n);

	for (int i = 0; i < vec.size(); i++) {
		cin >> vec[i];
	}

	// printing with storing
	for (int x : vec) { cout << x << " "; }
	cout << "\n";

	cout << sum(vec, n) << endl;

	// printing without storing
	int a; cin >> a;
	while (n-- > 1) {
		cout << a << " ";
		cin >> a;
	}
	cout << a << " ";
}