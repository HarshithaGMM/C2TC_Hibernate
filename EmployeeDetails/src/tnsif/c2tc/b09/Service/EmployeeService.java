package tnsif.c2tc.b09.Service;

import tnsif.c2tc.b09.EmployeeEntity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public  Employee searchEmployee(long id);

	public boolean deleteEmployee(long id);

	

	
	

	

	

}
