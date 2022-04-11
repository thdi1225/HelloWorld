package co.edu.variable;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		double avg;
		
		System.out.println("첫번째 값을 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두번째 값을 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세번째 값을 입력하세요.");
		num3 = scn.nextInt();
		
		avg = (num1 + num2 + num3) / 3.0;
		
		System.out.println("입력한 세 정수는 " + num1 + ", " + num2 + ", " + num3 + " 이고 평균은 " + avg + "입니다.");
		System.out.printf("입력한 세 정수는 %d, %d, %d 이고 평균은 %.5f 입니다.", num1, num2, num3, avg);
	}
}
