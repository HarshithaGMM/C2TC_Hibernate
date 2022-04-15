package tnsif.c2tc.batch9.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
	public class MallAdmin {
	@Id
		private int id;
		private String name;
		private String password;
		@OneToOne(mappedBy="malladmin")
		private Mall mall;
		private long phone;
		
		public Mall getMall() {
			return mall;
		}
		public void setMall(Mall mall) {
			this.mall = mall;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
					+ phone + "]";
		}
		
		
}
