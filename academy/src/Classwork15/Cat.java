package Classwork15;

public class Cat {
	protected double money;
	public int weight;
	protected int height;
	
	@Zoo(number = "Z35F")
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	protected int getWeight() {
		return weight;
	}
	protected void setWeight(int weight) {
		this.weight = weight;
	}
	private int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	
}
