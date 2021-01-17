package com.app.core;

import java.time.LocalDate;
// books class that has books details such as book name, book type, book price, publish date, book rating and author details...
public class Books {
	private String bookTitle;
	private int qty, rating;
	private double bookPrice;
	private Category cat;
	private LocalDate publishDate;
	private Author aut; 
	
	// parameterized constructor to initialize the details of the books 
	public Books(String bookTitle, int qty, int rating, double bookPrice, Category cat, LocalDate date) {
		super();
		this.bookTitle = bookTitle;
		this.qty = qty;
		this.rating = rating;
		this.bookPrice = bookPrice;
		this.publishDate = date;
		this.cat = cat;
	}
	
	// getter for getting book name 
	public String getBookTitle() {
		return bookTitle;
	}

	// getter for getting book price 
	public double getBookPrice() {
		return bookPrice;
	}

	// Overridden toString() to display the details associated with the books
	@Override
	public String toString() {
		return "Books Details : Book Title : " + bookTitle + ",  Available quantity : " + qty + ", Book Rating : " + rating + ", Price : " + bookPrice
				+ ", Book Category : " + cat + ", Publish Date : "+publishDate+"  "+aut.toString();
	}
	
	//method to add author details
	public void linkAuthor(String name, String email) {
		aut = new Author(name, email);
	}
	
	//private class to store authors associated with the books
	private class Author{
		private String authorName, authorEmail;

		public Author(String authorName, String authorEmail) {
			super();
			this.authorName = authorName;
			this.authorEmail = authorEmail;
		}
		
		// Overridden toString() to display the details associated with the authors
		@Override
		public String toString() {
			return "Author Details : Author Name : " + authorName + ", Author Email : " + authorEmail;
		}
		
		
	}

	
	
}
