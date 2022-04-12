package co.edu;

public class OperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		num1 = num1 +2; // num1의 값을 읽고 결과값을 대입.
		num1 = num1 +2; // num1의 값을 읽고 결과값을 대입.
		System.out.println(num1);
		
		num1 = num1 + 1;
		num1 += 1;
		num1++;
		System.out.println(num1);
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(++num1);
		
		int result = num1++ + ++num2; // 19 + 21
		System.out.println(result + ", num1 : " + num1 + ", num2 : " + num2);
		
		byte num3 = 10; // byte < short < int < long
		num3 = (byte) (num3 + 1); // 정수연산 int 타입으로 처리.
		
		num3 += 1;
		num3++;
		
		num3 = 125;
		num3++; // 126
		num3++; // 127
		num3++; // -128
		num3++; // -127
		num3++; // -126
		System.out.println(num3);

		num3 = -125;
		num3--; // -126
		num3--; // -127
		num3--; // -128
		num3--; // 127
		num3--; // 126
		System.out.println(num3);
	}
}
