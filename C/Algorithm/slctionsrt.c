#include <stdio.h>
#include <limits.h>

int main() {
	int n, i, j, temp, min;

	scanf("%d", &n);
	int arr[n + 1];

	for (int i = 1; i <= n; i++) {
		scanf("%d", &arr[i]);
	}

	for (i = 1 ; i <= n; i++) {
		min = INT_MAX;
		for (j = i; j <= n; j++) {
			if (min > arr[j]) {
				min = arr[j];
				temp = j;
			}
		}
		arr[temp] = arr[i];
		arr[i] = min;
	}

	for (int i = 1; i <= n; i++) {
		printf("%d ", arr[i]);
	}
	return 0;
}