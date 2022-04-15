package tnsif.c2tc.batch9.Dao;


import javax.persistence.EntityManager;

import tnsif.c2tc.batch9.Entity.MallAdmin;



public class MallAdminDaoImpl implements MallAdminDao {
   EntityManager entityManager;
   public MallAdminDaoImpl() {
	   entityManager=Configuration.getEntityManager();
   }
	   
	@Override
	public void addAdmin(MallAdmin MA) {
		entityManager.persist(MA);
	}

	@Override
	public void getTranscation() {
	   entityManager.getTransaction().begin();	
	}

	@Override
	public void endTransaction() {
	  entityManager.getTransaction().commit();
		
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin ma=entityManager.find(MallAdmin.class, id);
		return ma;
	}

	@Override
	public void updateAdmin(MallAdmin mA) {
		entityManager.merge(mA);
		
	}

	@Override
	public boolean deleteAdmin(int id) {
		MallAdmin ma=entityManager.find(MallAdmin.class, id);
		entityManager.remove(ma);
		return false;
	}

}
