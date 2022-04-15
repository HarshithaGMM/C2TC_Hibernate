package tnsif.c2tc.batch9.Dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.batch9.Entity.Customer;
import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Item;
import tnsif.c2tc.batch9.Entity.User;



public class CustomerDaoImpl implements CustomerDao {
	EntityManager entityManager;
	public CustomerDaoImpl()
	{
		 entityManager = Configuration.getEntityManager();
	}
	
	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
		
	}
	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}
	@Override
	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
	}



	@Override
	public boolean deleteCustomer(int id) {
		Customer cus=entityManager.find(Customer.class, id);
		entityManager.remove(cus);
		return false;
	}



	@Override
	public Customer searchCustomer(int id) {
		Customer cus=entityManager.find(Customer.class, id);
		return cus;
	}
	@Override
	public Item searchItem(long id) {
		Item it=entityManager.find(Item.class, id);
		return it;
	}
	@Override
	public void addItem(Item item) {
		entityManager.persist(item);
		
	}
	@Override
	public void updateItem(Item item) {
		entityManager.merge(item);
		
	}
	@Override
	public boolean deleteItem(int id) {
		Item is=entityManager.find(Item.class, id);
		entityManager.remove(is);
		return false;
	}


	


	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public User searchUser(int id) {
		User us=entityManager.find(User.class, id);
		return us;
	}

	@Override
	public void deleteUser(int id) {
		entityManager.remove(id);
		
	}
	
}