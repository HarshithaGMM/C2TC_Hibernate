package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.MallAdmin;

public interface MallAdminService {

	public void addAdmin(MallAdmin MA);

	public MallAdmin searchMallAdmin(int id);

	public void updateMallAdmin(MallAdmin mA);

	public boolean deleteMallAdmin(int id);

}
