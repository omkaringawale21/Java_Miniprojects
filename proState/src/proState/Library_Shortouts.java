package proState;

class library{
	String[] books;
	int no_of_books;
	
	library(){
		this.books = new String[100];
		int no_of_books = 0;
	}
	
	void addBook(String book){
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book + " has been added!");
	}
	
	void showAvailableBooks(){
		System.out.println("The available books are : ");
		for(String book : this.books){
			if(book == null){ continue; }
			System.out.println("* " + book);
		}
	}
	
	void issuedBook(String book){
		try{
			for(int i=0; i<this.books.length; i++){
				if(this.books[i].equals(book)){
					System.out.println("The book has been issued! " + book);
					this.books[i] = null;
					return;
				}
			}
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
	
	void returnBook(String book){
		addBook(book);
	}
	
}

public class Library_Shortouts {
	
	public static void main(String[] args) {
		
		library li = new library();
		li.addBook("Agnipath");
		li.addBook("Shreemanyogi");
		li.addBook("Chhawa");
		li.addBook("The Consious Mind");
		li.showAvailableBooks();
		
		li.issuedBook("The Consious Mind");
		li.showAvailableBooks();
		li.returnBook("The Consious Mind");
		li.showAvailableBooks();
		
	}

}
