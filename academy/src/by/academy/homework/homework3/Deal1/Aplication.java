package by.academy.homework.homework3.Deal1;

import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя покупателя: ");
		String sName = sc.next();
		System.out.println("Введите имя продавца: ");
		String bName = sc.next();
		System.out.println("Введите сумму, которая будет у покупателя: ");
		int viletS = sc.nextInt();

		Person pe = new Person();
		pe.email();
		pe.dateBir();
		pe.validat();

		Person seller = new Person(sName, 0.00);
		Person buyer = new Person(bName, viletS);

		Product[] products = new Product[10];

		Deal deal = new Deal("30-11-2020", seller, buyer, products);
		System.out.println("Добавить продукт? Да - 1; Нет - 0 и т.д.");
		int dpr = sc.nextInt();

		while (dpr == 1) {
			System.out.println("Выбирай продукт для добавления: beef - 0; Vine - 1; Milk - 2; Bread - 3");

			int ame = sc.nextInt();
			switch (ame) {
			case 1:
				System.out.println("Количество?");
				int col = sc.nextInt();
				deal.addProduct(new Vine(25.00, "drinke", "Vine", col));
				break;
			case 0:
				System.out.println("Количество?");
				int co = sc.nextInt();
				deal.addProduct(new Meat(15.00, "meat", "beef", co));
				break;
			case 2:
				System.out.println("Количество?");
				int c = sc.nextInt();
				deal.addProduct(new Milk(5.00, "bacaleya", "Milka", c, "Blake"));
				break;
			case 3:
				System.out.println("Количество?");
				int k = sc.nextInt();
				deal.addProduct(new Bread(3.00, "bacaleya", "Super", k, "While"));
				break;
			}

			System.out.println("Добавить продукт? Да - 1; Нет - 0 и т.д.");
			dpr = sc.nextInt();
		}

		deal.printProducts();
		System.out.println("Удалить продукт? Да - 1; Нет - 0 и т.д.");
		int am = sc.nextInt();

		while (am == 1) {
			System.out.println("Выбирай продукт для удаления: beef - 0; Vine - 1; Milk - 2; Bread - 3");

			int ame = sc.nextInt();

			deal.deleteProduct(ame);
			System.out.println("Удалить продукт? Да - 1; Нет - 0 и т.д.");
			am = sc.nextInt();
		}

		System.out.println("---------------------------------------");
		sc.close();
		deal.printProducts();

		deal.result();

		// Deal.date();
	}

}