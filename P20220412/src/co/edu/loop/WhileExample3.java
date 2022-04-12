package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int randomVal = (int) (Math.random() *10 + 1);	
		boolean isTrue = true;
		System.out.println("1~10사이의 숫자를 입력하세요.");
		while (isTrue) {
			
			int userVal = scn.nextInt();
			
			if(userVal > 10){
				System.out.println("1~10사이의 숫자를 입력하세요.");
				continue;
			}
			
			if(userVal == randomVal) {
				System.out.println("정답입니다.");
				isTrue = false;
				continue;
			}else if(userVal > randomVal){
				System.out.println("입력하신 숫자가 랜덤 값보다 큽니다.");
			}else if(userVal < randomVal){
				System.out.println("입력하신 숫자가 랜덤 값보다 작습니다.");
			}
		}
	}
}
