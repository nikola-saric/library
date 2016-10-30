package com.nikolasaric;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<Book>();

	public void addBook(Book book) {

		books.add(book);

	}

	public void deleteBook(String title) {
		Book foundBook = searchBook(title);

		if (foundBook != null) {
			books.remove(foundBook);

		}

	}

	public Book searchBook(String titleOfBookToSearch) {

		for (Book book : books) {

			if (book.getBookTitle().equalsIgnoreCase(titleOfBookToSearch)) {

				return book;
			}
		}
		return null;
	}

	public List<Book> getAllBooks() {
		return books;
	}

}
