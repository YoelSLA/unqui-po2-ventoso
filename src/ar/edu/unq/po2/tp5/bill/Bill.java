package ar.edu.unq.po2.tp5.bill;

import ar.edu.unq.po2.tp5.Collectible;
import ar.edu.unq.po2.tp5.Agency;

public abstract class Bill implements Collectible {
	
	private Agency agency;
	
	@Override
	public void recordPayment() {
		agency.recordPayment(this);
		
	}

	public abstract double getPrice();
	
	@Override
	public boolean hasPaymentRecord() {
		// TODO Auto-generated method stub
		return false;
	}

}
