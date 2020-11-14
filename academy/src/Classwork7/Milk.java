package Classwork7;

public class Milk extends Product {
	String color;

	public Milk(String color, String type, int quantity, String tipe, double price, String name) {
		super(price, type, name, quantity);
		this.color = color;
	}

	protected double calcDiscont() {
		if (name.contains("a")) {
			return 0.9;
		}
		return 1;
	}


}