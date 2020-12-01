package by.academy.homework.homework3.Deal1;

public class Vine extends Product {

	public static final double VINE_DISCOUNT = 0.9;
	String alk;

	public String getAlk() {
		return alk;
	}

	public void setAlk(String alk) {
		this.alk = alk;
	}

	public Vine(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (quantity * price > 2) {
			return VINE_DISCOUNT;
		}
		return 1;
	}
}