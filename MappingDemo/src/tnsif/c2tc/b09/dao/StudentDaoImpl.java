package tnsif.c2tc.b09.dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.b09.entity.Course;
import tnsif.c2tc.b09.entity.Student;

public class StudentDaoImpl implements StudentDao{
	EntityManager entityManager;
	public StudentDaoImpl()
	{
		entityManager=Configuration.getEntityManager();
	}

	@Override
	public void addCourse(Course course) {
		entityManager.persist(course);
		
		
	}

	@Override
	public void getTranscation() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void endTranscation() {
		entityManager.getTransaction().commit();
		
		
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}

}
