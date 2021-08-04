#include<stdio.h>
#include "ds.h"
extern int Arr[5];

int * Array(){
	int i;
	for(i = 0; i < 5; i++){
		scanf("%d",&Arr[i]);
	}
	return Arr;
}

void PrintArray(){
	int i;
	for(i=0; i<5; i++){
		printf("%d",*Arr[i]);
	}
}