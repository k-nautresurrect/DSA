// Algorithm
/*
	merge(A, p, q, r)
	1. n1 = p - q + 1
	2. n2 = r - q
	3. let l[n1 + 1] and r[n2 + 1] be an array
	4. for i = 1 to n1
	5.	 l[i] = A[i]
	6. for j = 1 to n2
	7.	 r[i] = A[q + j]
	8. l[n1 + 1] = inf
	9. r[n2 + 1] = inf
   10. i = j = 1
   11. for i=k to r
   12. 	 if l[i] <= a[k]
   13.	 	A[k] = l[i]
   14. 		i = i+1
   15. 	 else A[k] = r[j]
   16.			  j = j + 1


   merge-sort(A,p,r)
   1. if p < r
   2. 	q = ⎣(p + r) / 2⎦
   3. 	merge-sort(A,p,q)
   4.   merge-sort(A,q+1,r)
   5.   merge(A,p,q,r)
*/

#include <stdio.h>
#include <limits.h>

int cntr = 0, cntrms = 0, cntrms2 = 0;
void merge(int A[], int p, int q, int r ) {
	int n1 = p + q - 1, n2 = r - q;
	int L[n1 + 1], R[n2 + 1];

	for (int i = 1; i <= n1; i++) {
		L[i] = A[i];
	}

	for (int i = 1; i <= n2; i++) {
		R[i] = A[q + i];
	}

	//L[n1 + 2] = INT_MAX;
	//R[n2 + 2] = INT_MAX;
	int i = 1, j = 1;

	for (int k = p; k <= r; k++) {
		if (L[i] <= R[j]) {
			A[k] = L[i];
			i = i + 1;
		} else {
			A[k] = R[j];
			j = j + 1;
		}
	}
}

void merge_sort(int A[], int p, int r) {
	cntr++;
	printf("if count :%d -> p = %d, r = %d\n", cntr, p, r);
	if (p < r) {
		int q = (p + r) / 2;
		printf("	q updation that will change to r :%d -> p = %d, q = %d, r = %d\n", q, p, q, r);
		merge_sort(A, p, q);
		cntrms++;
		printf("		%d. ms1(r = q) -> p = %d, q = %d, r = %d\n", cntrms, p, q, r);
		for (int i = p; i <= q; i++) { printf("%d ", A[i]); }
		printf("\n  	p updation that will change to q+1 :%d -> p = %d, q = %d, r = %d\n", q, p, q, r);
		merge_sort(A, q + 1, r);
		cntrms2++;
		printf("\n		%d. ms2(p = q+1) -> p = %d, q = %d, r = %d\n", cntrms2, p, q, r);
		for (int i = q + 1; i <= r; i++) { printf("%d ", A[i]); }

	}
}

int main() {
	int n;  scanf("%d", &n);
	int A[n + 1], p = 1, r = n + 1;

	for (int i = 1; i <= n; i++) {
		scanf("%d", &A[i]);
	}
	merge_sort(A, p, r);

	for (int i = 1; i <= n; i++) {
		printf("%d ", A[i]);
	}

	return 0;
}