package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.ShopDao;
import tnsif.c2tc.batch9.Dao.ShopDaoImpl;
import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Shop;
import tnsif.c2tc.batch9.Entity.ShopOwner;

public class ShopServiceImpl implements ShopService{
ShopDao sd;

	public ShopServiceImpl() {
	sd=new ShopDaoImpl();
}

	@Override
	public Shop addShop(Shop s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addShop(s);
		sd.endTransaction();
		return s;
		
	}

	@Override
	public Shop updateShop(Shop s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
	Shop shop=sd.updateShop(s);
		sd.endTransaction();
		return shop;
	}

	@Override
	public Shop seachShopById(Long id) {
		// TODO Auto-generated method stub
		Shop shop=sd.seachShopById(id);
		return shop;
	}

	@Override
	public boolean deleteShop(long id) {
		// TODO Auto-generated method stub
		sd.startTransaction();
        sd.deleteShop(id);
		sd.endTransaction();
		return false;
	}

	@Override
	public Shop searchShopOwner(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteShopOwner(int id) {
		sd.startTransaction();
		sd.deleteShopOwner(id);
		sd.endTransaction();
		return false;
	}

	@Override
	public void updateShopOwner(ShopOwner shopOwner) {
		sd.startTransaction();
		sd.updateShopOwner(shopOwner);
		sd.endTransaction();
		
	}

	@Override
	public void addShopOwner(ShopOwner shopOwner) {
		sd.startTransaction();
		sd.addShopOwner(shopOwner);
		sd.endTransaction();
		
	}
	@Override
	public void addEmployee(Employee employee) {
		sd.startTransaction();
		sd.addEmployee(employee);
		sd.endTransaction();
		
	}
	@Override
	public void updateEmployee(Employee employee) {
		sd.startTransaction();
		sd.updateEmployee(employee);
		sd.endTransaction();
		
	}
	@Override
	public Employee searchEmployee(int i) {
	Employee e=sd.searchEmployee(i);
		return e;
	}
	@Override
	public boolean deleteEmployee(int id) {
		sd.startTransaction();
		sd.deleteEmployee(id);
		sd.endTransaction();
		return false;
	}

	@Override
	public Shop seachShopById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

	


