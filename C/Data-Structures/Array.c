#include<stdio.h>
#include<ctype.h>

struct Array{
	int element;
	int arr[100];	

};

void PrintArray(struct Array a){
	char flag = 'N';
	printf("[T] for traversing\n[R] for reverse traversing\n: ");
	//in scanf it is scanning whitespace thats why white space is added .
	scanf(" %c",&flag);
	if(tolower(flag)=='r'){
		puts("\nTransversed reverse : ");
		for(int i = a.element-1; i >= 0; i--){
			printf("%d ",a.arr[i]);
		}
	}	
	if(tolower(flag)=='t'){
		puts("\nTraversed: ");
		for(int i = 0; i < a.element; i++){
			printf("%d ",a.arr[i]);
		}
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

