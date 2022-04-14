package tnsif.c2tc.b09.EmployeeDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tnsif.c2tc.b09.EmployeeEntity.Employee;
import tnsif.c2tc.b09.Service.EmployeeService;
import tnsif.c2tc.b09.Service.EmployeeServiceImpl;

public class client {

	public static void main(String[] args) throws ParseException {
		EmployeeService service=new EmployeeServiceImpl();
		Employee employee=new Employee();
		employee.setId(10001203);
		employee.setName("Shashank ");
		String datastring1="01-01-2000";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=format.parse(datastring1);
		
		employee.setDob(date1);
		employee.setSalary(20000.0f);
		employee.setAddress("Bangalore");
		employee.setDesignation("Maneger");
		//.addEmployee(employee);
		
		service.updateEmployee(employee);
	    System.out.println(service.searchEmployee(10001202));
		System.out.println(service.deleteEmployee(10001203));
		
		

	}

}
