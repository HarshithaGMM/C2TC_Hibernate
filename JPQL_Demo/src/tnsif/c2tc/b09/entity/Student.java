package tnsif.c2tc.b09.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table( name ="details")
@NamedQueries(@NamedQuery(name ="getallstudent", query = "select s from Student s"))
public class Student {
	@Id
	private int uid;
	private String name;
	@Temporal( TemporalType.DATE)
	private Date dateofbirth;
	private float marks;
	private String trainername;
	private  Branch branch;
	
	
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getTrainer_name() {
		return trainername;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainername = trainer_name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", dateofbirth=" + dateofbirth + ", marks=" + marks
				+ ", trainername=" + trainername + ", branch=" + branch + "]";
	}
	

}
