#include<iostream>

using namespace std;

void ptrn1(int n){
	int val = 1;
	for(int row = 1; row <= 4; row++){
		for(int col = 1; col <= row; col++){
			cout<<val;
			val++;
		}
		cout<<endl;
	}
}

float SmplIntrst(int p,int r,int t){
	return (p*r*t/100.00);
}

int addn(int n, bool flag){
	int i = 1, s = 0;
	if(flag = 0){
		while(i<=n){ s+=i; i++; }
		return s;
	}
	else{
		return (n*(n+1)/2);
	}

}

int sofnum(int n){
	int ls = 0,s = 0;
	while(n>0){
		ls = n%10;
		s += ls;
		n = n/10;
	}
	return s;
}

void ptrn2(int n){
	int row = 1;
	while(row<=n){
		int col = 1;
		if(row%2==0){
			cout<<1;
			while(col<=row-2){
				cout<<0;  col++;
			}
			cout<<1;
		}
		else{
			while(col<=row){ cout<<1; col++; }
		}
		cout<<endl;
		row++;
	}
}

int bintodcn(int n){
	int lst,dcn = 0,pow = 2;
	while(n>0){
		lst = n%10;
		dcn += lst*pow;
		pow *= 2;   n /= 10;
	}
	return dcn;
}

void dcntobin(int n){
	for (int i = 31; i>=0; i--){
		int k = n >> i;
		if(k & 1){ cout<<1; }
		else { cout<<0; }
	}
}



int main(int argc, char const *argv[]){
	ptrn1(5);
	float si = SmplIntrst(25,3,2);
	cout<<si<<endl;
	int a = addn(4, 0);  cout<<a<<endl;
	a = addn(5, 1);  cout<<a<<endl;
	int s = sofnum(3456);  cout<<s<<endl;
	ptrn2(6);
	int dcn = bintodcn(11101110); cout<<dcn<<endl;
	dcntobin(34567);
	return 0;
}