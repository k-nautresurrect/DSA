#include<stdio.h>

int main(){
	int n;
	scanf("%d",&n);
	int a[n+1];

	for(int i = 1; i <= n; i++){
		scanf("%d",&a[i]);
	}

	for(int j = 2; j <= n; j++){
		int key = a[j];
		int i = j-1;

		while(i > 0 && a[i] > key){
			a[i + 1] = a[i];
			i = i-1;
		}

		a[i+1] = key;

	}

	for(int i = 1; i <= n; i++){
		printf("%d ",a[i]);
	}
}