all: dsa cdsa fundamentals

dsa: CPP/dsa.cpp
	g++ -std=c++14 -o dsa CPP/dsa.cpp

cdsa: C/cdsa.c
	gcc  -o cdsa C/Data-Structures/Array.c C/cdsa.c
	
fundamentals: CPP/fundamentals.cpp
	g++ -std=c++14 -o fundamentals CPP/fundamentals.cpp

clean:
	rm *.o