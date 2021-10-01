#include<iostream>
#include<cmath>

using namespace std;

int main() {
	int num, prec;  cin >> num >> prec;
	float sqrt = 0, inc = 1.0;
	for (int times = 0; times <= prec; times++) {
		while (sqrt * sqrt <= num) {
			sqrt = sqrt + inc;
		}
		sqrt = sqrt - inc;
		inc = inc / 10;
	}
	cout << sqrt << endl;
}