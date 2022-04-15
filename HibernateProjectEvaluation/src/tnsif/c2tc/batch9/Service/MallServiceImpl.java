package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.MallServiceDao;
import tnsif.c2tc.batch9.Dao.MallServiceDaoImpl;
import tnsif.c2tc.batch9.Entity.Mall;

public class MallServiceImpl implements MallService {
    MallServiceDao MD;
    public MallServiceImpl() {
		MD=new MallServiceDaoImpl();
    }
	@Override
	public void addMall(Mall M) {
		MD.getTransaction();
		MD.addMall(M);
	    MD.endTransaction();	
	}
	@Override
	public void update(Mall m) {
		MD.getTransaction();
		MD.updateMall(m);
	    MD.endTransaction();
		
	}
	@Override
	public Mall searchMall(int id) {
		Mall ma=MD.searchMall(id);
		return ma;
	}
	@Override
	public boolean deleteMall(int id) {
		MD.getTransaction();
		MD.deleteMall(id);
	    MD.endTransaction();
		return false;
		
	}
	

}
