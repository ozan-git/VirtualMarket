package onlineShoppingSystem;

import java.util.HashMap;

public class ShoppingCart {
	HashMap<String, Purchase> basket = new HashMap<String, Purchase>();

	// constructor
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}

	public void add(String product, float unitPrice) {
		Purchase purchase = new Purchase(product, 1, unitPrice);

		if (basket.containsKey(product)) {
			basket.get(product).amountIncrease();
		} else {
			basket.put(product, purchase);
		}
	}

	public float price() {
		float price = 0;
		for (Purchase purchase : basket.values()) {
			price += purchase.price();
		}
		return price;
	}

	public void print() {
		String string = "";
		for (Purchase purchase : basket.values()) {
			string += purchase + "\n";
		}
		System.out.println(string);
	}

}
