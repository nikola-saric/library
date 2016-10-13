package com.nikolasaric;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	public static Scanner someInput = new Scanner(System.in);

	List<Book> books = new ArrayList<Book>();

	public void addBook(Book book) {

		books.add(book);

		someInput.nextLine();
	}

	public void deleteBook(Book book) {

		books.remove(book);

		someInput.nextLine();
	}

	public void getBook() {
		books.forEach(System.out::println);
		
		someInput.nextLine();

	}

}
