#include<stdio.h>

int main() {
	int arr[] = {2, 4, 8, 9};
	int n = sizeof(arr) / sizeof(arr[0]);

	printf("%d\t%d\n", sizeof(arr), sizeof(arr[0]));
	printf("%d\n", n);

	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	for (int i = 0; i < n; i++) {
		printf("%d ", i[arr]);
	}
	printf("\n");

	printf("%d", *(arr + 4));
}