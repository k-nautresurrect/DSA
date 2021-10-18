/*  you are given a list of N number and Q queries.
	Each query is specified by 2 number i and j .
	the awnser to each query is the sum of every no,
	btw i and j (inclusive)
	N <= 10^5
	Q <= 10^4
	0 <= i, j <= N-1
	time limit : 7,6,5   //prefix-sum -> prefixsum [1,5,10,16]
	time limit : 10,11,12

*/
/*	input
	4 3
	1 4 5 6  [1,5,10,16]
	0 2
	1 3
	1 1

    10, pre[j] - pre[(i-1)] => 15,4 case if(0) -> pre[j]


	output
	10
	15
	4
*/
/*
	1. n , q             ----> O(1)
	2. arr[n]            ----> O(n)
	3. while(q-- > 0)    ----> O(q)
	4. 	i, j, sum        ----> O(1 * q)
	5.  for(i -> j)      ----> O(q * (j-i+1)) !
	6.   sum += arr[i]   ----> O(q * (j-i+1)) !
	7.  prnt(sum)        ----> O(q)

    O(Q * N) => 10^9 => 10
	O(Q) => 10^4
	1sec = 10^8

*/
