all: dsa cdsa

dsa: CPP/dsa.cpp
	g++ -std=c++14 -o dsa CPP/dsa.cpp

cdsa: C/cdsa.c
	gcc -std=c17 -o cdsa C/Data-Structures/Array.c C/cdsa.c
	