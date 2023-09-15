package ar.edu.unq.po2.tp5.product;

public abstract class CooperativeProduct extends Product {
	
	public CooperativeProduct(double price, int stock) {
		super(price, stock);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() * 0.10;
	}

}
