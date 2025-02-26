package book1;

public class TestBook {
	 
		 public static void main(String[] args) {
		     
		     Author author = new Author("Tan Ah Teck", "aTeck@somewhere.com", 'm');
		     System.out.println(author.toString());

		    
		     Book book = new Book("Java Programming", author, 59.99);
		     System.out.println(book.toString());
		 }
		}


