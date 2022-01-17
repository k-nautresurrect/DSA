#include<iostream>

using namespace std;

// virtual
class neev {
public:
	virtual void canbe() {
		cout << "!overridden" << endl;
	}
	void show() { cout << "hey" << endl; }

};

class makaan: public neev {
public:
	void canbe() {
		cout << "overrided" << endl;
	}
	void show() { cout << "makaan" << endl; }
};

/**************************************/
// friend
class oopfun {
private:
	int al;

public:
	oopfun() { al = 20; }
	friend class second;
	friend void printpass(oopfun pass);
};

// friend function
void printpass(oopfun pass) {
	cout << pass.al << endl;
}

// friend class
class second {
public:
	void show_oopfun(oopfun &pass) {
		cout << pass.al << endl;
	}
};


int main() {
	oopfun op;
	second sc;
	sc.show_oopfun(op);
	printpass(op);

	neev *ptr_neev;
	makaan m;
	// ptr_neev->canbe();

	ptr_neev = &m;

	ptr_neev->canbe();
	ptr_neev->show();
	return 0;
}