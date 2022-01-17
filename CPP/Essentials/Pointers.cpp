/**
 * pointers are used to access the memory outside the program (i.e heap)
 * Refrences are also like pointers but little bit different (in java)
 * - accessing hardware, hardisks, other resources outside program
 * - these are useful in parameter passing
*/

#include<iostream>

using namespace std;

/**
 * assume a = +----------+
 *            | 10       |
 *            +----------+
 * refr   &a  |200...204.| decided by the type of variable
 *            +----------+
 *               ^
 *               |
 * now p = +-----------+
 *         | 200...204.|  decided by the type of pointer
 *         +-----------+
 * dref *p | 10        |
 * 		   +-----------+
*/

struct rectangle {
	int length;
	int width;
};

int main() {
	int a = 10;
	int *p; // declaration
	p = &a; // initializtion

	// dynamically locate memory
	int *ptr;
	/* malloc(5*sizeof(int)) */ // -> allocate the memory of 5*int in heap
	// malloc basically returns the void so we have to typecast it to deref int
	ptr = (int *) malloc(5 * sizeof(int));
	ptr = &a;

	// also in c++
	int *point;
	point = new int[5];
	point[0] = 2; point[1] = 24; point[2] = 90; point[3] = 98; point[4] = 89;

	for (int i = 0; i < 5; ++i) { cout << point[i] << " "; }
	cout << endl;
	cout << ptr << " " << *ptr <<  endl;
	cout << ptr + 1 << " " << ptr[1] << endl;
	delete[ ] point; // after we free it will not give segmentation fault

	cout << p << " " << *p << endl; // giving segmentation fault
	cout << &a << " " << a << endl;


	int *p1;
	char *p2;
	float *p3;
	double *p4;
	struct rectangle *p5;

	//pointers will always take equal amount of memory it doesn't depend on types.
	cout << sizeof(p1) << endl;
	cout << sizeof(p2) << endl;
	cout << sizeof(p3) << endl;
	cout << sizeof(p4) << endl;
	cout << sizeof(p5) << endl;

	return 0;
}