package co.edu.condition;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int randomVal = (int) (Math.random() * 6) + 1;
		System.out.println("1~6에 해당 하는 숫자를 입력하세요.");
		int num = scn.nextInt();
		
		if(num == randomVal) {
			System.out.println("맞췄습니다.");
		}else {
			System.out.println("틀렸습니다.");
			System.out.println(randomVal + "입니다.");
		}
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("1.가위 2.바위 3.보에 해당하는 숫자를 입력하세요.");
		int randomVal1 = (int) (Math.random() * 3) + 1;
		int userVal1 = scn.nextInt();
		if((randomVal1 == 1 && userVal1 == 2) || (randomVal1 == 2 && userVal1 == 3) || (randomVal == 3 && userVal1 == 1)) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
			if(randomVal1 == 1) {
				System.out.println("가위였습니다.");
			}else if(randomVal1 == 2) {
				System.out.println("바위였습니다.");
			}else if(randomVal1 == 3) {
				System.out.println("보였습니다.");
			}
		}
	}
}