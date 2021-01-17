package Utils;
//validation class
import java.util.ArrayList;

import com.app.core.Customer;

import ExceptionUtils.ApplicationException;

public class UserValidation {
	//method to validate the admin credentials : returns true if the user is the valid Admin
	public static boolean  validateAdmin(String email, String pass) throws ApplicationException{
		validateEmail(email);   // method to validate the email structure : contains @ , gmail.com etc....
		validatePassword(pass);  // method to validate the password structure : contains capital letters, special characters, numerics etc...
		if(email.equals("admin@gmail.com") && pass.equals("Admin@123")) {
			System.out.println("LOGIN SUCCESSFULL !!\nWELCOME ADMIN");
			return true;
		}			
		else
			throw new ApplicationException("Incorrect Credentials !!!\tPlease try again!!!");
	}
	
	//method to validate the customers credentials : returns true if the user is the valid customer
	public static ArrayList<Customer> validateCustomer(String Name, String email, String pass,ArrayList<Customer> custList) throws ApplicationException{
		validateName(Name);  // method to validate the name structure : name should of greater than of 4 characters minimum
		validateEmail(email);  // method to validate the email structure : contains @ , gmail.com etc....
		validatePassword(pass);   // method to validate the password structure : contains capital letters, special characters, numerics etc...
		
		Customer cust = new Customer(Name, email, pass);
		for(Customer c : custList) {
			if(c!=null && c.equals(cust)) {
				System.out.println("LOGIN SUCCESSFULL !!\\nWELCOME CUSTOMER");
				return custList;
			}			
		}	
		throw new ApplicationException("Incorrect Credentials !!!\tPlease try again!!!");
	}
	
	// method to validate the name structure
	public static void validateName(String name) throws ApplicationException{
		if(name.length() < 4)
			throw new ApplicationException("Invalid Name : Name should be of more than 4 charachters");
	}
	
	// method to validate the email structure
	public static void  validateEmail(String email) throws ApplicationException {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(!email.matches(regex)) 
			throw new ApplicationException("Invalid Email!!!\tPlease Enter email in  valid format");
	}
	
	// method to validate the password structure
	public static void  validatePassword(String pass) throws ApplicationException {
		String regex =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{6,20}$";
		if(!pass.matches(regex)) 
			throw new ApplicationException("Invalid password!!!\tPlease Enter password in  valid format");
	}
	
}
