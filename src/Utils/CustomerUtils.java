package Utils;

import java.util.ArrayList;

import com.app.core.Customer;

public class CustomerUtils {
	//method to populate the customer details and return array list of customer details to the caller
	public static ArrayList<Customer> populateCustomerDetails(){
		ArrayList<Customer> custList = new ArrayList<>();
		custList.add(new Customer("TonyS", "strak@gmail.com", "Stark@1998"));
		custList.add(new Customer("Steve", "steve@gmail.com", "Rogers@1998"));
		custList.add(new Customer("Munna", "munna@gmail.com", "Tripathi@1998"));
		custList.add(new Customer("Akhandanand", "kaleen@gmail.com", "Kaleen@1998"));
		custList.add(new Customer("Guddu", "guddu@gmail.com", "Guddu@1998"));
		return custList;
	}
	
}
