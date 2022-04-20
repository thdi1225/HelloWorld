package co.edu.collection;

import java.util.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
//		Friend[] friendArray = new Friend[10];
//		friendArray[0] = new Friend("홍길동", "010-1111-1111");
//		friendArray[1] = new Friend("김길동", "010-2222-2222");
//		friendArray[2] = new Friend("박길동", "010-3333-3333");
//		
//		for(int i = 0; i < friendArray.length; i++) {
//			if(friendArray[i] != null) {
//				System.out.println(friendArray[i].toString());	
//			}
//		}
		
		ArrayList<Friend> list = new ArrayList<Friend>();
		list.add(new Friend("홍길동", "010-1111-1111"));
		list.add(new Friend("김길동", "010-2222-2222"));
		list.remove(0);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.get(0);
	}
}
