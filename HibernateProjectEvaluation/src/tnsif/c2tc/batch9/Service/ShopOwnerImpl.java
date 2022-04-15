package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.ShopOwnerDao;
import tnsif.c2tc.batch9.Dao.ShopOwnerDaoImpl;
import tnsif.c2tc.batch9.Entity.ShopOwner;

public class ShopOwnerImpl implements ShopOwnerService {
ShopOwnerDao sod;
public ShopOwnerImpl()
{
	sod=new ShopOwnerDaoImpl();
	
}
@Override
public void addShopOwner(ShopOwner shopOwner) {

	sod.startTransaction();
	sod.addShopOwner(shopOwner);
	sod.endTransaction();
}
@Override
public void updateShopOwner(ShopOwner shopOwner) {
	// TODO Auto-generated method stub
	sod.startTransaction();
	sod.updateShopOwner(shopOwner);
	sod.endTransaction();
	
}
@Override
public ShopOwner searchShopOwner(long id) {
	// TODO Auto-generated method stub
	ShopOwner so=sod.searchShopOwner(id);
	return so;
}
@Override
public boolean deleteShopOwner(long id) {
	// TODO Auto-generated method stub
	sod.startTransaction();
	sod.deleteShopOwner(id);
	sod.endTransaction();
	return false;
	
}
}
