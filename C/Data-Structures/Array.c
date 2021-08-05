#include<stdio.h>

int * Array(){
	int n,i;
	scanf("size : %d",&n);
	int arr[n];
	for (i = 0; i < n; i++){
		scanf("%d",&arr[i]);
	}
	return arr;
}

