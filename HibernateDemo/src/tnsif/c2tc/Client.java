package tnsif.c2tc;


import tnsif.c2tc.b09.entity.Laptop;
import tnsif.c2tc.b09.entity.Student;
import tnsif.c2tc.b09.service.StudentService;
import tnsif.c2tc.b09.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImp();
		Student student=new Student();
		Laptop laptop=new Laptop();
		student.setUid(2100810);
		student.setName("Surendra");
		laptop.setLuid(1);
		laptop.setLname("HP");
		student.setLaptop(laptop);
		service.addLatop(laptop);
		service.addStudent(student);
		
	
		}

	}

		
		
	
		
		
	