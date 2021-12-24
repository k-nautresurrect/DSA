#include<stdlib.h>
#include<iostream>

namespace name {
int x = 10;
/*struct Rectangle rname;*/ // not in scope of std
}

using namespace std;

struct Rectangle {
	int length;
	int breadth;
} rglob, rglob2, rglob3; // same as below

struct Rectangle rdash; // along the whole program

int main() {
	struct Rectangle r1; // inside main function
	struct Rectangle r2 = {45, 68};

	r1.length = 3;
	r1.breadth = 5;
	rdash = {5, 8};

	cout << sizeof(r1) << " " << sizeof(r2) << endl;
	cout << rdash.length << " " << rdash.breadth << endl;
	cout << name::x << endl;
	return 0;

}