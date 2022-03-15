package tnsif.c2tc.b09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int luid;
	private String lname;
	@OneToOne(mappedBy = "laptop")
		
	Student student;
	public int getLuid() {
		return luid;
	}
	public void setLuid(int luid) {
		this.luid = luid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
