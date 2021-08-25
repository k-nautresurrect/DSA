#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include"fndmntl.h"

int sum(int a,int b){ return a+b; }
int bitsum(int a,int b){
	while(b != 0){
		unsigned carry = a & b;
		a = a ^ b;
		b = carry << 1;
	}
	return a;
}
int sub(int a, int b){ return a-b; }
int bitsub(int a,int b){
	while(b != 0){
		int borrow = (~a) & b;
		a = a ^ b;
		b = borrow << 1; 
	}
	return a;
}