package com.nikolasaric;

import java.util.Scanner;

public class Program {
	public static Scanner insertNumber = new Scanner(System.in);
	static Library newLibrary = new Library();
	public static int chooseAnOption;

	public static void main(String[] args) {

		System.out.println("Choose an option?");
		System.out.println("1 - search library.");
		System.out.println("2 - add book.");
		System.out.println("3 - delete book.");
		System.out.println("4 - to exit program.");

		do {
			int chooseAnOption = insertNumber.nextInt();
			switch (chooseAnOption) {

			case 1:
				// search library
				newLibrary.showList();
				break;
			case 2:
				// add book
				newLibrary.addBook(null);
				break;

			case 3:
				// delete book
				newLibrary.deleteBook(0);

				break;
			case 4:
				// closes program
				System.exit(0);
				break;
			default:
				System.out.println("You chose an invalid option, try again.");
			}

		} while (chooseAnOption != 4);
	}

}
