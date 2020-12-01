package by.academy.homework.homework3.Deal1;

public class Bread extends Product {

	public static final double BREAD_DISCOUNT = 0.5;
	private static int breadCount = 0;
	private int nonStaticBreadCount = 0;
	private String color;

	public Bread(double price, String type, String name, int quantity, String color) {
		super(price, type, name, quantity);
		this.color = color;
		breadCount++;
		nonStaticBreadCount++;
	}

	public int getNonStaticBreadCount() {
		return nonStaticBreadCount;
	}

	public void setNonStaticBreadCount(int nonStaticBreadCount) {
		this.nonStaticBreadCount = nonStaticBreadCount;
	}

	public static int getBreadCount() {
		return breadCount;
	}

	public static void setBreadCount(int breadCount) {
		Bread.breadCount = breadCount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double discount() {
		if (quantity > 2) {
			return BREAD_DISCOUNT;
		}
		return 1;
	}
}