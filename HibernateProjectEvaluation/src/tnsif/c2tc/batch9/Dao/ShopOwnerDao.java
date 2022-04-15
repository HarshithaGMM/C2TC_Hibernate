package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.ShopOwner;

public interface ShopOwnerDao {
	void addShopOwner(ShopOwner shopOwner);

	void startTransaction();

	void endTransaction();
	
    void updateShopOwner(ShopOwner shopOwner);
    
    ShopOwner searchShopOwner(long id);
    
    void deleteShopOwner(long id);
}
