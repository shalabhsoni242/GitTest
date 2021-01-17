package com.app.tester;
//Tester CLass
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import com.app.core.Books;
import com.app.core.Customer;

import ExceptionUtils.ApplicationException;

import static Utils.UserValidation.*;
import static Utils.BookUtils.*;
import static Utils.CustomerUtils.*;
public class ApplicationTester {

	public static void main(String[] args) {
		//hashmap to store to the books
		HashMap<String, Books> bookMap = populateBookDetails();
		
		//ArrayList to store the customer
		ArrayList<Customer> custList = populateCustomerDetails();
		
		//hashmap to add books to the cart
		HashMap<String, Double> cart = new HashMap<>();
 		
		boolean flag = true;
 		String bookT;
 		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("*************WELCOME*************");
			System.out.println();
			System.out.println("1. LOGIN AS ADMIN\n2. LOGIN AS CUSTOMER\nENTER YOUR CHOICE:");
			
			if(sc.nextInt()==1) { // Admin view  CREDENTIALS :  EMAIL : admin@gmail.com  PASSWORD : Admin@123
				System.out.println("Enter Admin E-mail & Password");
				if(validateAdmin(sc.next(), sc.next())) { //validating admin 
					bookMap.values().stream().forEach(System.out :: println);// show book details to admin
					System.out.println();
					custList.stream().forEach(System.out :: println);// show customer details to admin
				}					
			}
			else { //Customer view
				System.out.println("Enter CustomerName,  E-mail & Password");
				validateCustomer(sc.next(), sc.next(), sc.next(), custList); //validating customer
				System.out.println("BOOKS IN STOCK : ");
				bookMap.values().stream().forEach(System.out :: println);// show book details to customer
				while(flag) {
				System.out.println("\n***************MENU**************\n1. ADD BOOKS TO YOUR CART\n2. SHOW CART CONTENTS\n3. REMOVE BOOKS FROM YOUR CART\n4. LOG OUT\nEnter you choice:");
				
				
					switch(sc.nextInt()) {
					case 1://add books to cart
						System.out.println("Enter book Title");
						bookT = sc.nextLine()+sc.nextLine();
						int qty, price ;
						if(bookMap.containsKey(bookT)) {
							for(Books book : bookMap.values())
							{
								if(book.getBookTitle().equals(bookT))
								{
									System.out.println("Enter quantity");
									qty = sc.nextInt();
									price = (int) (qty * book.getBookPrice());
									cart.put(bookT, (double) price);
									System.out.println("Book added to the cart!!!");
									break;
								}
							}
						}
						break;
						
					case 2:// showing books in the cart
						//System.out.println(cart);
						cart.forEach((k,v) -> System.out.format("Book title : %s,  Price :%,.2f%n",k, v));
						break;
						
					case 3://remove books from cart
						System.out.println("Enter the name of the book you want yo remove:");
						bookT = sc.nextLine()+sc.nextLine();
						if(cart.containsKey(bookT)) {
							cart.remove(bookT);
							System.out.println("Book removed Succesfully from the cart!!!");
						}
						else
							throw new ApplicationException("Book already exist in the cart");
						break;
						
					case 4 :// calculating total amount of the books present in the cart 
						double total = 0;
						for(Double d : cart.values()) {
							total+=d;
						}
						//System.out.println(cart);
						cart.forEach((k,v) -> System.out.format("Book title : %s,  Price :%,.2f%n",k, v));
						System.out.println("TOTAL AMT : Rs."+total);
						System.out.println("Thank you....");
						flag = false;
						break;

					default:
						flag = false;
						break;
					}
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
}





