package tnsif.c2tc.b09.service;

import tnsif.c2tc.b09.dao.StudentDao;
import tnsif.c2tc.b09.dao.StudentDaoImpl;
import tnsif.c2tc.b09.entity.Student;

public class StudentServiceImp implements StudentService{
    StudentDao sd;
	public StudentServiceImp()
	{
		sd=new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		sd.getTranscation();
		sd.addStudent(student);
		sd.endTranscation();
		
	}

	@Override
	public void updateStudent(Student student) {
		sd.getTranscation();
		sd.updateStudent(student);
		sd.endTranscation();	
	}

	@Override
	public Student getStudent(int uid) {
		Student s=sd.getStudent(uid);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		sd.getTranscation();
		sd.deleteStudent(uid);
		sd.endTranscation();	
		
	}

	
	
	
}
