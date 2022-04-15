package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
public class Exam5 {
	public static void main(String[] args) {
		Exam4[] exams = new Exam4[10];
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		
		while (true) {
			System.out.println("1.추가 2.수정(이름으로 연락처 수정) 3.삭제(이름) 4.조회(이름) 5.종료");
			System.out.print("선택 > ");
			menu = Integer.parseInt(scn.nextLine());

			if(menu == 1) { //------------------------------------------------------- 추가
				System.out.print("이름 : ");
				String name = scn.nextLine();
				
				System.out.print("생일 : ");
				String birthday = scn.nextLine();
				
				System.out.print("연락처 : ");
				String phone = scn.nextLine();
				
				Exam4 vo = new Exam4(name, birthday, phone);
				
				for(int i = 0; i < exams.length; i++) {
					if(exams[i] == null) {
						exams[i] = vo;
						break;
					}else {
						if(exams[i].getPhone().equals(phone)) {
							System.out.println("등록된 연락처 입니다.");
							break;
						}
					}
				}
			}else if(menu == 2) { //------------------------------------------------------- 수정
				System.out.print("이름 : ");
				String name = scn.nextLine();
				
				System.out.print("연락처 : ");
				String phone = scn.nextLine();

				boolean isTrue = true;
				
				for(int i = 0; i < exams.length; i++) {
					if(exams[i] != null) {
						if(exams[i].getPhone().equals(phone)) {
							System.out.println("등록된 연락처 입니다.");
							isTrue = false;
							break;
						}
					}
				}
				
				if(isTrue) {
					for(int i = 0; i < exams.length; i++) {
						if(exams[i] != null) {
							if(exams[i].getName().equals(name)) {
								exams[i].setPhone(phone);
								break;	
							}else {
								System.out.println("등록되지 않은 이름입니다.");
								break;	
							}
						}
					}
				}
			}else if(menu == 3) { //------------------------------------------------------- 삭제
				System.out.print("이름 : ");
				String name = scn.nextLine();
				
				for(int i = 0; i < exams.length; i++) {
					if(exams[i] != null) {
						if(exams[i].getName().equals(name)) {
							exams[i] = null;
							break;
						}else {
							System.out.println("등록되지 않은 이름입니다.");
							break;	
						}
					}
				}
			}else if(menu == 4) { //------------------------------------------------------- 조회
				System.out.print("이름 : ");
				String name = scn.nextLine();
				
				boolean notNull = true;
				
				for(int i = 0; i < exams.length; i++) {
					if(exams[i] != null) {
						if(exams[i].getName().equals(name)) {
							System.out.printf("이름 : %s 생일 : %s 연락처 : %s \n", exams[i].getName(), exams[i].getBirthday(), exams[i].getPhone());
							notNull = false;
						}else {
							System.out.println("등록되지 않은 이름입니다.");
							break;
						}
					}if(notNull) {
						System.out.println("조회할 데이터가 없습니다.");
						break;
					}
				}
			}else if(menu == 5) { //------------------------------------------------------- 종료
				break;
			}else {
				System.out.println("잘못된 메뉴입니다.");
			}
		}
		System.out.println("end of prog.");
	}
}
