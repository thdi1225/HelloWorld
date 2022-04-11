package co.edu.variable;

import java.util.Scanner;

public class ChangeCToF {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("화씨 온도를 입력하세요.");
		int f = scn.nextInt();
		
		double c = 5/9.0*(f-32);
		
		System.out.printf("섭씨 온도는 %.1f 입니다.", c);
	}
}
