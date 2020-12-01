package by.academy.homework.homework3.Deal1;

public class Milk extends Product {

	public static final double MILK_DISCOUNT = 0.7;
	private static int milkCount = 0;
	private int nonStaticMilkCount = 0;
	private String color;

	public Milk(double price, String type, String name, int quantity, String color) {
		super(price, type, name, quantity);
		this.color = color;
		milkCount++;
		nonStaticMilkCount++;
	}

	public int getNonStaticMilkCount() {
		return nonStaticMilkCount;
	}

	public void setNonStaticMilkCount(int nonStaticMilkCount) {
		this.nonStaticMilkCount = nonStaticMilkCount;
	}

	public static int getMilkCount() {
		return milkCount;
	}

	public static void setMilkCount(int milkCount) {
		Milk.milkCount = milkCount;
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
			return MILK_DISCOUNT;
		}
		return 1;
	}
}