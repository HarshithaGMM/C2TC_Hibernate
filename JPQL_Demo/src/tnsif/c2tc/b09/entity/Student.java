package tnsif.c2tc.b09.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table( name ="details")
public class Student {
	@Id
	private int uid;
	private String name;
	@Temporal( TemporalType.DATE)
	private Date dateofbirth;
	private float marks;
	private String trainername;
	
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

}
