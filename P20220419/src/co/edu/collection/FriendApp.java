package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();
		int menu = 0;
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.조회(이름) 5.조회(성별 : 남) 6.조회(성별 : 여) 7.종료");
			System.out.print("선택 > ");
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("잘못된 번호입니다.");
			}
			
			if(menu == FriendService.ADD) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				System.out.print("번호을 입력하세요 > ");
				String phone = scn.nextLine();

				System.out.print("성별을 입력하세요 > ");
				String gender = scn.nextLine();
				
				Gender gen = Gender.MEN;
				
				if(gender.startsWith("남")) {
					gen = Gender.MEN;
				}else if(gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				
				Friend friend = new Friend(name, phone, gen);
				
				service.addFriend(friend);
			}else if(menu == FriendService.MOD) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				System.out.print("번호을 입력하세요 > ");
				String phone = scn.nextLine();
				
				System.out.print("성별을 입력하세요 > ");
				String gender = scn.nextLine();
				
				Gender gen = Gender.MEN;
				
				if(gender.startsWith("남")) {
					gen = Gender.MEN;
				}else if(gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				
				Friend friend = new Friend(name, phone, gen);
				
				service.modFried(friend);
			}else if(menu == FriendService.DEL) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				service.remFriend(name);
			}else if(menu == FriendService.SEARCH) {
				System.out.print("이름을 입력하세요 > ");
				String name = scn.nextLine();
				
				Friend friend = service.findFriend(name);
				if(friend == null) {
					System.out.println("조회하신 데이터가 없습니다.");
				}else {
					System.out.println(friend);
				}
			}else if(menu == FriendService.MEN) {
				ArrayList<Friend> newList = service.findGender(Gender.MEN);
				for(Friend vo : newList) {
					System.out.println(vo.toString());
				}
			}else if(menu == FriendService.WOMEN) {
				ArrayList<Friend> newList = service.findGender(Gender.WOMEN);
				for(Friend vo : newList) {
					System.out.println(vo.toString());
				}
			}else if(menu == 7) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
