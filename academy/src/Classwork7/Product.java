package Classwork7;

public class Product {
	double price;
	String name;
	String type;
	int quantity;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	
		
	public Product(double price, String name, String type, int quantity) {
		super();
		this.price = price;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}