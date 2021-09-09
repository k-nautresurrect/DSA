#include<iostream>

using namespace std;

int main(){
	int sum = 0, n;
	cin >> n; // intializing criteria for n
	cout << "formula sum is : " << (n * (n +1)) / 2 << "\n";
	while(n > 0){ // stopping criteria for while loop
		sum += n;
		n--; // updation criteria
	}
	cout << sum ;
	return 0; 
}