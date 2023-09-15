package ar.edu.unq.po2.tp4.product;

public class Product {

	private boolean isAgreedPrice;
	private String name;
	private double price;

	public Product(String name, double price) {
		this.isAgreedPrice = false;
		setName(name);
		setPrice(price);
	}

	public Product(boolean isAgreedPrice, String name, double price) {
		this(name, price);
		this.isAgreedPrice = isAgreedPrice;
	}
	
	public void increasePrice(double amount) {
		setPrice(getPrice() + amount);
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAgreedPrice() {
		return isAgreedPrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}



}
