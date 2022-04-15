package tnsif.c2tc.batch9.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mall {
	@Id
	private long id;
	
	private String mallName;
	private String location;
	@OneToOne
	private MallAdmin malladmin;
	private Categories categories;
	
	
	
	
	public MallAdmin getMalladmin() {
		return malladmin;
	}
	public void setMalladmin(MallAdmin malladmin) {
		this.malladmin = malladmin;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public MallAdmin getMall() {
		return malladmin;
	}
	public void setMall(MallAdmin mall) {
		this.malladmin = mall;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + ", mall admin=" + malladmin + "]";
	}
	

}
