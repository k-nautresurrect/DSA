all: dsa cdsa

dsa: dsa.cpp
	g++ -std=c++14 -o dsa dsa.cpp

cdsa: cdsa.c
	gcc -std=c17 -o cdsa cdsa.c
	