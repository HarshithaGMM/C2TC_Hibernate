package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.CustomerDao;
import tnsif.c2tc.batch9.Dao.CustomerDaoImpl;
import tnsif.c2tc.batch9.Entity.Customer;
import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Item;
import tnsif.c2tc.batch9.Entity.User;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao cd;
	
public CustomerServiceImpl()
{
	cd= new CustomerDaoImpl();
}
	@Override
	public void addCustomer(Customer customer) {
		cd.startTransaction();
		cd.addCustomer(customer);
		cd.endTransaction();
	}
	@Override
	public void updateCustomer(Customer customer) {
		cd.startTransaction();
		cd.updateCustomer(customer);
		cd.endTransaction();
		
	}
	@Override
	public boolean deleteCustomer(int id) {
		cd.startTransaction();
		cd.deleteCustomer(id);
		cd.endTransaction();
		return false;
	}
	@Override
	public Customer searchCustomer(int id) {
		Customer cs=cd.searchCustomer(id);
		return cs;
	}
	
	
	@Override
	public void updateItem(Item item) {
		cd.startTransaction();
		cd.updateItem(item);
		cd.endTransaction();
		
	}
	@Override
	public void addItem(Item item) {
		cd.startTransaction();
		cd.addItem(item);
		cd.endTransaction();
		
		
	}
	@Override
	public boolean deleteItem(int id) {
		cd.startTransaction();
		cd.deleteItem(id);
		cd.endTransaction();
		return false;
	}
	@Override
	public Item searchItem(long id) {
		Item it=cd.searchItem(id);
		
		return it;
	}
	@Override
	public void addUser(User user) {
		cd.startTransaction();
		cd.addUser(user);
		cd.endTransaction();
		
	}
	@Override
	public void updateUser(User user) {
		cd.startTransaction();
		cd.updateUser(user);
		cd.endTransaction();
		
	}
	@Override
	public User searchUser(int id) {
		User us=cd.searchUser(id);
		
		return us;
	}
	@Override
	public boolean deleteUser(int id) {
		cd.startTransaction();
		cd.deleteUser(id);
		cd.endTransaction();
		return false;
		
	}
	
}
