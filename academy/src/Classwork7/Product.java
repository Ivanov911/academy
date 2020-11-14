package Classwork7;

public class Product {
	double price;
	String type;
	String name;
	int quantity;

	public Product() {
		super();
	}

	public Product(double price, String type, String name, int quantity) {
		super();
		this.price = price;
		this.type = type;
		this.name = name;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}