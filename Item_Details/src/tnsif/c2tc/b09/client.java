package tnsif.c2tc.b09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tnsif.c2tc.b09.Entity.Category;
import tnsif.c2tc.b09.Entity.Item;
import tnsif.c2tc.b09.Service.ItemService;
import tnsif.c2tc.b09.Service.ItemServiceImpl;

public class client {

	public static void main(String[] args) throws ParseException {
		ItemService service=new ItemServiceImpl();
		Item item=new Item();
		item.setId(17701002);
		item.setItemName("Redmi90");
		String datastring1="01-01-2000";
		String datastring2="01-01-2005";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=format.parse(datastring1);
		Date date2=format.parse(datastring2);
		item.setManufacturing(date1);
		item.setExpiry(date2);
		item.setPrice(35000f);
		item.setCategory(Category.MOBILES);
		//service.addItem(item);
		service.updateItem(item);
		System.out.println(service.searchItem(17701001));
		//System.out.println(service.deleteItem(17701002));

	}

}
