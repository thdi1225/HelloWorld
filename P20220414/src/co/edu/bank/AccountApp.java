package co.edu.bank;

import java.util.Scanner;

public class AccountApp {
	Account[] accounts = new Account[100];
	
	public void execute() {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			int menu = 0;
			System.out.println("------------------------------------");
			System.out.println("1.계좌 생성 2.계좌목록 3.입금 4.출금 5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				
			}
			
			System.out.println("--------");
			if(menu == 1) {
				Account account = new Account();
				
				System.out.println("계좌생성");
				System.out.println("--------");
				System.out.print("계좌번호 : ");
				String bankNo = scn.nextLine();
				
				System.out.print("계좌주 : ");
				String bankName = scn.nextLine();
				
				System.out.print("초기입금액 : ");
				int balance = Integer.parseInt(scn.nextLine());
				
				account.setBankNo(bankNo);
				account.setBankName(bankName);
				account.setBalance(balance);
				
				createAccount(account);
			}else if(menu == 2) {
				System.out.println("계좌목록");
				System.out.println("--------");
				
				listAccount();
			}else if(menu == 3) {
				Account account = new Account();
				System.out.println("예금");
				System.out.println("--------");
				
				System.out.print("계좌번호 : ");
				String bankNo = scn.nextLine();

				System.out.print("예금액 : ");
				int balance = Integer.parseInt(scn.nextLine());
				
				account.setBankNo(bankNo);
				account.setBalance(balance);
				
				deposit(account);
			}else if(menu == 4) {
				Account account = new Account();
				System.out.println("출금");
				System.out.println("--------");
				
				System.out.print("계좌번호 : ");
				String bankNo = scn.nextLine();

				System.out.print("예금액 : ");
				int balance = Integer.parseInt(scn.nextLine());
				
				account.setBankNo(bankNo);
				account.setBalance(balance);
				
				posit(account);
			}else if(menu == 5) {
				System.out.println("프로그램을 종료하겠습니다.");
				isTrue = false;
			}else {
				System.out.println("잘못된 메뉴입니다.");
			}
		}
	}
	
	public void createAccount(Account account) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				if(accounts[i].getBankNo().equals(account.getBankNo())) {
					System.out.println("결과 : 등록된 계좌번호입니다.");
					break;
				}
			}else if(accounts[i] == null) {
				accounts[i] = account;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	public void deposit(Account account) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getBankNo().equals(account.getBankNo())) {
				accounts[i].setBalance(accounts[i].getBalance()+account.getBalance());
				System.out.println("결과 : 예금이 성공되었습니다.");
				break;
			}else {
				System.out.println("결과 : 조회된 계좌가 없습니다.");
				break;
			}
		}
	}
	
	public void posit(Account account) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getBankNo().equals(account.getBankNo())) {
				if(accounts[i].getBalance() > account.getBalance()) {
					accounts[i].setBalance(accounts[i].getBalance()-account.getBalance());
					System.out.println("결과 : 출금이 성공되었습니다.");
					break;
				}else {
					System.out.println("결과 : 출금액이 잔액보다 큽니다.");
					break;
				}
			}else {
				System.out.println("결과 : 조회된 계좌가 없습니다.");
				break;
			}
		}
	}
	
	public void listAccount() {
		for(Account vo : accounts) {
			if(vo != null) {
				System.out.printf("%s %s %d \n", vo.getBankNo(), vo.getBankName(), vo.getBalance());
			}
		}
	}
}
