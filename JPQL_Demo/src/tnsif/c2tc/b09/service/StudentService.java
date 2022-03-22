package tnsif.c2tc.b09.service;

import java.util.Date;
import java.util.List;

import tnsif.c2tc.b09.entity.Student;

public interface StudentService {

	public void addStudent(Student student);

	public Long getcount();

	public List<Student> getStudentbytrainername(String string);

	public List<Student> getStudentintherangeofdate(Date date1, Date date2);

	public List<Student> getallstudent();

}
