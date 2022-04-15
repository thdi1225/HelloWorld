package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요.
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 코드 작성.
		int result = 0;
		
		System.out.print("첫번째 수 : ");
		int num1 = Integer.parseInt(scn.nextLine());
		
		System.out.print("두번째 수 : ");
		int num2 = Integer.parseInt(scn.nextLine());
		
		System.out.print("세번째 수 : ");
		int num3 = Integer.parseInt(scn.nextLine());
		
		if(num1 > num2) {
			if(num1 > num3) {
				result = num1;
			}else {
				result = num3;
			}
		}else {
			if(num2 > num3) {
				result = num2;
			}else {
				result = num3;
			}
		}
		
		System.out.println("3 수 중에서 가장 큰값은 " + result + "입니다.");
	}
}
