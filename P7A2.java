// Declare a class called book having author_name as private data member. Extend book 
// class to have two sub classes called book_publication & paper_publication. Each of 
// these classes have private member called title. Write a complete program to show 
// usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
// publications of given author.Use command line arguments for input data. [A] 

import java.util.Scanner;

class Book {
	private String author_name;
	Book (String author_name) {
		this.author_name = author_name;
	}

	void display(){
		System.out.println("author_name = "+author_name);
	}
}

class Book_publication extends Book {
	private String title;
	Book_publication (String author_name, String title) {
		super(author_name);
		this.title = title;
	}

	void display(){
		super.display();
		System.out.println("titel = " + title);
	}
}

class Paper_publication extends Book {
	private String title;
	Paper_publication (String author_name, String title) {
		super(author_name);
		this.title = title;
	}

	void display(){
		super.display();
		System.out.println("title = " + title);
	}
}

public class P7A2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1: Create Book_publication object ");
		System.out.println("Enter 2: Create Paper_publication object ");
		int n = sc.nextInt();

		Book b;
		if (n == 1) {
			b = new Book_publication(args[0], args[1]);
			b.display();
		}
		else if (n == 2) {
			b = new Paper_publication(args[0], args[2]);
			b.display();
		}
		else {
			System.out.println("Enter vaild input ");
		}



	}
}