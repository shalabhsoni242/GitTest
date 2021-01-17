package com.app.core;

public class Customer {
//Customer class that stores the details of the customer
	private String custName, custEmail, custPassword;
	// parameterized constructor to initialize the details of the customer 
	public Customer(String custName, String custEmail, String pass) {
		super();
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPassword = pass;
	}
	//getter to get the name of the customer
	public String getCustName() {
		return custName;
	}
	//setter to set the name of the customer
	public void setCustName(String custName) {
		this.custName = custName;
	}
	//getter to get the name of the email
	public String getCustEmail() {
		return custEmail;
	}
	//getter to get the email of the customer
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	//setter to set the password of the customer
	public String getCustPassword() {
		return custPassword;
	}
	//getter to get the password of the customer
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	// Overridden toString() to display the details associated with the customer
	@Override
	public String toString() {
		return "Customer Details : Customer Name : " + custName + ", Customer Email : " + custEmail + ", Password : "+custPassword;
	}
	
	//equals method to equate the customer's email and password, i.e later used for customer validation
	public boolean equals(Customer cust) {
		if(custEmail.equals(cust.custEmail) && custPassword.equals(cust.custPassword)) {
			return true;
		}
		return false;
	}
	
}
