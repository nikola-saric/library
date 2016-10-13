package com.nikolasaric;

import java.io.*;
import java.util.Scanner;

public class Program {
	public static Scanner userInput = new Scanner(System.in);
	static Library newLibrary = new Library();

	// public long Id;

	public static void main(String[] args) {

		System.out.println("Choose an option?");
		System.out.println("1 - search library.");
		System.out.println("2 - add book.");
		System.out.println("3 - delete book.");
		System.out.println("4 - to exit program.");

		int chooseAnOption = userInput.nextInt();

		switch (chooseAnOption) {

		case 1:
			// search library

			newLibrary.getBook();
			break;

		case 2:
			// add book

			System.out.println("Enter book name.");
			String newTitle = userInput.next();

			System.out.println("Enter book Id.");
			long newId = userInput.nextInt();

			System.out.println("Enter book author");
			String newAuthor = userInput.next();

			System.out.println("Enter number of pages.");
			int newNumberOfPages = userInput.nextInt();

			System.out.println("Published on.");
			int newPublishedOn = userInput.nextInt();

			// public Book(String title, long id, String author, int
			// publishedOn,int numberOfPages)

			Book newBook = new Book(newTitle, newId, newAuthor, newNumberOfPages, newPublishedOn);

			newLibrary.addBook(newBook);

			break;

		case 3:
			// delete book

			System.out.println("Enter book name.");
			String delTitle = userInput.next();

			System.out.println("Enter book Id.");
			long delId = userInput.nextInt();

			System.out.println("Enter book author");
			String delAuthor = userInput.next();

			System.out.println("Enter number of pages.");
			int delNumberOfPages = userInput.nextInt();

			System.out.println("Published on.");
			int delPublishedOn = userInput.nextInt();

			// public Book(String title, long id, String author, int
			// publishedOn,int numberOfPages)
			Book delBook = new Book(delTitle, delId, delAuthor, delNumberOfPages, delPublishedOn);

			newLibrary.deleteBook(delBook);

			break;
		case 4:
			// closes program
			System.exit(0);
			break;
		default:
			System.out.println("You chose an invalid option, try again.");
		}
	}

}
