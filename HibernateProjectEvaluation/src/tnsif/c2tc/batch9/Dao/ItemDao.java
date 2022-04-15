package tnsif.c2tc.batch9.Dao;

import tnsif.c2tc.batch9.Entity.Item;

public interface ItemDao {

	public void startTransaction();

	public Item addItem(Item item);

	public void endTranscation();

	public Item updateItem(Item item);

	public Item searchItem(long id);

	public boolean deleteItem(long id);

}
