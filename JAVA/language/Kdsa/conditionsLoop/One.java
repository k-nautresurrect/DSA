import java.util.*;
import java.lang.*;
import java.io.*;

public class One {
	public static void main(String[] args) {
		var arg = new Scanner(System.in);
		int r = arg.nextInt();
		int a = arg.nextInt();
		int b = arg.nextInt();
		int c = arg.nextInt();
		System.out.println(String.format("%.4f", Area.cirlArea(r)));
		System.out.println(String.format("%.4f", Area.triArea(a, b, c)));
	}
}

class Area {
	public static double cirlArea(double r) {
		return (Math.PI * r * r);
	}

	public static double triArea(double a, double b, double c) {
		double s = (a + b + c) / 2;
		if ((a + b) > c && (b + c) > a && (a + c) > b) {
			return (s * (s - a) * (s - b) * (s - c));
		} else {
			return -1;
		}
	}

	public static double rectArea(double a, double b) {
		return (a * b);
	}

	public static double isoclTri(double a, double b) {

	}
}