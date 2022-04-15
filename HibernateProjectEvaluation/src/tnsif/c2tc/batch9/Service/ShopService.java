package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Shop;
import tnsif.c2tc.batch9.Entity.ShopOwner;

public interface ShopService {

public	Shop addShop(Shop s);

public	Shop updateShop(Shop s);

public 	 Shop seachShopById(Long id);
public	 boolean deleteShop(long id);

public Shop searchShopOwner(int id);

public boolean deleteShopOwner(int id);

public void updateShopOwner(ShopOwner shopOwner);

public void addShopOwner(ShopOwner shopOwner);

public Employee searchEmployee(int id);

public boolean deleteEmployee(int id);

public void updateEmployee(Employee employee);

public void addEmployee(Employee employee);

public Shop seachShopById(int id);


}
