// Algorithm for insertion sort
/*
	1.for j=2 to A.length			take a pointer j to unsorted array, looping till n.	-->  c1*n
	2.	key = j 					asigning key. 										-->  c2*(n-1)
	3.	i = j-1						initialization and updation criteria for while loop -->  c3*(n-1)
	4.	while i>0 and A[i] > key    while loop to check position of key stopping.		-->  c4*𝛴(j=1 to n)(tj)
	5.		A[i+1] = A[i]			shifting elements as A[i] satisfy the condn.		-->  c5*𝛴(j=1 to n)(tj - 1)
	6.		i = i-1					check for every condn. till first element, so i--.  -->  c6*𝛴(j=1 to n)(tj - 1)
	7.	A[i+1] = key 				insert key on right pos, as uppr i-- so rgt pos i++.-->  c7*(n-1)
*/
#include<stdio.h>

int main() {
	int n;
	scanf("%d", &n);
	int a[n + 1];

	for (int i = 1; i <= n; i++) {
		scanf("%d", &a[i]);
	}

	for (int j = 2; j <= n; j++) {
		int key = a[j];
		int i = j - 1;

		while (i > 0 && a[i] > key) {
			a[i + 1] = a[i];
			i = i - 1;
		}

		a[i + 1] = key;

	}

	for (int i = 1; i <= n; i++) {
		printf("%d ", a[i]);
	}
}