package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.Customer;

import tnsif.c2tc.batch9.Entity.Item;
import tnsif.c2tc.batch9.Entity.User;

public interface CustomerService {

	public void addCustomer(Customer  customer);

	public void updateCustomer(Customer customer);

	public boolean deleteCustomer(int id);

	public Customer searchCustomer(int id);
	public void updateItem(Item item);

	

	public void addItem(Item item);

	public boolean deleteItem(int id);

	public Item searchItem(long id);

	public void addUser(User user);

	public void updateUser(User user);

	public User searchUser(int id);

	public boolean deleteUser(int id);

}	

	
	
