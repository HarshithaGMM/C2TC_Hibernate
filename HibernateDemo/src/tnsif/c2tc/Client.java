package tnsif.c2tc;


import tnsif.c2tc.b09.entity.Laptop;
import tnsif.c2tc.b09.entity.Student;
import tnsif.c2tc.b09.service.StudentService;
import tnsif.c2tc.b09.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImp();
		Student student=new Student();
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Laptop();
		student.setUid(2100810);
		student.setName("Surendra");
		laptop1.setLuid(1);
		laptop1.setLname("HP");
		laptop2.setLuid(2);
		laptop2.setLname("Lenevo");
		student.getLaptop().add(laptop1);
		student.getLaptop().add(laptop2);
	
		service.addLatop(laptop1);
		service.addLatop(laptop2);
		service.addStudent(student);
		
	
		}

	}

		
		
	
		
		
	