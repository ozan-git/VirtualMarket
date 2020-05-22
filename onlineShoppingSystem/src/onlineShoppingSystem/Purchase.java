package onlineShoppingSystem;

public class Purchase {
	private String product;
	private int amount;
	private float unitPrice;

	// constructor
	public Purchase(String product, int amount, float unitPrice) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		this.product = product;
		this.unitPrice = unitPrice;
	}

	public void amountIncrease() {
		this.amount++;
	}

	public String toString() {
		String toString = "";
		toString += this.product + ": " + this.amount + " adet";
		return toString;
	}

	public float price() {
		return  amount * unitPrice;
	}
}
