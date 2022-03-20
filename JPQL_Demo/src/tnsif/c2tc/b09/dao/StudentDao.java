package tnsif.c2tc.b09.dao;

import java.util.Date;
import java.util.List;

import tnsif.c2tc.b09.entity.Student;

public interface StudentDao {

	public void addStudent(Student student);

	public void startTransaction();

	public void endTranscation();

    public Long getcount();

	public List<Student> getStudentbytrainername(String string);

	public List<Student> getStudentintherangeofdate(Date date1, Date date2);

}
