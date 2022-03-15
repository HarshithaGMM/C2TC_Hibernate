package tnsif.c2tc.b09.service;

import tnsif.c2tc.b09.entity.Laptop;
import tnsif.c2tc.b09.entity.Student;

public interface StudentService {

	void addStudent(Student student);

	void updateStudent(Student student);

	Student getStudent(int uid);

	void deleteStudent(int uid);

	void addLatop(Laptop laptop);

	

}
