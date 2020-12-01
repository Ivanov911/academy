package by.academy.homework.homework3.Deal1;

public class Product {

	public static final double PRODUCT_DISCOUNT = 0.95;
	protected double price;
	protected String type;
	protected String producerName;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(double price, String type, String producerName, int quantity) {
		super();
		this.price = price;
		this.type = type;
		this.producerName = producerName;
		this.quantity = quantity;
	}

	public final double calcTotalPrice() {
		return quantity * price * discount();
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

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double discount() {
		if (quantity * price > 100) {
			return PRODUCT_DISCOUNT;// 5% discount
		}
		return 1;
	}

}