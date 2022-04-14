package tnsif.c2tc.b09.Dao;



import tnsif.c2tc.b09.Entity.Item;

public interface ItemDao {

	public void startTransaction();

	public Item addItem(Item item);

	public void endTranscation();

	public Item updateItem(Item item);

	public Item searchItem(long id);

	public boolean deleteItem(long id);

}
