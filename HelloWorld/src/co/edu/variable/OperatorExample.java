package co.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		int result = 6/4;
		int result2 = 6%4;
		int val = 5;
		if(val % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		int cashe = 75300;
		int num1 = cashe / 50000;
		int num2 = cashe;
		
		if(num1 == 0) {
			System.out.println("5만원권 : " + 0);
		}else {
			System.out.println("5만원권 : " + num1);
			num2 = cashe % 50000;
		}
		
		int num3 = num2 / 10000;
		int num4 = num2;
		
		if(num3 == 0) {
			System.out.println("1만원권 : " + 0);
		}else {
			System.out.println("1만원권 : " + num3);
			num4 = num2 % 10000;
		}
		
		int num5 = num4 / 5000;
		int num6 = num4;
		
		if(num5 == 0) {
			System.out.println("5천원권 : " + 0);
		}else {
			System.out.println("5천원권 : " + num5);
			num6 = num4 % 5000;
		}
		
		int num7 = num6 / 1000;
		int num8 = num6;
		
		if(num7 == 0) {
			System.out.println("1천원권 : " + 0);
		}else {
			System.out.println("1천원권 : " + num7);
			num8 = num6 % 1000;
		}
		
		int num9 = num8 / 500;
		int num10 = num8;
		if(num9 == 0) {
			System.out.println("5백원권 : " + 0);
		}else {
			System.out.println("5백원권 : " + num9);
			num10 = num8 % 1000;
		}
		
		int num11 = num10 / 100;
		if(num11 == 0) {
			System.out.println("백원권 : " + 0);
		}else {
			System.out.println("백원권 : " + num11);
		}		
	}
}
