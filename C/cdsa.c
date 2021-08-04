#include<stdio.h>
#include "./Data-Structures/ds.h"

void HelloWorld(){
	printf("Hello World!\n");
}
int Euclid_algo(){
	//taking 2 positive integer.
	int m,n;
	scanf("%d %d",&m,&n);
	//finding the reminder but in this case (for integer).
	//if n completly div m then rem = 0 if not then r = m.
	int rem = m%n;
	//if reminder = 0 then return n to main func.
	if(rem == 0){ return n; }
	//else repeat till rem = 0.
	else{
		//repeat steps till rem != 0 is (false)
		while(rem != 0){
			//change value of m to n.
			m = n;
			//change value of n to rem.
			n = rem;
			//find rem of the new value (i.e n & rem).
			rem = m%n;
		}
		//when rem == 0 (true) or rem != 0 is (false)
		//return n (which n = rem)
		return n;
	}
}


int main(){
<<<<<<< HEAD:C/cdsa.c
	HelloWorld();
=======
	int *arr;
	arr = Array(5);
	for(int i=0; i<5; i++){
		printf("%d, ",*(arr+i));
	}
>>>>>>> f15679c6bd816f39ad834b2afab8c2aef1135636:cdsa.c
	return 0;
}