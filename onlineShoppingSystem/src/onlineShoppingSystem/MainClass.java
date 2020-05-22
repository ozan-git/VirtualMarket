package onlineShoppingSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Customer customer = new Customer("ozan", "yildiz");
		Customer.bilgiGetir(customer);
		
		WareHouse house = new WareHouse();
		house.addProduct("apple", (float) 1.80, 10);
		house.addProduct("banana", (float) 3.25, 3);
		house.addProduct("orange",  2, 24);
		house.addProduct("lemon", (float) 2.45, 100);
		house.addProduct("watermelon", (float) 12, 5);
		house.addProduct("tv", 850, 5);
		house.addProduct("computer", (float)1299.99, 2);
		
		Sales shop = new Sales(new Scanner(System.in), house);
		shop.SalesManagement();
		
		
	}

}
