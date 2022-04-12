package co.edu.loop;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		int money = 0;
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택>>>>>>>");
			int exe = Integer.parseInt(scn.nextLine());
			if(exe == 1) {
				System.out.print("예금액>");
				balance = Integer.parseInt(scn.nextLine());
			}else if(exe == 2) {
				System.out.print("출금액>");
				money = Integer.parseInt(scn.nextLine());
				if(balance >= money) {
					balance = balance - money;
				}else {
					System.out.println("잔액을 초과하셨습니다.");
				}
			}else if(exe == 3) {
				System.out.println("잔고는 " + balance + "원 입니다.");
			}else if(exe == 4) {
				run = false;
			}else {
				System.out.println("사용하실 수 없는 메뉴입니다.");
				continue;
			}
		}
		
		System.out.println("종료합니다.");
	}
}
