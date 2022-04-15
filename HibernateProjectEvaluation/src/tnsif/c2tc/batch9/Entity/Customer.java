package tnsif.c2tc.batch9.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class Customer {
	@Id
	private int id;
	private String name;
	private String orders;
	private long phone;
	private String email;
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getOrders() {
		return orders;
	}
	public void setOrders(String orders) {
		this.orders = orders;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + ", phone=" + phone + ", email=" + email
				+ "]";
	}

}
