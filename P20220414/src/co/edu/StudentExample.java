package co.edu;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "홍길동";
		student.studNo = "22-1234567";
		student.age = 20;
		student.height = 175.5;
		
		student.study();
		student.eat();
		student.showInfo();

		Student student1 = new Student();
		student1.name = "소진영";
		student1.studNo = "22-9876543";
		student1.age = 29;
		student1.height = 170.1;
		
		student1.study();
		student1.eat();
		student1.showInfo();

		Student student2 = new Student();
		student2.name = "가나다";
		student2.studNo = "22-4567891";
		student2.age = 27;
		student2.height = 187.1;
		
		student2.study();
		student2.eat();
		student2.showInfo();

		Student student3 = new Student("호로로로롤", "22-1123567489");
		student3.age = 27;
		student3.height = 187.1;
		
		student3.study();
		student3.eat();
		student3.showInfo();

		Student student4 = new Student("아자차", "22-0000000", 30);
		student4.height = 161.1;
		
		student4.study();
		student4.eat();
		student4.showInfo();
	}
}
