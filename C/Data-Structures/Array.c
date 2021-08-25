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

int search(struct Array a,int n){
	int Element;
	char flag;
	puts("\nSearching element\nEnter the number to find: ");
	scanf("%d",&Element);
	puts("type\n[L] for linear search\n[B] for binary search\n: ");
	scanf(" %c",&flag);
	if(tolower(flag)=='l'){
		for(int i = 0; i < a.element; i++){
			if(a.arr[i] == Element){ return i+1; }
		}
	}
	else if (tolower(flag) == 'b') {
		int low = 0, high = n;
		while(low <= high){
			int mid = (low + (high-1))/2;
			if(a.arr[mid] == Element){ return mid; }
			else if(a.arr[mid] < Element){ low = mid + 1; }
			else{ high = mid - 1; }
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
	int searched = search(a,n);
	printf("%d",searched);
}

