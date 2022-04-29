package co.micol.prj.student.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class StudentVO {
	private String studentId;
	private String name;
	private Date birthDay;
	private String major;
	private String address;
	private String tel;

}