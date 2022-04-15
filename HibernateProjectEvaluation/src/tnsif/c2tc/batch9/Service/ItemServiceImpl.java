package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Dao.ItemDao;
import tnsif.c2tc.batch9.Dao.ItemDaoImpl;
import tnsif.c2tc.batch9.Entity.Item;

public class ItemServiceImpl implements ItemService{
	ItemDao itd;
	public ItemServiceImpl()
	{
	itd=new ItemDaoImpl();
	}
	@Override
	public Item addItem(Item item) {
		itd.startTransaction();                                                                                              
		itd.addItem(item);
		itd.endTranscation();
		return item;
	}
	@Override
	public Item updateItem(Item item) {
		itd.startTransaction();                                                                                              
		itd.updateItem(item);
		itd.endTranscation();
		return item;
	}
	@Override
	public Item searchItem(long id) {
		Item list=itd.searchItem(id);
		return list;
	}
	@Override
	public boolean deleteItem(long id) {
		itd.startTransaction();                                                                                              
		itd.deleteItem(id);
		itd.endTranscation();
		return false;
		
		
	}
	
	
}
