#include <iostream>
#include<chrono>
#include<thread>

using namespace std;


//first program Hello World!.
void Namaste_world(){ cout<<"Namaste World!"; }

//simple clock program to understand system calls.
void Clock(){
	int hour,minute,seconds = 0;
	cin>>hour>>minute;
	while(true){
		system("clear");
		for(hour; hour<24; hour++){
			for(minute; minute<60; minute++){
				for(seconds=0; seconds<60; seconds++){
					system("clear");
					cout<<hour<<" : "<<minute<<" : "<<seconds<<endl;
					std::chrono::seconds dur(1);
					std::this_thread::sleep_for(dur);
				}
				seconds = 0;
			}
			minute = 0;
		}
	}
}

//the word algorithm first used in 1950.(euclid algorithm)
//before that algorism is used.
//algorism - process of doing airthematic using arabic no.
//algorithm <-> algorism + arithmetic.
int Euclid_algo(){
	//taking 2 positive integer.
	int m,n;
	cin>>m>>n;
	//finding the reminder but in this case (for integer).
	//if n completly div m then rem = 0 if not then r = m.
	int rem = m%n;
	//if reminder = 0 then return n to main func.
	if(rem == 0){ return n; }
	//else repeat till rem = 0.
	else{
		//repeat steps till rem != 0 is (false)
		while(rem != 0){
			//change value of m to n.
			m = n;
			//change value of n to rem.
			n = rem;
			//find rem of the new value (i.e n & rem).
			rem = m%n;
		}
		//when rem == 0 (true) or rem != 0 is (false)
		//return n (which n = rem)
		return n;
	}
}
int main(){
	int i = Euclid_algo();
	cout<<i;
	cout<<endl;
	return 0;
}