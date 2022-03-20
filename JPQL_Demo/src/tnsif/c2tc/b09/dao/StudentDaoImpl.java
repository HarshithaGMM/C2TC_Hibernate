package tnsif.c2tc.b09.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tnsif.c2tc.b09.entity.Student;

public class StudentDaoImpl implements StudentDao {
	EntityManager em;
	public StudentDaoImpl()
	{
		em=Configuration.getEntityManager();
	}
	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}
	@Override
	public void startTransaction() {
		em.getTransaction().begin();	
	}
	@Override
	public void endTranscation() {
		em.getTransaction().commit();		
	}
	@Override
	public Long getcount() {
		String query="Select COUNT(s.uid) from Student s";
		TypedQuery<Long> t=em.createQuery(query,Long.class);
		Long count=t.getSingleResult();
		return count;
		
	}
	@Override
	public List<Student> getStudentbytrainername(String string) {
		String query= "Select s From Student s"+  "Where s.trainername like: name";
		TypedQuery<Student> t= em.createQuery(query, Student.class);
		t.setParameter("name", "%" +string+ "%");
		List<Student> list=t.getResultList();
		return  list;
	}
	@Override
	public List<Student> getStudentintherangeofdate(Date date1, Date date2) {
		String query= "Select s From Student s"+"Where s.dateofbirth between: date1 and :date2";
	TypedQuery<Student> t=em.createQuery(query, Student.class);
	t.setParameter("date1",date1);
	t.setParameter("date2",date2);
	List<Student> list=t.getResultList();
		return list;
	}

}
