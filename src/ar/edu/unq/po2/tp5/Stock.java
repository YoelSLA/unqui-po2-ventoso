package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unq.po2.tp5.product.Product;

public class Stock {

	private Map<Product, Integer> products;

	public Stock() {
		this.products = new HashMap<Product, Integer>();
	}

	public void addProduct(Product product, int amount) {
		products.put(product, amount);
	}
	
	public int amountStockOf(Product product) {
		return products.get(product);
	}

	public boolean hasStockOf(Product product) {
		return products.containsKey(product);
	}

	public void updateStockOf(Product product) {
		removeProductIfThereIsNot(product);
		products.replace(product, products.get(product) - 1);

	}

	private void removeProductIfThereIsNot(Product product) {
		if (products.get(product).equals(0)) {
			products.remove(product);
		}
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}
}
