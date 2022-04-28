package co.micol.prj.controller;

import java.util.Scanner;

import co.micol.prj.conn.Oracle;
import co.micol.prj.vo.UserVO;

public class UserController {
	Oracle oracle = new Oracle();
	Scanner scn = new Scanner(System.in);

	public void run() {
		mainMenu();
	}
	
	private void mainMenu() {
		oracle.getConnection();

		int menu = 0;
		int subMenu = 0;
		String id; 
		String password;
		String name;
		String phone;
		String address;
		String email;
		
		while(true) {
			System.out.println("1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기 5.종료");
			System.out.println("===============================================");
			try {
				menu = Integer.parseInt(scn.nextLine());
			}catch (Exception e) {
				
			}
			
			if(menu == 1) {
				System.out.println("id를 입력하세요.");
				id = scn.nextLine();
				System.out.println("password를 입력하세요.");
				password = scn.nextLine();
				
				UserVO vo = new UserVO(id, password);
				
				boolean isLogin = oracle.login(vo);
				
				if(isLogin){
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}else if(menu == 2){
				System.out.println("1.관리자 회원가입 2.일반 회원가입");
				subMenu = Integer.parseInt(scn.nextLine());
				
				if(subMenu == 1) {
					System.out.print("아이디");
					id = scn.nextLine();
					System.out.print("비밀번호");
					password = scn.nextLine();
					System.out.print("이름");
					name = scn.nextLine();
					System.out.print("전화번호");
					phone = scn.nextLine();
					System.out.print("주소");
					address = scn.nextLine();
					System.out.print("이메일");
					email = scn.nextLine();
					
					UserVO vo = new UserVO(id, password, name, phone, address, email, 1);
					
					oracle.userInsert(vo);
				}else if(subMenu == 2) {
					System.out.print("아이디");
					id = scn.nextLine();
					System.out.print("비밀번호");
					password = scn.nextLine();
					System.out.print("이름");
					name = scn.nextLine();
					System.out.print("전화번호");
					phone = scn.nextLine();
					System.out.print("주소");
					address = scn.nextLine();
					System.out.print("이메일");
					email = scn.nextLine();
					
					UserVO vo = new UserVO(id, password, name, phone, address, email, 2);
					
					oracle.userInsert(vo);
				}
			}else if(menu == 3){
				
			}else if(menu == 4){
				
			}else if(menu == 5){
				break;
			}else {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
		}
		System.out.println("프로그램을 종료하였습니다.");
		oracle.getDisConnection();
		scn.close();
	}
}
