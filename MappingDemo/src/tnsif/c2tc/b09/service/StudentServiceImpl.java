package tnsif.c2tc.b09.service;

import tnsif.c2tc.b09.dao.StudentDao;
import tnsif.c2tc.b09.dao.StudentDaoImpl;
import tnsif.c2tc.b09.entity.Course;
import tnsif.c2tc.b09.entity.Student;

public class StudentServiceImpl implements StudentService{
	 StudentDao sd;
		public StudentServiceImpl()
		{
			sd=new StudentDaoImpl();
		}
		@Override
		public void addCourse(Course course) {
			sd.getTranscation();
			sd.addCourse(course);
			sd.endTranscation();
			
		}
		@Override
		public void addStudent(Student student) {
			sd.getTranscation();
			sd.addStudent(student);
			sd.endTranscation();
			
		}

}
