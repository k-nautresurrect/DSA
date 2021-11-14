#include<iostream>
#include<climits>

using namespace std;

int main() {

	// for finding maximum we can simply use relational operators

	int n1, n2;   cin >> n1 >> n2;
	if (n1 > n2) { cout << "Max is : " << n1; }
	else { cout << "Max is : " << n2; }
	cout << "\n";

	// for a given number or input stream comming recursively.
	// we can just implement the same thing.
	// Without storing things in memory

	int n;  cin >> n;
	int max = n;   // if we don't know the constraints for n.
	int maxc = 0;  // if we know the constraints of n all +ive no.

	while (n < INT_MAX) {		// this criteria is to avoid integer Overflow
		if (n >= max) { max = n; }
		cout << "Max LOOP." << endl;
		cin >> n;
	}
	cout << max;
	cout << "\n";
	// comment this out as input stream will imidiatly gives the
	// argument to m if upper criteria is failed.

	int m = 0 ;  // maxc = 0;
	cin >> m;
	// cout << "M is : " << m << endl;
	while (m >= 0 && m < INT_MAX) {
		if (m >= maxc) { maxc = m; }
		cin >> m;
		cout << m << endl;
		// cout << "MAXc LOOP" << endl;

	}
	cout/* << "MAXC is" */ << maxc << endl;
	cout << "\n";

	// point -> Max of maximums is the absolute MAX
	// point -> Minimum of minimum is the absolute MIN

	return 0;
}