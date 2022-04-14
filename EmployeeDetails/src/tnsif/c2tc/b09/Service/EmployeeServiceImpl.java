package tnsif.c2tc.b09.Service;

import tnsif.c2tc.b09.Dao.EmployeeDao;
import tnsif.c2tc.b09.Dao.EmployeeDaoImpl;
import tnsif.c2tc.b09.EmployeeEntity.Employee;


public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao ed;
	public EmployeeServiceImpl()
	{
	ed=new EmployeeDaoImpl();
	}


	@Override
	public Employee addEmployee(Employee employee) {
		ed.startTransaction();                                                                                              
		ed.addEmployee(employee);
		ed.endTranscation();
		return employee;
		
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		ed.startTransaction();                                                                                              
		ed.updateEmployee(employee);
		ed.endTranscation();
		return employee;
		
	}


	@Override
	public Employee searchEmployee(long id) {
		Employee empl=ed.searchEmployee(id);
		return empl;
	}


	@Override
	public boolean deleteEmployee(long id) {
		ed.startTransaction();                                                                                              
		ed.deleteEmployee(id);
		ed.endTranscation();
		return false;
	
		
	}


	

	
	

}
