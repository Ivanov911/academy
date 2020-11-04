package by.academy.homework.homework1;

public class Application {

	public static void main(String[] args) {
		Cat Cat1 = new Cat();
		Cat Cat2 = new Cat("Murzik");
	Cat1.sleep();
	Cat1.eat();
	Cat1.walk();
	
	Cat2.grow();
	Cat2.grow();
	Cat2.grow();
	System.out.println(Cat2.age);
	
	Cat2.setInitials();
	System.out.println(Cat2.getInitials());
	
	Cat2.setIsHomeAnimal("home");
	System.out.println(Cat2.isHomeAnimal());
	Cat2.Cost(50);
	Cat2.getMoney();
	System.out.println(Cat2.getMoney());
	}
	
	}
