package com.nikolasaric;

import java.util.Scanner;

public class Books {
	static Scanner insertNumber = new Scanner(System.in);
	

	private int id;
	private String author;
	private int numOfPages;
	private int price;

	Books() {
		System.out.print("Insert your Id (1 do 3): ");

		int caseNumber = insertNumber.nextInt();

		switch (caseNumber) {
		case 1:

			this.id = 1;
			this.author = "Author 1";
			this.numOfPages = 143;
			this.price = 5;
			break;

		case 2:

			this.id = 2;
			this.author = "Author 2";
			this.numOfPages = 230;
			this.price = 8;
			break;

		case 3:

			this.id = 3;
			this.author = "Author 3";
			this.numOfPages = 320;
			this.price = 12;
			break;
		

		}
	}

	public int getId() {
		return this.id;
	}

	public String getAuthor() {
		return this.author;

	}
	public int getNumOfPages() {
		return this.numOfPages;
	}
	public int getPrice() {
		return this.price;
	}

}
