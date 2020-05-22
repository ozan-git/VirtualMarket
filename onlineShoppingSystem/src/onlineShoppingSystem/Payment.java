package onlineShoppingSystem;

import java.util.Scanner;

public class Payment {
	protected float amountOfMoney;

	public Payment(float amountOfMoney) {
		// TODO Auto-generated constructor stub
		this.amountOfMoney = amountOfMoney;
	}

	// getter and setter
	public float getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(float amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

//method
	public String toString() {

		return "Amount of money is: " + amountOfMoney + "TL";
	}
}

class CashPayment extends Payment {

	// Parameterized constructor
	public CashPayment(float amountOfMoney) {
		super(amountOfMoney);
	}

	// toString() method is used to display the contents of an Object.
	@Override
	public String toString() {
		System.out.println("______CashPayment Details______");
		System.out.println("Cash payment #");
		// Calling the super class toString() method.
		System.out.println(super.toString());
		return " ";

	}
}

class BankCardPayment extends Payment {

	public BankCardPayment(float amountOfMoney) {
		super(amountOfMoney);
		// TODO Auto-generated constructor stub
	}

	// toString() method is used to display the contents of an Object.
	@Override
	public String toString() {
		System.out.println("______BankCardPayment Details______");
		System.out.println("BankCardPayment payment #");
		// Calling the super class toString() method.

		System.out.println(super.toString());
		return " ";

	}

}

class CreditCardPayment extends Payment {

	private Scanner scan;

	public CreditCardPayment(float amountOfMoney) {
		super(amountOfMoney);
		// TODO Auto-generated constructor stub
	}

	public void creditPay() {
		scan = new Scanner(System.in);

		System.out.println("Please choose the installment amount for payment by credit card:");
		System.out.println("Press '1' to pay at once.");
		System.out.println("Press '2' to pay in installments for three months.");
		System.out.println("Press '3' to pay in instalments for six months.");
		int chooseCreditPay = scan.nextInt();

		switch (chooseCreditPay) {
		case 1:
			System.out.println("Your choose is pay at once:");

			System.out.println("______CreditCardPayment Details______");
			System.out.println("CreditCard payment #");

			System.out.println(super.getAmountOfMoney());
			break;

		case 2:
			System.out.println("Your choose is pay in installments for three months.:");

			System.out.println("______CreditCardPayment Details______");
			System.out.println("Credit payment #");

			System.out.println("The first installment of the quarterly installment: "+ super.getAmountOfMoney()/3 + "TL.");
			break;

		case 3:
			System.out.println("Your choose is pay in installments for six months.:");

			System.out.println("______CreditCardPayment Details______");
			System.out.println("CreditCard payment #");

			System.out.println("The first installment of the six-month installment: " + super.getAmountOfMoney()/6 + "TL.");
			break;
		default:
			break;
		}

	}
}
