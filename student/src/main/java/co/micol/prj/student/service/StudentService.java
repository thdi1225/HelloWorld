package co.micol.prj.student.service;

import java.util.List;

import co.micol.prj.student.dto.StudentVO;

public interface StudentService {
	
	List<StudentVO> selectStudentList();
	
	StudentVO selectStudent(StudentVO student);
	
	int intsertStudent(StudentVO student);
	
	int updateStudent(StudentVO student);
	
	int deletetStudent(StudentVO student);
	
}
