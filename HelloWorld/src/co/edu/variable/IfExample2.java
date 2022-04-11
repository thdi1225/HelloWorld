package co.edu.variable;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt();
		int result;
		
		if(num1 > num2) {
			result = num1-num2;
		}else {
			result = num2-num1;
		}
		
		System.out.println(result);
	}
}
