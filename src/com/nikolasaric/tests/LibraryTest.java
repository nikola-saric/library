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
		Assert.assertEquals("dasd", book.getBookTitle());
	}

	@Test
	public void testDeleteBook() {
		Library library = new Library();
		List<Book> books = library.getAllBooks();
		Assert.assertTrue(books.isEmpty());
		Book book = new Book("dasd", 14, "dsd", 434, 43);
		library.addBook(book);
		Assert.assertTrue(!library.getAllBooks().isEmpty());
		Assert.assertEquals("dasd", book.getBookTitle());
		library.deleteBook(null);
		Assert.assertTrue(!library.getAllBooks().isEmpty());
		Assert.assertEquals("dasd", book.getBookTitle());
		library.deleteBook("dasd");
		Assert.assertTrue(library.getAllBooks().isEmpty());
	}

	@Test
	public void testSearchBook() {
		Library library = new Library();
		List<Book> books = library.getAllBooks();
		Assert.assertTrue(books.isEmpty());
		Book book = new Book("dasd", 14, "dsd", 434, 43);
		library.addBook(book);
		Assert.assertTrue(!library.getAllBooks().isEmpty());
		Assert.assertEquals(book.getBookTitle(), "dasd");

	}
}
