package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public  Employee searchEmployee(long id);

	public boolean deleteEmployee(long id);

	

	
	

	

	

}
