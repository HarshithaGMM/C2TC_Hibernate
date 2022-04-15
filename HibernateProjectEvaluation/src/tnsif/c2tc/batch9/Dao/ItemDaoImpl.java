package tnsif.c2tc.batch9.Dao;



import javax.persistence.EntityManager;

import tnsif.c2tc.batch9.Entity.Item;








public class ItemDaoImpl implements ItemDao{
	EntityManager em;
	public ItemDaoImpl()
	{
		em=Configuration.getEntityManager();
	}
	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}
	@Override
	public Item addItem(Item item) {
		em.persist(item);
		return item;
		
		
	}
	@Override
	public void endTranscation() {
		em.getTransaction().commit();
		
	}
	@Override
	public Item updateItem(Item item) {
	 return em.merge(item);
		
	}
	@Override
	public Item searchItem(long id) {
		Item s=em.find(Item.class, id);
		return s;
	}
	@Override
	public boolean deleteItem(long id) {
         Item s=em.find(Item.class, id);
		em.remove(s);
		return false;
	}

}
