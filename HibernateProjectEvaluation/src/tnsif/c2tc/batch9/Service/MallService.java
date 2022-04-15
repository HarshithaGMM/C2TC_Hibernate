package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.Mall;

public interface MallService {

	void addMall(Mall m);

	public void update(Mall m);

	public Mall searchMall(int id);
	
    public boolean  deleteMall(int id);

}
