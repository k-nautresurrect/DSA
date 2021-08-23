#include<iostream>
#include<climits>
#include<chrono>
#include<thread>


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

void Datatypmodifier(int x){
	cout<<INT_MAX<<endl;
	cout<<INT_MIN<<endl;
	cout<<"x = "<<x<<endl;
	x = INT_MAX;
	x++;
	cout<<"x+1 = "<<x<<endl;

}

void ftoctable(int tmpc){
	int tmpf = 0;
	while(tmpf<=300){
		tmpc = (5*(tmpf-32))/9;
		cout<<tmpf<<"\t"<<tmpc<<endl;
		tmpf += 20;
	}	
}

void chckDivsible(int n){
	if(n%2==0 and n%3 == 0){ cout<<"divisible by both 2 and 3"<<endl; }
	else if(n%2==0){ cout<<"divisible by 2"<<"\n"; }
	else if(n%3 == 0){ cout<<"divisible by 3"<<endl; }
	else{ cout<<"not divisible by 2,3 or both"<<endl; }	
}

void FndminmaxN(){
	int n,N,min = INT_MAX,max = INT_MIN;
	cin>>n;
	for(int i=1; i<=n; i++){
		cin>>N;
		if(N<min){ min = N; }
		else if(N>max){ max = N; }
		else{ continue; }
	}
	cout<<min<<"  "<<max<<endl;
}

void ptrn3(){
	int n,row,col,val;
	cin>>n;
	//loop for rows
	for(row=1;row<=n;row++){
		//loop for spaces
		for(col=1;col<=n-row;col++){
			cout<<" "; 
		}
		//loop for increasing
		val=row;
		for(col=1;col<=row;col++){
			cout<<val;
			val++;			
		}
		//loop for decreasing no.
		val = val-2;
		for(col=1;col<=row-1;col++){
			cout<<val;
			val--;
		}
		cout<<endl;
	}
}

void sqroot(int n,int precision){
	float awn=0, inc=1.0;
	for(int tms=0; tms<=precision; tms++){
		while(awn*awn<=n){
			awn += inc;
		}
		awn = awn - inc;
		inc = inc/10;
	}
	cout<<awn<<endl;	
}

void readlineSpace(){
	char ch;
	//cin>>ch;
	ch = cin.get();
	while(ch!='\n'){
		cout<<ch;
		//cin>>ch;
		ch = cin.get();
	}
	cout<<endl;
}

void shortestpath(){
	int x = 0,y = 0;
	char ch;
	ch = cin.get();
	while(ch != '\n'){
		if(ch == 'n' or ch == 'N'){ y++; }
		else if(ch=='s' or ch =='S'){ y--; }
		else if(ch=='e' or ch=='E'){ x++; }
		else{ x--; }
		ch = cin.get();
	}
	cout<<"("<<x<<", "<<y<<")"<<endl;
	if(x>0 and y>0){ cout<<"displacement is possible"<<endl; }
	else{ cout<<"displacement is not possible"<<endl; }
	while(y>0){ cout<<"N"; y--; }	
	while(x>0){ cout<<"E"; x--; }
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
	Datatypmodifier(344);
	ftoctable(30);
	FndminmaxN();
	ptrn3();
	sqroot(3,3);
	readlineSpace();
	shortestpath();
	return 0;
}