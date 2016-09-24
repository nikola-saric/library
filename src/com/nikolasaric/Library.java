package com.nikolasaric;

//Collects informations about books and prints them out.
public class Library {

	
	public static void main(String[] args) {
		Books newBooks = new Books();

		
		if(newBooks.getId() == 0) {
			System.out.println("Invalid Id.");
		}else {
		System.out.println("Inserted Id is " + newBooks.getId());
		System.out.println(newBooks.getAuthor());
		System.out.println("Number of pages: " + newBooks.getNumOfPages());
		System.out.println("Price is " + newBooks.getPrice() + "$");
		
		}
	}
}
