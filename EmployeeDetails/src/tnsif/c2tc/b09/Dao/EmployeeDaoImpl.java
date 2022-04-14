package tnsif.c2tc.b09.Dao;



import javax.persistence.EntityManager;


import tnsif.c2tc.b09.EmployeeEntity.Employee;



public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager entitymanager;
	public EmployeeDaoImpl()
	{
		entitymanager=Configuration.getEntityManager();
	}
	@Override
	public void startTransaction() {
		entitymanager.getTransaction().begin();
		
	}
	@Override
	public Employee addEmployee(Employee employee) {
		entitymanager.persist(employee);
		return employee;
		
	}
	@Override
	public void endTranscation() {
		entitymanager.getTransaction().commit();
		
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		return entitymanager.merge(employee);
		
	}
	@Override
	public Employee searchEmployee(long id) {
		Employee es=entitymanager.find(Employee.class, id);
		return es;
	}
	@Override
	public boolean deleteEmployee(long id) {
		Employee em=entitymanager.find(Employee.class, id);
		entitymanager.remove(em);
		return false;
	
		
		
	}
	
	

}
