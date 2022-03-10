package tnsif.c2tc;

import tnsif.c2tc.b09.entity.Student;
import tnsif.c2tc.b09.service.StudentService;
import tnsif.c2tc.b09.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImp();
		Student student=new Student();
		student.setUid(2100805);
		student.setName("Harshitha GM");
		//service.addStudent(student);
		//service.updateStudent(student);
		//Student s=service.getStudent(2100805);
		//System.out.println(s);
		service.deleteStudent(2100800);
		

	}

}
