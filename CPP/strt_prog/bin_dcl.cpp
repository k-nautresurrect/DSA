#include<iostream>
#include<math.h>
#include<bitset>

using namespace std;

int main(){
	int n, dgt, ans = 0, pw = 0;
	cin >> n;
	while(n > 0){
		dgt = n % 10;
		ans += dgt * (pow(2,pw));
		n = n/10;
		pw ++;
	}
	cout << ans << "\n";
	return 0;
}