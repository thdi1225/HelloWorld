package co.edu.api;

import java.util.HashSet;

class Member{
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return this.name.equals(member.name);
		}
		
//		return super.equals(obj);
		return false;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

public class ObjectExample {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		
		System.out.println(set.size());
		
		HashSet<Member> set1 = new HashSet<Member>();
		set1.add(new Member("홍길동", 20));
		set1.add(new Member("김길동", 22));
		set1.add(new Member("홍길동", 20));
		
		System.out.println(set1.size());
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
	}
}
