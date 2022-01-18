#include<iostream>

using namespace std;


struct rectangle {
	int length;
	int width;
};
int main() {
	struct rectangle r = {10, 5};

	// this is also valid.
	rectangle rec = {8, 15};
	struct rectangle *ptr = &r; // pointer can only be assigned by adress

	r.length = 15;
	/*
		p.length = 20; not valid because p is pointer having adress of r
	*/
	//*ptr.length = 20; // wrong, because . has higher precedence than *
	(*ptr).length = 20;
	// simple way to access using ->
	ptr->length = 30;

	cout << r.length << endl;

	// Dynamic allocation in heap
	struct rectangle *point;
	// malloc(sizeof(struct rectangle)) // returns void pointer.
	point = (struct rectangle *)malloc(sizeof(struct rectangle)); // C like
	point->length = 15;
	point->width = 30;

	struct rectangle *pointer;
	pointer = new rectangle;
	pointer->length = 30;
	pointer->width = 40;

	cout << pointer->length << " " << pointer->width << endl;

	cout << point->length << " " << point->width << endl;
	return 0;
}