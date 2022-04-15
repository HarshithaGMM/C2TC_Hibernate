package tnsif.c2tc.batch9.Dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.batch9.Entity.ShopOwner;



public class ShopOwnerDaoImpl  implements ShopOwnerDao{
EntityManager entityManager;
public ShopOwnerDaoImpl()
{
	entityManager=Configuration.getEntityManager();
}
@Override
public void addShopOwner(ShopOwner shopOwner) {
	// TODO Auto-generated method stub
	entityManager.persist(shopOwner);
}
@Override
public void startTransaction() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().begin();
}
@Override
public void endTransaction() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().commit();
}
@Override
public void updateShopOwner(ShopOwner shopOwner) {
	// TODO Auto-generated method stub
	entityManager.merge(shopOwner);
	
}
@Override
public ShopOwner searchShopOwner(long id) {
	// TODO Auto-generated method stub
	ShopOwner so=entityManager.find(ShopOwner.class,id);
	return so;
}
@Override
public void deleteShopOwner(long id) {
	// TODO Auto-generated method stub
	ShopOwner so=entityManager.find(ShopOwner.class, id);
    entityManager.remove(so);
}


}
