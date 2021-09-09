#include <iostream>

using namespace std;

int main(){
	int dgt, sum = 0, n;
	cin >> n;
	while(n > 0){
		dgt = n % 10;
		sum += dgt;
		n = n/10;
	}
	cout << sum << "\n";
	return 0;
}