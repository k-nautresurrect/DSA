#include<iostream>
#include<climits>

using namespace std;

int main() {
	int n;  cin >> n;
	int max = INT_MIN, min = INT_MAX;
	for (int i = 0; i < n; i++) {
		int no; cin >> no;
		if (no < min) { min = no; }
		if (no > max) { max = no; }
	}
	cout << "MAX " << max << endl;
	cout << "MIN " << min << endl;
}