package onlineShoppingSystem;

import java.util.HashMap;
import java.util.Set;

public class WareHouse {
	private HashMap<String, Float> prices = new HashMap<String, Float>();
	private HashMap<String, Integer> productStocks = new HashMap<String, Integer>();

	public void addProduct(String product, float price, int stock) {
		prices.put(product, price);
		productStocks.put(product, stock);
	}

	public float price(String product) {
		if (prices.containsKey(product))
			return prices.get(product);
		else
			return 0;
	}

	public int stock(String product) {
		if (productStocks.containsKey(product)) {
			return productStocks.get(product);
		} else {
			return 0;
		}
	}

	public boolean takeProduct(String product) {
		if (productStocks.containsKey(product)) {
			if (productStocks.get(product) - 1 >= 0) {
				productStocks.put(product, productStocks.get(product) - 1);
				return true;
			} else
				return true;
		} else
			return false;
	}

	public Set<String> products() {
		return prices.keySet();
	}

	public HashMap<String, Float> getPrices() {
		return prices;
	}

	public void setPrices(HashMap<String, Float> prices) {
		this.prices = prices;
	}

	public HashMap<String, Integer> getProductStocks() {
		return productStocks;
	}

	public void setProductStocks(HashMap<String, Integer> productStocks) {
		this.productStocks = productStocks;
	}


}
