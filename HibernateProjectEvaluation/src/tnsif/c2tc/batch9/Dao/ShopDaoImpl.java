package tnsif.c2tc.batch9.Dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Shop;
import tnsif.c2tc.batch9.Entity.ShopOwner;




public class ShopDaoImpl implements ShopDao {
	EntityManager entityManager;
	public ShopDaoImpl() {
		entityManager=Configuration.getEntityManager();
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
	public Shop seachShopById(long Id) {
		// TODO Auto-generated method stub
		Shop shop=entityManager.find(Shop.class, Id);
		return shop;
	}
	@Override
	public boolean deleteShop(long id) {
		// TODO Auto-generated method stub
		Shop shop=entityManager.find(Shop.class, id);
		entityManager.remove(shop);
		return false;
		
	}
	
	@Override
	public Shop updateShop(Shop s) {
		// TODO Auto-generated method stub
		Shop shop=entityManager.merge(s);
		return shop;
	}
	@Override
	public Shop addShop(Shop s) {
		// TODO Auto-generated method stub
		entityManager.persist(s);
		return s;
		
	}
	@Override
	public boolean deleteShopOwner(int id) {
		ShopOwner shop=entityManager.find(ShopOwner.class, id);
		entityManager.remove(shop);
				
		return false;
	}
	@Override
	public void addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		
	}
	@Override
	public void updateShopOwner(ShopOwner shopOwner) {
	    entityManager.merge(shopOwner);
		
	}
	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}



	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
		
	}



	@Override
	public Employee searchEmployee(int id) {
		Employee es=entityManager.find(Employee.class, id);
		return es;
	}



	@Override
	public boolean deleteEmployee(int id) {
		Employee es=entityManager.find(Employee.class, id);
		entityManager.remove(es);
		return false;
	}
	
	
	
	}
	
	

