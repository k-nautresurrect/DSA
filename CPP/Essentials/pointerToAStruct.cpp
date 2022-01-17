#include<iostream>

using namespace std;


struct rectangle {
	int length;
	int width;
};
int main() {
	struct rectangle r = {10, 5};
	struct rectangle *ptr = &r; // pointer can only be assigned by adress

	r.length = 15;
	/*
		p.length = 20; not valid because p is pointer having adress of r
	*/
	//*ptr.length = 20; // wrong, because . has higher precedence than *
	(*ptr).length = 20;
	ptr->length = 30;

	cout << r.length << endl;

	// Dynamic allocation
	struct rectangle *point;
	// malloc(sizeof(struct rectangle)) // returns void pointer.
	point = (struct rectangle *)malloc(sizeof(struct rectangle));
	return 0;
}