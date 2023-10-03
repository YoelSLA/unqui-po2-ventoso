package ar.edu.unq.po2.tp4.ej1y2.supermarket;

import java.util.ArrayList;

import ar.edu.unq.po2.tp4.ej1y2.product.Product;

public class Supermarket {

	private String adress;
	private String name;
	private ArrayList<Product> products;

	public Supermarket(String adress, String name) {
		setAdress(adress);
		setName(name);
		this.products = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

	public int totalQuantityOfProductosToSell() {
		return products.size();
	}

	public double totalSumOfProductPrices() {
		return products.stream().mapToDouble(product -> product.getPrice()).sum();
	}

	public String getAdress() {
		return adress;
	}

	public String getName() {
		return name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setName(String name) {
		this.name = name;
	}

}
