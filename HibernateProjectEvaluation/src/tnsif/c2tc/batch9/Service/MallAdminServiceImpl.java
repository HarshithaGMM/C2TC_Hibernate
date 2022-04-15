package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.MallAdminDao;
import tnsif.c2tc.batch9.Dao.MallAdminDaoImpl;
import tnsif.c2tc.batch9.Entity.MallAdmin;

public class MallAdminServiceImpl implements MallAdminService {
MallAdminDao MD;
public MallAdminServiceImpl() {
	MD=new MallAdminDaoImpl();
}
	public void addAdmin(MallAdmin MA) {
    MD.getTranscation();
	MD.addAdmin(MA);
	MD.endTransaction();
	}
	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin ma=MD.searchMallAdmin(id);
		return ma;
	}
	@Override
	public void updateMallAdmin(MallAdmin mA) {
		MD.getTranscation();
		MD.updateAdmin(mA);
		MD.endTransaction();
		
	}
	@Override
	public boolean deleteMallAdmin(int id) {
		MD.getTranscation();
		MD.deleteAdmin(id);
		MD.endTransaction();
		return false;
	}

}
