package tnsif.c2tc.b09.dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.b09.entity.Student;

public class StudentDaoImpl implements StudentDao{
	EntityManager entityManager;
	public StudentDaoImpl()
	{
		entityManager=Configuration.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);	
		
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
	public void updateStudent(Student student) {
		entityManager.merge(student);
		
	}

	@Override
	public Student getStudent(int uid) {
		Student s=entityManager.find(Student.class, uid);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		Student s=entityManager.find(Student.class, uid);
		entityManager.remove(s);
		
	} 

}
