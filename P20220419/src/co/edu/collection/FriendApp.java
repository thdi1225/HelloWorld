package co.edu.collection;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		FriendService service = new FriendServiceArray();
//		FriendService service = new FriendServiceList();
		int menu = 0;
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.종료");
			System.out.print("선택 > ");
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("잘못된 번호입니다.");
			}
			
			if(menu == 1) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				System.out.print("번호을 입력하세요 > ");
				String phone = scn.nextLine();
				
				Friend friend = new Friend(name, phone);
				
				service.addFriend(friend);
			}else if(menu == 2) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				System.out.print("번호을 입력하세요 > ");
				String phone = scn.nextLine();
				
				Friend friend = new Friend(name, phone);
				
				service.modFried(friend);
			}else if(menu == 3) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				service.remFriend(name);
			}else if(menu == 4) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				Friend friend = service.findFriend(name);
				if(friend == null) {
					System.out.println("조회하신 데이터가 없습니다.");
				}else {
					System.out.println(friend);
				}
			}else if(menu == 5) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
