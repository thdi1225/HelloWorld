package co.edu.condition;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = scn.nextInt();
		
		if(num >= 90) {
			if(num >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
		}else if(num >= 80) {
			if(num >= 85) {
				System.out.println("B+학점");
			}else {
				System.out.println("B학점");
			}
		}else if(num >= 70) {
			if(num >= 75) {
				System.out.println("C+학점");
			}else {
				System.out.println("C학점");
			}
		}else {
			System.out.println("F학점");
		}
	}
}
