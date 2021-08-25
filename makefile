all: dsa cdsa fundamentals prepArray

dsa: CPP/dsa.cpp
	g++ -std=c++14 -o dsa CPP/dsa.cpp

cdsa: C/cdsa.c
	gcc  -std=c17 -o cdsa C/Data-Structures/Array.c C/cdsa.c
	
fundamentals: CPP/fundamentals.cpp
	g++ -std=c++14 -o fundamentals CPP/fundamentals.cpp

prepArray: CPP/prepArray.cpp
	g++ -std=c++14 -o prepArray CPP/prepArray.cpp

clean:
	rm *.o