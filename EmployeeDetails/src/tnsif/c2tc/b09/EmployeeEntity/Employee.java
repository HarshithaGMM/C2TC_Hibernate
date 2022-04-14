package tnsif.c2tc.b09.EmployeeEntity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table( name = "employees")
public class Employee {
	@Id
	private long id;
	private String name;
	@Temporal( TemporalType.DATE)
	private Date dob;
	private float salary;
	private String address;
	private String designation;
	//private Shop shop;
	
	private static boolean isdeleteEmployee=true;
	
	
	public static boolean isIsdeleteEmployee() {
		return isdeleteEmployee;
	}
	public static void setIsdeleteEmployee(boolean isdeleteEmployee) {
		Employee.isdeleteEmployee = isdeleteEmployee;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/*public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}*/
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
				+ ", designation=" + designation + "]";
	}
	
	
	
	
	
}
