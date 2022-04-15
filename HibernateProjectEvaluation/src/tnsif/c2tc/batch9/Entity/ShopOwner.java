package tnsif.c2tc.batch9.Entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ShopOwner {
	@Id
private long id;
private String name;
@Temporal( TemporalType.DATE)
private Date dob;
private String shop;
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
public String getShop() {
	return shop;
}
public void setShop(String shop) {
	this.shop = shop;
}
@Override
public String toString() {
	return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", shop=" + shop + "]";
}

}
