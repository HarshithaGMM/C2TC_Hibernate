package tnsif.c2tc.batch9;

import java.text.SimpleDateFormat;
import java.util.Date;

import tnsif.c2tc.batch9.Entity.Categories;
import tnsif.c2tc.batch9.Entity.Category;
import tnsif.c2tc.batch9.Entity.Customer;
import tnsif.c2tc.batch9.Entity.Employee;
import tnsif.c2tc.batch9.Entity.Item;
import tnsif.c2tc.batch9.Entity.Mall;
import tnsif.c2tc.batch9.Entity.MallAdmin;
import tnsif.c2tc.batch9.Entity.Shop;
import tnsif.c2tc.batch9.Entity.ShopOwner;
import tnsif.c2tc.batch9.Entity.User;
import tnsif.c2tc.batch9.Entity.shopCategory;
import tnsif.c2tc.batch9.Entity.shopStatus;
import tnsif.c2tc.batch9.Service.CustomerService;
import tnsif.c2tc.batch9.Service.CustomerServiceImpl;
import tnsif.c2tc.batch9.Service.EmployeeService;
import tnsif.c2tc.batch9.Service.EmployeeServiceImpl;
import tnsif.c2tc.batch9.Service.ItemService;
import tnsif.c2tc.batch9.Service.ItemServiceImpl;
import tnsif.c2tc.batch9.Service.MallAdminService;
import tnsif.c2tc.batch9.Service.MallAdminServiceImpl;
import tnsif.c2tc.batch9.Service.MallService;
import tnsif.c2tc.batch9.Service.MallServiceImpl;
import tnsif.c2tc.batch9.Service.ShopOwnerImpl;
import tnsif.c2tc.batch9.Service.ShopOwnerService;
import tnsif.c2tc.batch9.Service.ShopService;
import tnsif.c2tc.batch9.Service.ShopServiceImpl;
import tnsif.c2tc.batch9.Service.UserService;
import tnsif.c2tc.batch9.Service.UserServiceImpl;


public class Client {

	public static void main(String[] args) throws Exception {
		
		EmployeeService service1=new EmployeeServiceImpl();
		Employee employee=new Employee();
		employee.setId(10001203);
		employee.setName("Srinivas ");
		String datastring1="01-01-2001";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=format.parse(datastring1);
		employee.setDob(date1);
		employee.setSalary(20000.0f);
		employee.setAddress("Bangalore");
		employee.setDesignation("Maneger");
		//service1.addEmployee(employee);
		//service1.updateEmployee(employee);
		System.out.println(service1.searchEmployee(10001202));
		/*try {
			System.out.println(service1.deleteEmployee(10001204));
		}
		catch(Exception e) {
			System.out.println("Not Found");
		}*/
		
		
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		customer.setId(657485);
		customer.setName("shravani gowda");
		customer.setOrders("mobile");
		customer.setPhone(9663261);
		customer.setEmail("shravani@gmailcom");
		//service.addCustomer(customer);
		//service.updateCustomer(customer);
		//System.out.println(service.searchCustomer(657485));
		/*try {
			System.out.println(service.deleteCustomer(657489));
		}
		catch(Exception e) {
			System.out.println("Not Found");
		}*/
	
		
		Shop s=new Shop();
		ShopService ss=new ShopServiceImpl();
		s.setShopId(153002);
		s.setShopName("stationary1");
		s.setLeaseStatus("available");
		s.setShopOwner("ramesh ad");
		//s.setShopEmployees("Srinivas");
		//s.setCustomers("rani");
		s.setShopCategory(shopCategory.WHOLESLE);
		s.setShopStatus(shopStatus.OPENED);
		//ss.addShop(s);
		//System.out.print("shop is added successfully");
        ss.updateShop(s);
        //System.out.print("shop is updated");
      //System.out.println(ss.seachShopById(153003));
      /* try {
    	 System.out.println(ss.deleteShop(153002));
       }
       catch(Exception e) {
    	  System.out.println("Not Found");
       }*/
       
		
		
		MallAdminService MS1= new MallAdminServiceImpl();
		MallAdmin MA= new MallAdmin();
		MA.setId(91743);
		MA.setName("Santhosh");
		MA.setPassword("Sa@7483678");
		MA.setPhone(7483623035L);
		//MS1.addAdmin(MA);
		//MS1.updateMallAdmin(MA);
       // System.out.println(MS1.searchMallAdmin(91743));
		/*try {
			System.out.println(MS1.deleteMallAdmin(9174));
		}
		catch(Exception e) {
			System.out.println("Not Found");
		}*/
		   
		   MallService MS= new MallServiceImpl();
			Mall M=new Mall();
			M.setId(917091);
	        M.setLocation("Rajajinagar");
	        M.setMallName("Orion");
	        M.setCategories(Categories.REGIONAL);
	       //MS.addMall(M);
	       // MS.update(M);
	      // System.out.println(MS.searchMall(917091));	
	        /*try {
	        	System.out.println(MS.deleteMall(9170903));
	        }
	        catch(Exception e) {
	        	System.out.println("Not Found");
	        }*/
	        
		
		ShopOwner shopOwner=new ShopOwner();
		ShopOwnerService ss1=new ShopOwnerImpl();
		shopOwner.setName("rajesh kumar");
		shopOwner.setId(100002);
		String datastring2="01-01-2000";
		SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yyyy");
		Date date=format1.parse(datastring2);
		shopOwner.setDob(date);
		shopOwner.setShop("Ramu");
		//ss1.addShopOwner(shopOwner);
		//ss1.updateShopOwner(shopOwner);
		//System.out.println(ss1.searchShopOwner(10001));
		/*try {
			System.out.println(ss1.deleteShopOwner(1004));
		}
		catch(Exception e) {
			System.out.println("Not Found");
		}*/
		

		
		ItemService service2=new ItemServiceImpl();
		Item item=new Item();
		item.setId(17701003);
		item.setItemName("Redmi90");
		String datastring3="01-01-2000";
		String datastring4="01-01-2005";
		SimpleDateFormat format3=new SimpleDateFormat("dd-MM-yyyy");
		Date date3=format3.parse(datastring3);
		Date date4=format3.parse(datastring4);
		item.setManufacturing(date3);
		item.setExpiry(date4);
		item.setPrice(35000f);
		item.setCategory(Category.MOBILES);
		//service2.addItem(item);
		service2.updateItem(item);
		System.out.println(service2.searchItem(17701001));
		/*try {
			System.out.println(service2.deleteItem(17701002));
		}
		catch(Exception e) {
			System.out.println("Not Found");
		}*/
		
		UserService service3=new UserServiceImpl();
		User user=new User();
		user.setId(1002);
		user.setName("Ram");
		user.setType("New customer");
		user.setPassword("kushal BS");
		//service3.addUser(user);
		//service3.updateUser(user);
	//System.out.println(service3.searchUser(101));
	/*try {
		System.out.println(service3.deleteUser(67480011));
	}
	catch(Exception e) {
		System.out.println("Not Found");
	}*/
	}

}
