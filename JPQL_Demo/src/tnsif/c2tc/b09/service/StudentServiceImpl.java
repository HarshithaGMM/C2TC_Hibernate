package tnsif.c2tc.b09.service;

import java.util.Date;
import java.util.List;

import tnsif.c2tc.b09.dao.StudentDao;
import tnsif.c2tc.b09.dao.StudentDaoImpl;
import tnsif.c2tc.b09.entity.Student;

public class StudentServiceImpl implements StudentService{
	StudentDao sd;
	public StudentServiceImpl()
	{
	sd=new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		sd.startTransaction();                                                                                              
		sd.addStudent(student);
		sd.endTranscation();
		
	}

	@Override
	public Long getcount() {
		return sd.getcount();
	
	}

	@Override
	public List<Student> getStudentbytrainername(String string) {
		List<Student> list=sd.getStudentbytrainername(string);
		return list;
	}

	@Override
	public List<Student> getStudentintherangeofdate(Date date1, Date date2) {
		List<Student> list=sd.getStudentintherangeofdate(date1,date2);
		return list;
	}

}
