#include<bits/stdc++.h>

using namespace std;

//finding duplicate no. in an array of N+1 integer(without modifing the array)
//(if array is of size of n then all element is in range 1 to n-1)
//only one no. is duplicate.
int dupnoGreedy(vector<int> &arr){
	int i,j;
	for(i = 0; i<arr.size(); i++ ){
		for(j = i+1; j<arr.size(); j++){
			if(arr[i] == arr[j]){ 
				return arr[j];
			}
		}
	}
}// time complexity: O(n^2), space complexity: O(1)
//warning: control reaches end of non-void function [-Wreturn-type]
//	this warning means that we have to return something from a non void function
//  however we have returned but in between the loop not outside the scope of loop.

int dupnoHash(vector<int> &arr){
	vector<int> hash(arr.size(),0);
	for(int i = 0; i<arr.size(); i++){
		hash[arr[i]] += 1;
		if(hash[i]>1){ return i; }
	}
}// time complexity: O(n), space complexity: O(n)

int dupnoCycledtct(vector<int> &arr){
	int slow = arr[0];
	int fast = arr[0];
	do{
		slow = arr[slow];
		fast = arr[arr[fast]];
	} while(slow != fast);

	slow = arr[0];
	while(slow != fast){
		slow = arr[slow];
		fast = arr[fast];
	}

	return slow;

}// time complexity: O(n), space complexity: O(1)

int main(){
	vector<int> vec{1,2,4,3,4};
	int dupno = dupnoGreedy(vec);
	int hashdupno = dupnoHash(vec);
	int cycledupno = dupnoCycledtct(vec);
	cout<<dupno<<" "<<hashdupno<<" "<<cycledupno;
	return 0;
}