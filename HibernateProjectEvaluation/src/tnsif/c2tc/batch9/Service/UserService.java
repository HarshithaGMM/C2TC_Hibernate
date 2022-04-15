package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.User;

public interface UserService {
	public void addUser(User user);

	public void updateUser(User user);

	public User searchUser(int i);

	public boolean deleteUser(int id);

	

	

	



}
