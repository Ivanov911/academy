package Classwork15;

public class Tiger extends Cat {
	
	private int age;
	public String name;
	protected int lines;
	
	@Zoo(number = "Z35F")
	private void run() {
		System.out.println("Тигр бежит");
	}
	
	private void eat(String s) {
		System.out.println("Тигр ест " + s);
	}
	
	protected void sleep() {
		System.out.println("Тигр спит");
	}

}