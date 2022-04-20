package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.collection.Friend;

class Orange{
	
}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setField("Orange");
		
		String result = box.getField();
		
		Box<Orange> box1 = new Box<Orange>();
		Orange orange = box1.getField();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-2222-3333"));
	}
}
