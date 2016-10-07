package com.nikolasaric;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	public static Scanner userInput = new Scanner(System.in);

	List<Book> books = new ArrayList<Book>();

	public void addBook(Book book) {

		int size = books.size();
		// System.out.println("Unesi Id");
		long newId = size++;

		System.out.println("Unesi naziv knjige");
		String newTitle = userInput.next();

		System.out.println("Unesi autora");
		String newAuthor = userInput.next();

		System.out.println("Unesi kad je izdata");
		int newPublishedOn = userInput.nextInt();

		System.out.println("Unesi broj strana");
		int newNumberOfPages = userInput.nextInt();

		// public Book(long id, String title, String author, int publishedOn,
		// int numberOfPages)
		Book newBook = new Book(newId, newTitle, newAuthor, newPublishedOn, newNumberOfPages);
		books.add(newBook);

		// Test

		System.out.println("Id of this book is:" + newId);
	}

	public void deleteBook(int newId) {

		System.out.println("Unesite Id knjige koju zelite da obrisete.");
		int deleteById = userInput.nextInt();

		books.remove(deleteById);

	}
	
	public void showList() {
		
		System.out.println(Arrays.toString(books.toArray()));
	}

}
