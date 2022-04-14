package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("학생이름 점수 나이 순으로 입력하세요."); // 홍길동 80 20
		
		s1.studName = scn.next();
		s1.score = Integer.parseInt(scn.next());
		s1.age = Integer.parseInt(scn.next());

		Student[] students = {new Student(), new Student(), new Student()};
		
		students[0].studName = scn.next();
		students[0].score = Integer.parseInt(scn.next());
		students[0].age = Integer.parseInt(scn.next());
				
		System.out.println("조회하고 싶은 이름 입력");
		System.out.println("해당 이름 홍길동이고 20이고 80점입니다.");
	}
}
