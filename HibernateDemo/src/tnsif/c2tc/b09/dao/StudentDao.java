package tnsif.c2tc.b09.dao;

import tnsif.c2tc.b09.entity.Laptop;
import tnsif.c2tc.b09.entity.Student;

public interface StudentDao {

	void addStudent(Student student);

	void getTranscation();

	void endTranscation();

	void updateStudent(Student student);

	Student getStudent(int uid);

	void deleteStudent(int uid);

	void addLaptop(Laptop laptop);

	
	
	

}
