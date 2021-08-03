#include<stdio.h>
#include "ds.h"

int * Array(int n){
	static int Arr[n];
	int i;
	for(i = 0; i < n; i++){
		scanf("%d",&Arr[i]);
	}
	return Arr;
}