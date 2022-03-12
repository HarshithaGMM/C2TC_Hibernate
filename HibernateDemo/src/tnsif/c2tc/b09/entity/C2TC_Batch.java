package tnsif.c2tc.b09.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
//@DiscriminatorValue("C2TC_Batch")

public class C2TC_Batch extends Student {
	private String Tech_trainer;
	private String Softskill_trainer;
	public String getTech_trainer() {
		return Tech_trainer;
	}
	public void setTech_trainer(String tech_trainer) {
		Tech_trainer = tech_trainer;
	}
	public String getSoftskill_trainer() {
		return Softskill_trainer;
	}
	public void setSoftskill_trainer(String softskill_trainer) {
		Softskill_trainer = softskill_trainer;
	}
	
	

}
