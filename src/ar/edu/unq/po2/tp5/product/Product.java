package ar.edu.unq.po2.tp5.product;

import ar.edu.unq.po2.tp5.Collectible;
import ar.edu.unq.po2.tp5.MarketStock;

public class Product implements Collectible {

	private double price;
	private MarketStock stock;

	public Product(double price, int stock) {
		setPrice(price);
		this.stock = new MarketStock();
	}

	@Override
	public double getPrice() {
		if (hasStock()) {
			return price;
		}
		return 0;
	}

	public int getStock() {
		return stock.amountStockOf(this);
	}

	@Override
	public boolean hasRecordPayment() {
		return hasStock();
	}

	public boolean hasStock() {
		return stock.hasStockOf(this);
	}

	@Override
	public void recordPayment() {
		if (hasStock()) {
			stock.updateStockOf(this);
		}
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
