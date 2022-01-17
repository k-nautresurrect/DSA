#include<iostream>
#include<string>

using namespace std;

class cl {
public:
	int num;
	string name;
};

int main() {
	cl obj;
	obj.num = 100;
	obj.name = "Anand";
	cout << obj.num << " " << &(obj.num) << endl;
	cout << obj.name << " " << &(obj.name) << endl;

	cout << &obj << endl;

	cl *obj2;
	string n = "Richard";
	string *name = &n;
	obj2->name = *name;
	obj2->num = 89;
	cl obj3;
	obj3.name = obj2->name;
	obj3.num = obj2->num;

	cout << obj3.name << endl;
	return 0;
}