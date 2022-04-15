package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.Employee;

public interface EmployeeDao {

	public void startTransaction();
	
	public Employee addEmployee(Employee employee);

	public void endTranscation();

	public Employee updateEmployee(Employee employee);

	public Employee searchEmployee(long id);

	public boolean deleteEmployee(long id);

	
	

	

	

	

	

}
