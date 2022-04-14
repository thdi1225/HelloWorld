package co.edu;

public class CalExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.printPI();
		c1.getArea(2.4);
		int result = c1.sum(1, 2);
		System.out.println("두수의 합 : " + result);

		double result1 = c1.sum(1.2, 2);
		System.out.println("두수의 합 : " + result1);

		double result2 = c1.getTriangleArea(11, 22.5);
		System.out.println(result2);

		int[] intArray = { 10, 20, 30, 40 };
		int result3 = c1.sum(intArray);
		System.out.println(result3);

		double result4 = c1.average(21, 23, 47);
		System.out.println(result4);

		double result5 = c1.average(21, 23, 47, 45, 97);
		System.out.println(result5);

	}
}
