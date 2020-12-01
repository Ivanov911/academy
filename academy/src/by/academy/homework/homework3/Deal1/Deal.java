package by.academy.homework.homework3.Deal1;

import java.time.LocalDate;

@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
public class Deal {

	public final static int DEFAULT_PRODUCT_SIZE = 2;
	String date;
	Person seller;
	Person buyer;
	Product[] products;
	private int productCounter;
	double calc = 0;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer, Product[] products) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(int index) {

		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public void printProducts() {
		double cal = 0;
		for (int i = 0; i < productCounter; i++) {

			Product p = products[i];
			cal += p.calcTotalPrice();
			System.out.println("Название: " + p.getProducerName());
			System.out.println("Вид: " + p.getType());
			System.out.println("Количество: " + p.getQuantity());
			System.out.println("Стоимость за шт " + p.getPrice());
			System.out.println("Стоимость: " + p.calcTotalPrice());
			System.out.println("-----------------");
		}
		calc = cal;
	}

	public void result() {

		if (calc > buyer.getCash()) {
			System.out.println(("Недостаточно средств! "));
		} else {
			deal();
			date();
		}
	}

	public void deal() {

		System.out.println("Сумма всей сделки: " + calc);
		buyer.setCash(buyer.getCash() - calc);
		seller.setCash(seller.getCash() + calc);
		System.out.println("Сумма покупателя: " + buyer.getCash());
		System.out.println("Сумма продавца: " + seller.getCash());

	}

	public static void date() {
		LocalDate today = LocalDate.now();
		System.out.println("Начало сделки: " + today);
		System.out.println("Конец сделки: " + today.plusDays(10));
	}
}
