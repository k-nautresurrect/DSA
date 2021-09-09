#include <iostream>

using namespace std;

int main(){
	int Test;
	cin >> Test;
	while(Test > 0){
		cout<<"testcase "<<Test<<"\n";
		Test --;
	}
	cin >> Test;	
	cout << endl;
	while(Test --){
		cout << "testcase " << Test << "\n";
	}
	cout << endl;
	cin >> Test;
	int i = 1;
	while(i <= Test){
		cout << "testcase " << i << "\n";
		i++;
	}
	return 0;
}