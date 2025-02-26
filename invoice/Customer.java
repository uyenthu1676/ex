package invoice;

public class Customer {
	 private int id;
	    private String name;
	    private int discount;

	    public Customer(int id, String name, int discount) {
	        this.id = id;
	        this.name = name;
	        this.discount = discount;
	    }

	    public int getID() {
	        return id;
	    }

	    public void setID(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getDiscount() {
	        return discount;
	    }

	    public void setDiscount(int discount) {
	        this.discount = discount;
	    }

	    @Override
	    public String toString() {
	        return name + "(" + id + ")" + "(" + discount + "%)";
	    }
	}



