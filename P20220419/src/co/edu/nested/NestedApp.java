package co.edu.nested;

import java.util.Scanner;

class Friend{
	String name;
	String phone;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}

public class NestedApp {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];
	
	interface FriendService {
		int ADD = 1;
		int MOD = 2;
		int DEL = 3;
		int LIST = 4;
		
		void add();
		void modify();
		void remove();
		void list();
	}
	
	static class FriendApp implements FriendService{

		@Override
		public void add() {
			System.out.print("이름 > ");
			String name = scn.nextLine();
			System.out.print("번호 > ");
			String phone = scn.nextLine();
			System.out.print("나이 > ");
			int age = Integer.parseInt(scn.nextLine());
			
			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			
			for(int i = 0; i < friends.length; i++) {
				if(friends[i] == null) {
					friends[i] = friend;
					break;
				}
			}
		}

		@Override
		public void modify() {
			System.out.print("이름 > ");
			String name = scn.nextLine();
			System.out.print("번호 > ");
			String phone = scn.nextLine();
			System.out.print("나이 > ");
			int age = Integer.parseInt(scn.nextLine());
			
			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			
			for(int i = 0; i < friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(friend.getName())) {
					friends[i] = friend;
					break;
				}
			}
		}

		@Override
		public void remove() {
			System.out.print("이름 > ");
			String name = scn.nextLine();
			
			for(int i = 0; i < friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
					friends[i] = null;
				}
			}
		}

		@Override
		public void list() {
			System.out.print("이름 > ");
			String name = scn.nextLine();
			
			for(int i = 0; i < friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
					System.out.println(friends[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		FriendApp friendApp = new FriendApp();
		int menu = 0;
		
		while(true) {
			System.out.println("1.등록 2.수정 3.삭제 4.조회");
			menu = Integer.parseInt(scn.nextLine());
			
			if(menu == FriendService.ADD) {
				friendApp.add();
			}else if(menu == FriendService.MOD) {
				friendApp.modify();
			}else if(menu == FriendService.DEL) {
				friendApp.remove();
			}else if(menu == FriendService.LIST) {
				friendApp.list();
			}
		}
	}
}
