package tnsif.c2tc.b09.dao;

import tnsif.c2tc.b09.entity.Course;
import tnsif.c2tc.b09.entity.Student;

public interface StudentDao {

	void addCourse(Course course);

	void getTranscation();

	void endTranscation();

	void addStudent(Student student);

}
