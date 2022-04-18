package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동", "010-1111-1111", "대구대", "컴정");
//		friends[1] = new ComFriend("김길동", "010-2222-2222", "네이버", "개발팀");
//		friends[2] = new Friend("박길동", "010-3333-3333");
		
		while(true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
			
			if(menu == 1) {
				System.out.println("1. 학교친구 2.회사친구 3. 일반친구");
				int type = Integer.parseInt(scn.nextLine());
				
				System.out.print("이름 > ");
				String name = scn.nextLine();
				System.out.print("번호 > ");
				String phone = scn.nextLine();
				
				if(type == 1) {
					System.out.print("학교 > ");
					String univ = scn.nextLine();
					System.out.print("과 > ");
					String major = scn.nextLine();
					Friend univFriend = new UnivFriend(name, phone, univ, major);
					
					for(int i = 0; i < friends.length; i++) {
						if(friends[i] == null) {
							friends[i] = univFriend;
							break;
						}
					}
				}else if(type == 2){
					System.out.print("회사 > ");
					String company = scn.nextLine();
					System.out.print("부서 > ");
					String department = scn.nextLine();
					Friend comFriend = new ComFriend(name, phone, company, department);
					
					for(int i = 0; i < friends.length; i++) {
						if(friends[i] == null) {
							friends[i] = comFriend;
							break;
						}
					}
				}else if(type == 3){
					Friend friend = new Friend(name, phone);
					
					for(int i = 0; i < friends.length; i++) {
						if(friends[i] == null) {
							friends[i] = friend;
							break;
						}
					}
				}
			}else if(menu == 2){
				for(Friend friend : friends) {
					if(friend != null) {
						System.out.println(friend.toString());
					}
				}
			}else if(menu == 3){
				System.out.print("조회할 이름 > ");
				String name = scn.nextLine();

				for(Friend friend : friends) {
					if(friend != null && name.equals(friend.getName())) {
						System.out.println(friend.toString());
					}
				}
			}else if(menu == 4){
				System.out.println("시스템을 종료합니다.");
				break;
			}else {
				System.out.println("없는 메뉴입니다.");
			}
		}
		
		for(Friend friend : friends) {
			if(friend != null) {
				System.out.println(friend.toString());
			}
		}
	}
}
