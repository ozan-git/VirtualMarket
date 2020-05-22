package onlineShoppingSystem;

public class Person {
	private String name;
	private String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public static void bringInfo(Person person) {
		System.out.println("Customer Name : " + person.getName() + "\n" + "Customer Surname : " + person.getSurname());
	}

}

class Customer extends Person {
	public Customer(String name, String surname) {
		super(name, surname);
	}
}
