package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.Customer;

import tnsif.c2tc.batch9.Entity.Item;
import tnsif.c2tc.batch9.Entity.User;

public interface CustomerDao {

	public void startTransaction();

	public void addCustomer(Customer customer);

	public void endTransaction();

	public void updateCustomer(Customer customer);

	public boolean deleteCustomer(int id);

	public Customer searchCustomer(int id);

	public Item searchItem(long id);

	public void addItem(Item item);

	public void updateItem(Item item);

	public boolean deleteItem(int id);



	public void updateUser(User user);

	public void addUser(User user);

	public User searchUser(int id);

	public void deleteUser(int id);

}
