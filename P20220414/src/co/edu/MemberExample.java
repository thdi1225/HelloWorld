package co.edu;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		
		Member m1 = new Member("user1", "사용자1", "010-1234-1234", 20);
//		m1.showInfo();
//		Member m2 = new Member("user2", "사용자2", "010-5678-5678", 50);
//		m2.setMemberAge(-20);
//		m2.showInfo();
//		System.out.println("\n"+ m2.getMemberAge());
//		m1.setMemberId("user5");
//		System.out.println(m1.getMemberId());
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[3];
		for(int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 입력.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());
			
			Member newMember = new Member(id, name, phone, age);
			members[i] = newMember;
			
//			members[i].setMemberId(id);
//			members[i].setMemberName(name);
//			members[i].setMemberPhone(phone);
//			members[i].setMemberAge(age);
		}
		for(Member member : members) {
			member.showInfo();
		}
		
	}
}
