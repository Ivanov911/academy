package by.academy.homework.homework3.Deal1;

public class Meat extends Product {
	int term;
	public static final double MEAT_DISCOUNT = 0.8;

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public Meat(int term) {
		super();
		this.term = term;
	}

	public Meat(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (quantity > 10) {
			return MEAT_DISCOUNT;
		}
		return 1;

	}

}