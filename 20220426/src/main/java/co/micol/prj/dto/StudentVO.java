package co.micol.prj.dto;

import java.sql.Date;

public class StudentVO {
	private String studentId;
	private String name;
	private int age;
	private String gender;
	private Date birthDay;
	
	public StudentVO() {
	
	}

	public StudentVO(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String toString() {
		System.out.print("studentId : " + studentId);
		System.out.print(", name : " + name);
		System.out.print(", age : " + age);
		System.out.print(", gender : " + gender);
		System.out.println(", birthDay : " + birthDay);
		
		return null;
	}
}
