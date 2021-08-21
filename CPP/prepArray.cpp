#include<bits/stdc++.h>

using namespace std;

//finding duplicate no. in an array of N+1 integer(if array is of size of n then all element is in range 1 to n-1)
void dupnoGreedy(vector<int> &arr){
	for(int i = 0; i<arr.size(); i++ ){
		for(int j = i+1; j<arr.size(); j++){
			if(arr[i] == arr[j]){ 
				cout<<arr[j];
				break;
			}
		}
	}
}

int main(){
	vector<int> vec{1,2,4,3,4};
	dupnoGreedy(vec);
	return 0;
}