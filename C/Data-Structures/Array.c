#include<stdio.h>

struct Array{
	int element;
	int arr[100];	

};

void PrintArray(struct Array a){
	puts("Traversed: ");
	for(int i = 0; i < a.element; i++){
		printf("%d ",a.arr[i]);
	}
}

void array(int n){
	struct Array a;
	a.element = n;
	for(int i = 0; i < a.element; i++){
		scanf("%d",&a.arr[i]);
	}
	PrintArray(a);
}

