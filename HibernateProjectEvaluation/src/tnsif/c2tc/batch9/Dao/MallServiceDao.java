package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.Mall;

public interface MallServiceDao {

	void addMall(Mall m);

	void getTransaction();

	void endTransaction();

	public Mall searchMall(int id);

	public boolean deleteMall(int id);

	public void updateMall(Mall m);

}
