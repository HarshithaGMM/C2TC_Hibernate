package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.ShopOwner;

public interface ShopOwnerService {

	public void addShopOwner(ShopOwner shopOwner);
	public void updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwner(long id);
	public boolean deleteShopOwner(long id);

}
