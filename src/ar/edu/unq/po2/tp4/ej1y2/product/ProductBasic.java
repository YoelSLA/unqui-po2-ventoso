package ar.edu.unq.po2.tp4.ej1y2.product;

public class ProductBasic extends Product {

	private int discount;
	
	public ProductBasic(int discount, String name, double price) {
		super(name, price);
		setDiscount(discount);
	}

	public ProductBasic(int discount, boolean isAgreedPrice, String name, double price) {
		super(isAgreedPrice, name, price);
		setDiscount(discount);
	}

	public int getDiscount() {
		return discount;
	}
	
	@Override
	public double getPrice() {
		final double price = super.getPrice() * (1 - ((double) getDiscount() / 100));
		return Math.round(price * 100.0) / 100.0;

	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}



}
