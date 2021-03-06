package proState;

import java.util.ArrayList;

/*
 * Problem Statement : Create a Library as well as create a some mothds for add, issue, return.
 * Example of the Jenerics.
 * @Author : Omkar Ingawale
 */

class Book{
	public String name, author;
	
	public Book(String name, String author){
		this.name = name;
		this.author = author;
	}
	
	@Override
	public String toString(){
		return "Book {" +
	           "name = '" + name + "',\n" +
			   "  author = '" + author + "'" + "}\n";
	}
	
}

class myLibrary{
	public ArrayList<Book> books;
	
	public myLibrary(ArrayList<Book> books){
		this.books = books;
	}
	
	public void addBook(Book book){
		System.out.println("The book has been added!");
		this.books.add(book);
	}
	
	public void issueBook(Book book, String issued_to){
		System.out.println("The book issued from library to " + issued_to);
		this.books.remove(book);
	}
	
	public void returnBook(Book book){
		System.out.println("The book has been returned!");
		this.books.add(book);
	}
	
}

public class Library_Shortouts_2 {

	public static void main(String[] args) {
		
		ArrayList<Book> bk = new ArrayList<>();
		
		Book b1 = new Book("The Concious Mind", "Omkar Ingawale");
		bk.add(b1);
		
		Book b2 = new Book("Agnipath", "Sidhesh Kadam");
		bk.add(b2);
		
		Book b3 = new Book("Chhawa", "Ranjeet Desai");
		bk.add(b3);
		
		Book b4 = new Book("Shreemanyogi", "Ranjeet Desai");
		bk.add(b4);
		
		myLibrary ml = new myLibrary(bk);
		ml.addBook(new Book("Swarajyache Shiledar", "Swapnil Chikne"));
		System.out.println(ml.books);
		ml.issueBook(b2, "Pratik Ghatage");
		System.out.println(ml.books);
		ml.returnBook(b2);
		System.out.println(ml.books);
		
	}

}
