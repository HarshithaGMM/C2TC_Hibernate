package tnsif.c2tc.b09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tnsif.c2tc.b09.entity.Student;
import tnsif.c2tc.b09.service.StudentService;
import tnsif.c2tc.b09.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) throws ParseException     {
		
		StudentService service=new StudentServiceImpl();
		Student s=new Student();
		String datastring1="01-01-2000";
		String datastring2="01-12-2000";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=format.parse(datastring1);
		Date date2=format.parse(datastring2);
		s.setUid(2110621);
		s.setName("Swapnil");
		s.setTrainer_name("Sanjana");
		s.setMarks(98.8f);
		//s.setDateofbirth(date);
		//service.addStudent(s);
		System.out.println(service.getcount());
		System.out.println(service.getStudentbytrainername("Sanjana"));
		System.out.println(service.getStudentintherangeofdate(date1,date2));
		

	}

}
