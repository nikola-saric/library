package com.nikolasaric;

import java.util.List;
import java.util.Scanner;

public class Program {

	// public long Id;

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		Library library = new Library();

		while (true) {
			System.out.println("Choose an option?");
			System.out.println("1 - print books.");
			System.out.println("2 - add book.");
			System.out.println("3 - delete book.");
			System.out.println("4 - search for a book.");
			System.out.println("5 - to exit program.");

			int chooseAnOption = userInput.nextInt();

			switch (chooseAnOption) {

			case 1:
				List<Book> books = library.getAllBooks();
				for (Book book : books) {
					System.out.println("Title: " + book.getBookTitle() + " | Author: " + book.getAuthor()
							+ " | Number of pages: " + book.getNumberOfPages() + " | Year of publication: "
							+ book.getPublishedOn() + " | Id: " + book.getId());
				}
				break;

			case 2:

				System.out.println("Enter book name:");
				String newTitle = userInput.next();

				System.out.println("Enter book Id:");
				long newId = userInput.nextInt();

				System.out.println("Enter book author:");
				String newAuthor = userInput.next();

				System.out.println("Enter number of pages:");
				int newNumberOfPages = userInput.nextInt();

				System.out.println("Enter year of publication:");
				int newPublishedOn = userInput.nextInt();

				Book newBook = new Book(newTitle, newId, newAuthor, newNumberOfPages, newPublishedOn);

				library.addBook(newBook);

				break;

			case 3:

				System.out.println("Enter book name.");

				String titleOfBookToDelete = userInput.next();

				library.deleteBook(titleOfBookToDelete);

				break;

			case 4:

				System.out.println("Enter book name:");

				String titleOfBookToSearch = userInput.next();

				Book searchedBook = library.searchBook(titleOfBookToSearch);

				if (searchedBook != null) {
					System.out.println("Your book: Title: " + searchedBook.getBookTitle() + " | Author: "
							+ searchedBook.getAuthor() + " | Number of pages: " + searchedBook.getNumberOfPages()
							+ " | Year of publication: " + searchedBook.getPublishedOn() + " | Id: "
							+ searchedBook.getId());
				} else {
					System.out.println("There is no such book in the library.");
				}

				break;

			case 5:

				System.exit(0);

				break;

			default:
				System.out.println("You chose an invalid option, try again.");
			}
			userInput.nextLine();
		}
	}

}
