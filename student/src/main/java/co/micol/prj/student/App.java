package co.micol.prj.student;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj.student.dto.StudentVO;
import co.micol.prj.student.service.StudentService;
import co.micol.prj.student.serviceImpl.StudentServiceImpl;

public class App {
    public static void main( String[] args ) {
    	StudentService service = new StudentServiceImpl();
    	List<StudentVO> list = new ArrayList<StudentVO>();
    	
    	list = service.selectStudentList();
    	
    	for(StudentVO vo : list) {
    		System.out.println(vo);
    	}
    	
    	System.out.println("====================================================================================================================");
    	
    	StudentVO student = new StudentVO();
    	student.setStudentId("park@abc.com");
    	student = service.selectStudent(student);
    	
    	System.out.println(student);
    	
    	System.out.println("====================================================================================================================");
    	
    	student.setStudentId("thdi1225@naver.com");
    	student.setName("소진영");
    	student.setBirthDay(Date.valueOf("1994-02-05"));
    	student.setMajor("경영학과");
    	student.setAddress("대구시 남구");
    	student.setTel("010-1111-1111");
    	if(service.intsertStudent(student) != 0) {
    		System.out.println("정상적으로 작동하였습니다.");
    	}else {
    		System.out.println("정상적으로 작동하지 못하였습니다.");
    	}
    	
    	
    	System.out.println("====================================================================================================================");
    	
    	student = new StudentVO();
    	student.setStudentId("thdi1225@naver.com");
    	student.setName("소진영1");
    	student.setBirthDay(Date.valueOf("1994-02-05"));
    	student.setMajor("경영학과1");
    	student.setAddress("대구시 남구1");
    	student.setTel("010-4444-4444");
    	
    	if(service.updateStudent(student) != 0) {
    		System.out.println("정상적으로 작동하였습니다.");
    	}else {
    		System.out.println("정상적으로 작동하지 못하였습니다.");
    	}
    	System.out.println("====================================================================================================================");
    	
    	student = new StudentVO();
    	student.setStudentId("thdi1225@naver.com");
    	
    	if(service.deletetStudent(student) != 0) {
    		System.out.println("정상적으로 작동하였습니다.");
    	}else {
    		System.out.println("정상적으로 작동하지 못하였습니다.");
    	}
    }
    
}
