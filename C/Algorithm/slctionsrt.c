// Algorithm for selection sort.
/*
	1.for i=1 to A.length		take a pointer i to the whole unsorted array, looping till n. --> c1*n
	2.	min = +infinity			declare min +inf, to make sure every no. is smaller than min. --> c2*(n-1)
	3.  for j=i to A.length     take 2nd pointer j for the sorted array, looping till n.      --> c3*(n-1)*(n)
	4.		if min > A[j]		check the condition, if min < A[j] then min is minimum no. 	  --> c4*(n-1)*(n-1)
	5.			min = A[j]      update min with the no. it is greater than.                   --> c5*(n-1)*(n-1)
	6.			j = indx		store the index where min is the smallest.        		      --> c6*(n-1)*(n-1)
	7.		A[indx] = A[i]      update value at which smallest is found to the ith pos.       --> c7*(n-1)
	8.		A[i] = min          update value at i to the minimum element.					  --> c8*(n-1)
*/
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