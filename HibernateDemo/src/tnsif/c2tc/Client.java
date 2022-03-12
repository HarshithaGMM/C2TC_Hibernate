package tnsif.c2tc;

import tnsif.c2tc.b09.entity.C2TC_Batch;
import tnsif.c2tc.b09.entity.Student;
import tnsif.c2tc.b09.service.StudentService;
import tnsif.c2tc.b09.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImp();
		C2TC_Batch student=new C2TC_Batch();// upcasting
		//Student student=new Student();
		student.setUid(2100802);
		student.setName("Balakumar");
		//service.addStudent(student);
		//service.updateStudent(student);
		//Student s=service.getStudent(2100805);
		//System.out.println(s);
		//service.deleteStudent(2100800);
		
		student.setTech_trainer("Sanjana");
		student.setSoftskill_trainer("Nitara");
		service.addStudent(student);
		

	}

}
