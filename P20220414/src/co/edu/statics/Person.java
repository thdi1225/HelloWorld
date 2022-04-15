package co.edu.statics;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	static final double PI = 3.14; // 클래스에 소속, 값 변경 불가.
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
