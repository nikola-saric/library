package com.nikolasaric;

public class Book {

	private String bookTitle;
	private long id;
	private String author;
	private int numberOfPages;
	private int publishedOn;

	public Book(String title, long id, String author, int numberOfPages, int publishedOn) {
		bookTitle = title;
		this.id = id;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publishedOn = publishedOn;
	}

	public long getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int getPublishedOn() {
		return publishedOn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

}
