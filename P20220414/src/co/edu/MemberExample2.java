package co.edu;

import java.util.Scanner;

public class MemberExample2 {
	public static void main(String[] args) {
		//1. 조회(이름) 2.변경(아이디 연락처) 3.조회(나이 큰 회원) 4.종료
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
		Member[] members = new Member[3];
		for(int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 입력.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());
			
			Member newMember = new Member(id, name, phone, age);
			members[i] = newMember;
		}
		
		while(isTrue) {
			System.out.println("1. 조회(이름) 2.변경(아이디, 연락처) 3.조회(입력한 나이보다 큰 회원) 4.종료");
			System.out.print("선택 > ");
			int menu = scn.nextInt();
			scn.nextLine();
			if(menu == 1) {
				System.out.println("조회하실 이름을 입력하세요.");
				String memberName = scn.nextLine(); 
				for(Member member : members) {
					if(memberName.equals(member.getMemberName())) {
						System.out.printf("이름 : %s, 아이디 :%s, 나이:%d , 연락처 : %s \n\n", member.getMemberName(), member.getMemberId(), member.getMemberAge(), member.getMemberPhone());
					}
				}
			}else if(menu == 2) {
				System.out.println("변경하실 아이디를 입력하세요.");
				String memberId = scn.nextLine();
				System.out.println("변경할 연락처를 입력하세요.");
				String memberPhone = scn.nextLine();
				for(Member member : members) {
					if(memberId.equals(member.getMemberId())) {
						member.setMemberPhone(memberPhone);
					}
				}
			}else if(menu == 3) {
				System.out.println("조회하실 나이를 입력하세요.");
				int memberAge = Integer.parseInt(scn.nextLine());
				for(Member member : members) {
					if(memberAge < member.getMemberAge()) {
						System.out.printf("이름 : %s, 아이디 :%s, 나이:%d , 연락처 : %s \n\n", member.getMemberName(), member.getMemberId(), member.getMemberAge(), member.getMemberPhone());
					}
				}
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
			}else {
				for(Member member : members) {
					member.showInfo();
				}
			}
		}	
	}
}
