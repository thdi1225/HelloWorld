package co.edu.except;

import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("1.추가 2.종료");
			System.out.print("선택 >> ");
			
			try {
				menu = scn.nextInt();
			} catch (Exception e) {
				System.out.println("잘못된 입력값입니다.");
				scn.nextLine();
			} finally {
				System.out.println("예외처리에서 반드시 한번 실행");
			}
			
			if(menu == 1) {
				System.out.println("추가작업");
			}else if(menu == 2) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
