#include<iostream>
#include<bitset>
#include<climits>

using namespace std;

int main(){
	int n, rem, i;
	n = INT_MAX;
	string binary = bitset<32>(n).to_string();
	while(n > 0){
		rem = n % 2;
		cout << rem;
		n = n/2;
	}
	cout << endl;
	cout << binary;
	return 0;
}