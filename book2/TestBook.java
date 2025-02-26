package book2;

public class TestBook {
	 public static void main(String[] args) {
	        Book book = new Book("Python", new Author[]{new Author("Uyen Thu", "uyenthu2006@gmail.com", 'm'),new Author("Lan anh", "lanh@gmail.com", 'f')}, 200.5, 30);
	        System.out.println(book.getAuthorNames());
	        System.out.println(book.toString());
	    }

}
