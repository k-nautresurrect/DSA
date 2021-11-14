#include<iostream>
#include<climits>  // for Limits of int
#include<algorithm> // for min,max,minmax

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

	cout << min(n1, n2); // gives minimum of exactly 2 numbers.
	/*
		cout << max(56,6); // here in this scope max is a variable not function.
	*/
	cout << std :: max(85, 8); // gives maximumm of exactly 2 number.
	minmax({12, 90, 1, 2}); // gives an itreator to the pair of minmax
	min({12, 3, 4, 6, -8}); // works same as above.
	std :: max({23, 45, 67, 89}); // works same as above.

	// we have to give scope if we are using the function of same name
	// as an identifier specified by us
	return 0;
}