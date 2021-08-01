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

int main(){
	Clock();
	cout<<endl;
	return 0;
}