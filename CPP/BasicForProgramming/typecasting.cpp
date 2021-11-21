#include <iostream>

using namespace std;

int main() {

	/* implicit type casting
			int/float => float
			float/ float => float
			float/int => float
		explicit
			done by us from large to small
	*/

	int n1, n2;  cin >> n1 >> n2;
	cout << n1 / n2 << endl;
	cout << n1 / (n2 * 1.00) << endl;
	cout << (n2 * 1.00) << endl;

	float a = 10.9;
	cout << a << endl;
	cout << (int)a << endl;

	return 0;
}