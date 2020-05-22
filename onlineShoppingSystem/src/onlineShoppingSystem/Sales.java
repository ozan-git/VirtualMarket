package onlineShoppingSystem;

import java.util.Scanner;

public class Sales {
	private WareHouse store;
	private Scanner scan;

	// constructor
	public Sales(Scanner scan, WareHouse store) {
		this.scan = scan;
		this.store = store;
	}

//Sales Management method
	public void SalesManagement() {
		ShoppingCart basket = new ShoppingCart();

		int choosePayment;
		System.out.println("Welcome\n");
		System.out.println("Quantities of products in our stocks:");

		for (String product : store.products()) {
			System.out.println("There are " + store.stock(product) + " " + product + " products in our store.");
		}

		System.out.println(
				"\nEnter the product you want to buy:" + "\n Press enter to see the total price of the basket.");

		while (true) {
			String product = scan.nextLine();
			if (product.isEmpty())
				break;

			if (store.getProductStocks().get(product) > 0) {
				store.takeProduct(product);
				basket.add(product, store.price(product));

			} else {
				System.out.println("We did not have this " + product + ".");
			}
		}
		System.out.println("Products you have purchased:");
		basket.print();
		System.out.println("The total price of the products in the basket is " + basket.price() + " TL.");

		System.out.println("Which payment method do you prefer:" + "\n Press '1' for Cash" + "\n Press '2' for BankCard"
				+ "\n Press '3' for creditCard");

		choosePayment = scan.nextInt();

		if (choosePayment == 1) {
			CashPayment cp = new CashPayment(basket.price());
			cp.toString();
		} else if (choosePayment == 2) {
			BankCardPayment bcp = new BankCardPayment(basket.price());
			bcp.toString();

		} else if (choosePayment == 3) {
			CreditCardPayment ccp = new CreditCardPayment(basket.price());
			
			ccp.creditPay();
			
		}

	}

}
