package com.nikolasaric;

public class Book {

	String title;
	long bookId;
	String bookAuthor;
	int bookNumberOfPages;
	int bookPublishedOn;

	public Book(String title, long id, String author, int numberOfPages, int publishedOn) {
		this.title = title;
		bookId = id;
		bookAuthor = author;
		bookNumberOfPages = numberOfPages;
		bookPublishedOn = publishedOn;
	}

}
