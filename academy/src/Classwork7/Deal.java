package Classwork7;

public class Deal {
Person seller;
Person buyer;
Product[] product;



public Deal() {
	super();
	

public Deal(Person seller, Person buyer, String product, double result) {
	super();
	this.seller = seller;
	this.buyer = buyer;
	this.product = product;
	this.result = result;
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

public String getProduct() {
	return product;
}



public void setProduct(String product) {
	this.product = product;
}



public double getResult() {
	return result;
}



public void setResult(double result) {
	this.result = result;
}

public double result() {
	double sum = 0;
	for (Product product : product) {
		sum += product.getPrice()*product.getQuantity();
		if (sum > buyer.getCash()) {
			System.out.println("Недостатчно средств");
			
		} else {
			printBill();
		}
	return 0;
	}
	private void printBill() {
		double summ = 0;
		System.out.println("Cделка совершена");
		for (Product product : products) {
			double totalProductPrice = product.getPrice()*product.getQuantity();
			System.out.println("Имя:" + product.getName() + " " + product.getQuantity() + "=" totalProductPrice);
			
		}
	}
	System.out.println("сумма всей сделки" + summ);
	buyer.setCash(buyer.getCash() - summ);
	seller.setCash(seller.getCash() = summ);
	System.out.println("Деньги покупателя" + buyer.getCash());
	System.out.println("Деньги продовца" + seller.getCash());
}
}
