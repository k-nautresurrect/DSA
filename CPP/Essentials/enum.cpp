#include<iostream>

using namespace std;

int main()
{
	// enum is our own data type
	enum Gender {Male, Female, Others};
	Gender g = Male;
	switch (g) {
	case Male:
		cout << "Male Selected";
		break;
	case Female:
		cout << "Female selected";
		break;
	default:
		cout << "Value can be male or female";
	}
	Gender h = Female;
	Gender o = Others;

	cout << g << " " << h << " " << o;
	cout << &g << " " << &h << " " << &o;

	return 0;
}