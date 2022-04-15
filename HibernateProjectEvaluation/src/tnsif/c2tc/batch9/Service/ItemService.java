package tnsif.c2tc.batch9.Service;

import tnsif.c2tc.batch9.Entity.Item;

public interface ItemService {

	public Item addItem(Item item);

	public Item updateItem(Item item);

	public Item searchItem(long id);

	public boolean deleteItem(long id);

}
