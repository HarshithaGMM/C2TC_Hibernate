package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Shop;
import tnsif.c2tc.batch9.Entity.ShopOwner;

public interface ShopDao {

	void startTransaction();

    public Shop addShop(Shop s);

	void endTransaction();

	 public Shop updateShop(Shop s);

	public Shop seachShopById(long id);

	boolean deleteShop(long id);

	public boolean deleteShopOwner(int id);

	public void addShopOwner(ShopOwner shopOwner);

	public void updateShopOwner(ShopOwner shopOwner);

	public Employee searchEmployee(int id);

	public boolean deleteEmployee(int id);

	public void updateEmployee(Employee employee);

	public void addEmployee(Employee employee);
	
	

	
}
