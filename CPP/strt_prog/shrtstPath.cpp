#include<iostream>

using namespace std;

int main() {
	char ch;
	ch = cin.get();
	int x = 0, y = 0;
	while (ch != '\n') {
		if (ch == 'n' or ch == 'N') { y++; }
		else if (ch == 's' or ch == 'S') { y--; }
		else if (ch == 'e' or ch == 'E') { x++; }
		else { x--; }
		ch = cin.get();
	}
	cout << "(" << x << ", " << y << ")" << "\n";
	return 0;
}