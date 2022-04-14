package tnsif.c2tc.b09.Dao;

import tnsif.c2tc.b09.EmployeeEntity.Employee;

public interface EmployeeDao {

	public void startTransaction();
	
	public Employee addEmployee(Employee employee);

	public void endTranscation();

	public Employee updateEmployee(Employee employee);

	public Employee searchEmployee(long id);

	public boolean deleteEmployee(long id);

	
	

	

	

	

	

}
