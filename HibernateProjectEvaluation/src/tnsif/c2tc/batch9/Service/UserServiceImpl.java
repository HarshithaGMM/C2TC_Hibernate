package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.UserDao;
import tnsif.c2tc.batch9.Dao.UserDaoImpl;
import tnsif.c2tc.batch9.Entity.User;

public class UserServiceImpl implements UserService {
	UserDao ud;
	public UserServiceImpl() {
	}
	{
		ud= new UserDaoImpl();
	}

	@Override
	public void addUser(User user)
	{
	ud.startTransaction();
	ud.addUser(user);
	ud.endTransaction();
		
	}

	@Override
	public void updateUser(User user) {
		ud.startTransaction();
		ud.updateUser(user);
		ud.endTransaction();
		
	}

	@Override
	public User searchUser(int id) {
	User us=ud.searchUser(id);		
			return us;
	}

	@Override
	public boolean deleteUser(int id) {
		ud.startTransaction();
		ud.deleteUser(id);
		ud.endTransaction();
		return false;
		
	}


}
