package tnsif.c2tc.batch9.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table( name = "items")
public class Item {
	@Id
	private long id;
	private String ItemName;
	@Temporal( TemporalType.DATE)
	private Date manufacturing;
	@Temporal( TemporalType.DATE)
	private Date expiry;
	private float price;
	private Category category;
	
	private static boolean isdeleteItem=true;
	
	
	public static boolean isIsdeleteItem() {
		return isdeleteItem;
	}
	public static void setIsdeleteItem(boolean isdeleteItem) {
		Item.isdeleteItem = isdeleteItem;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Date getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(Date manufacturing) {
		this.manufacturing = manufacturing;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", ItemName=" + ItemName + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", category=" + category + "]";
	}

	
}
