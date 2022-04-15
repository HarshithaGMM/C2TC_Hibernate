package tnsif.c2tc.batch9.Entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Shop {
	@Id
	private long shopId;
	private shopCategory shopCategory;
	@OneToMany(mappedBy="shop")
	private List<Employee> shopEmployees;
	private String shopName;
	@OneToMany
	private List<Customer> customers;
	private shopStatus shopStatus;
	private String shopOwner;
	private String leaseStatus;
	private boolean isdeleteShop=true;
	
	public boolean isIsdeleteShop() {
		return isdeleteShop;
	}
	public void setIsdeleteShop(boolean isdeleteShop) {
		this.isdeleteShop = isdeleteShop;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public shopCategory getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(shopCategory shopCategory) {
		this.shopCategory = shopCategory;
		
	}
	
	public List<Employee> getShopEmployees() {
		return shopEmployees;
	}
	public void setShopEmployees(List<Employee> shopEmployees) {
		this.shopEmployees = shopEmployees;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public shopStatus getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(shopStatus shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopEmployees=" + shopEmployees
				+ ", shopName=" + shopName + ", customers=" + customers + ", shopStatus=" + shopStatus + ", shopOwner="
				+ shopOwner + ", leaseStatus=" + leaseStatus + "]";
	}
	
		
	}



