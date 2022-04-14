package co.edu;

public class Calculator {
	private double pi = 3.14;
	
	void printPI() {
		System.out.println("원주율은 " + pi);
	}
	
	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름 " + radius + "의 넓이는 " + area);
	}
	
	int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	double sum(double n1, double n2) {
		return n1 + n2;
	}
	
	double getTriangleArea(double height, double width) {
		return (height * width) / 2;
	}
	
	int sum(int[] intarray) {
		int result = 0;
		for(int i = 0; i < intarray.length; i++) {
			result += intarray[i];
		}
		return result;
	}
	
	double average(int n1, int n2, int n3) {
		double result = 0;
		result = (n1+n2+n3)/3.0;
		
		return result;
	}
	
	double average(int... args) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return (double) sum / args.length;
		
	}
}