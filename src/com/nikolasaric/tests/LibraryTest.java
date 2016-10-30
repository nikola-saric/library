package com.nikolasaric.tests;

import java.util.List;

import org.junit.Test;

import com.nikolasaric.Book;
import com.nikolasaric.Library;

import junit.framework.Assert;

public class LibraryTest {

	@Test
	public void testAddBook() {
		Library library = new Library();
		List<Book> books = library.getAllBooks();
		Assert.assertTrue(books.isEmpty());
		Book book = new Book("dasd", 14, "dsd", 434, 43);
		library.addBook(book);
		Assert.assertTrue(!library.getAllBooks().isEmpty());
		Assert.assertEquals(book, books.get(0));
	}

	@Test
	public void testDeleteBook() {
		Library library = new Library();
		List<Book> books = library.getAllBooks();
		Assert.assertTrue(books.isEmpty());
		Book book = new Book("dasd", 14, "dsd", 434, 43);
		books.add(book);
		Assert.assertTrue(!library.getAllBooks().isEmpty());
		library.deleteBook("dasd");
		Assert.assertTrue(library.getAllBooks().isEmpty());
	}

	@Test
	public void testSearchBook() {
		Library library = new Library();
		List<Book> books = library.getAllBooks();
		Assert.assertTrue(books.isEmpty());
		Book book = new Book("dasd", 14, "dsd", 434, 43);
		Book book2 = new Book("newBook", 15, "ada", 321, 33);
		books.add(book);
		books.add(book2);
		Assert.assertTrue(!library.getAllBooks().isEmpty());
		Assert.assertEquals(book2, library.searchBook("newBook"));

	}
}
