package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.MallAdmin;

public interface MallAdminDao {

	public void addAdmin(MallAdmin MA);

	void getTranscation();

	void endTransaction();

	public MallAdmin searchMallAdmin(int id);

	public void updateAdmin(MallAdmin mA);

	public boolean deleteAdmin(int id);

}
