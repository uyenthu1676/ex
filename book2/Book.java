package book2;

public class Book {
	 private String name;
	    private Author[] authors;
	    private double price;
	    private int qty = 0;

	    public Book(String name, Author[] authors, double price, int qty) {
	        this.name = name;
	        this.authors = authors;
	        this.price = price;
	        this.qty = qty;
	    }

	    public Author[] getAuthors() {
	        return authors;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQty() {
	        return qty;
	    }

	    public void setQty(int qty) {
	        this.qty = qty;
	    }
	    public  String getAuthorNames(){
	        String authorNames="";
	        for(Author item: authors){
	            authorNames+=item.getName() +",";
	        }
	        StringBuilder newAuthorNames = new StringBuilder(authorNames);
	        newAuthorNames.deleteCharAt(newAuthorNames.length()-1);
	        return newAuthorNames.toString();
	    }

	    @Override
	    public String toString() {
	        StringBuilder authorsStr = new StringBuilder();
	        for (Author author : authors) {
	            authorsStr.append(author.toString()).append(", ");
	        }
	        return "Book[name=" + name + ",authors=[" + authorsStr + "],price=" + price + ",qty=" + qty + "]";
	    }

}
