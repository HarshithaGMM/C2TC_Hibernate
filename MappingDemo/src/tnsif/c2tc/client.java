package tnsif.c2tc;

import tnsif.c2tc.b09.entity.Course;
import tnsif.c2tc.b09.entity.Student;
import tnsif.c2tc.b09.service.StudentService;
import tnsif.c2tc.b09.service.StudentServiceImpl;

public class client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		Course course1=new Course();
		Course course2=new Course();
		course1.setCid(1);
		course1.setCname("technical");
		course2.setCid(2);
		course2.setCname("softskill");
		student.setUid(2100811);
		student.setName("yashaswini");
		student.getCourse().add(course1);
		student.getCourse().add(course2);
		service.addCourse(course1);
		service.addCourse(course2);
		service.addStudent(student);


	}

}
