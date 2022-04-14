package co.edu;

public class Student {
	String name;
	String studNo;
	int age;
	double height;
	
	public Student(){
		System.out.println("student() 생성자가 호출되었습니다.");
	}

	public Student(String name, String studNo){
		this.name = name;
		this.studNo = studNo;
	}

	public Student(String name, String studNo, int age){
		this.name = name;
		this.studNo = studNo;
		this.age = age;
	}
	
	public Student(String name, String studNo, int age, double height) {
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}

	void study() {
		System.out.println(name + "이(가) 공부를 합니다.");
	}
	
	void eat() {
		System.out.println(name + "이(가) 식사를 합니다.");
	}
	
	void showInfo() {
		System.out.printf("이름은 %s이고 학생번호은 %s이고 나이는 %d이고 키는 %.1f입니다.\n", name, studNo, age, height);
	}
	
}
