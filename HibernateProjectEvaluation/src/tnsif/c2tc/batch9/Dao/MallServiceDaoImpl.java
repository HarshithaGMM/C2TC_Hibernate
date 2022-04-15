package tnsif.c2tc.batch9.Dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.batch9.Entity.Mall;



public class MallServiceDaoImpl implements MallServiceDao {
   EntityManager entityManager;
   public MallServiceDaoImpl() {
	entityManager=Configuration.getEntityManager();
}
	@Override
	public void addMall(Mall M) {
		entityManager.persist(M);
	}
	@Override
	public void getTransaction() {
		entityManager.getTransaction().begin();
	}
	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}
	@Override
	public Mall searchMall(int id) {
		Mall ma=entityManager.find(Mall.class, id);
		return ma;
	}
	@Override
	public boolean deleteMall(int id) {
		entityManager.remove(id);
		return false;
		
	}
	@Override
	public void updateMall(Mall m) {
		entityManager.merge(m);
		
	}
		
}

