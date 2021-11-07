#include<iostream>
#include<vector>

using namespace std;
int sum(vector<int> vec) {
	int sum = 0;
	for (int x : vec) { sum += x; }
	return sum;
}


int mean(vector<int> vec, int n) {
	return sum(vec) / n;
}

int main() {
	int n;  cin >> n;
	vector<int> vec(n);

	for (int i = 0; i < vec.size(); i++) {
		cin >> vec[i];
	}
	cout << mean(vec, n);
}