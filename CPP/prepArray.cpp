#include<bits/stdc++.h>

using namespace std;
//problem 1 ->
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

//problem -> 2
//sort an array of 0's 1's and 2's without using extra space or sorting algorithm
void countSrt(vector<int> &arr){
	int cnt0 = 0, cnt1 = 0, cnt2 = 0;
	for (int i = 0; i<=arr.size(); i++){
		if(arr[i]==0){ cnt0++; }
		else if(arr[i]==1){ cnt1++; }
		else{ cnt2++; }
	}
	for (int i = 0; i<cnt0; i++){ cout<<0<<" ";	}
	for (int i = 0; i<cnt1; i++){ cout<<1<<" "; }
	for (int i = 0; i<cnt2; i++){ cout<<2<<" "; }
}//time complexity: O(2*n), space complexity: O(1)

void dutchflagSrt(vector<int> &arr){
	int low = 0, mid = 0, high = arr.size()-1, temp;
	while(mid<=high){
		if(arr[mid]==0){
			temp = arr[low];
			arr[low] = arr[mid];
			arr[mid] = temp;
			low++;
			mid++;
		}
		else if(arr[mid]==1){
			mid++;
		}
		else{
			temp = arr[mid];
			arr[mid] = arr[high];
			arr[high] = temp;
			high--;
		}
	}
}//time complexity: O(n), space Complexity: O(1)

//problem -> 3
//repeat and missing no. in array
//given an unsorted array of n where elements are from 1 to n
//find which element is not there in array and which one is repeated.
void missnrepHash(vector<int> &arr){
	vector<int> hash(arr.size()+1,0);
	for(int i=0; i<arr.size(); i++){
		hash[arr[i]] += 1;
	}
	for(int i=1; i<arr.size()+1;i++){
		if(hash[i]>1){ cout<<"repeated "<<i<<"\n"; }
		if(hash[i]==0){ cout<<"missing "<<i<<"\n"; }
	}
}//time complexity: O(n)+O(n), Space complexity: O(n+1)

void missnreSum(vector<int> &arr){
	int n = arr.size();
	int sumn = (n*(n+1))/2, sumn2 = (n*(n+1)*(2*n+1))/6, sumarr=0, sumarr2=0;
	for(int i=0; i<arr.size(); i++){
		sumarr += arr[i];
		sumarr2 += pow(arr[i],2);
	}
	int c1=sumn-sumarr, c2=sumn2-sumarr2;
	int eq1=c1, eq2 = c2/c1;
	cout<<"missing "<<(eq1+eq2)/2<<" "<<"repeated "<<eq1-((eq1+eq2)/2)<<endl;
}//time complexity: O(n), space complexity: O(1) ->only work for one missing no.
//debug logs -> check after elimination if it is zero or not. if zero then find by other eq.
//           -> it will return biggest missing no.(total difference in which smaller ones are combined)

int main(){
	vector<int> pb1{1,2,4,3,4};
	vector<int> pb2{0,0,1,1,1,1,1,2,0,0,0,2};
	vector<int> pb3{4,1,6,2,1,1};
	int dupno = dupnoGreedy(pb1);
	int hashdupno = dupnoHash(pb1);
	int cycledupno = dupnoCycledtct(pb1);
	countSrt(pb2);
	dutchflagSrt(pb2);
	missnrepHash(pb3);
	missnreSum(pb3);
	for(int i=0;i<pb2.size();i++){ cout<<"|"<<pb2[i]<<" "; }
	cout<<"\n"<<dupno<<"\n"<<hashdupno<<"\n"<<cycledupno;
	return 0;
}