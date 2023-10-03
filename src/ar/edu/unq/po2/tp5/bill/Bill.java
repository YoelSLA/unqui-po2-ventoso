package ar.edu.unq.po2.tp5.bill;

import ar.edu.unq.po2.tp5.Collectible;
import ar.edu.unq.po2.tp5.Agency;

public abstract class Bill implements Collectible {

	private Agency agency;

	@Override
	public boolean hasRecordPayment() {
		return true;
	}

	@Override
	public final void recordPayment() {
		agency.recordPayment(this);
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public abstract double getPrice();

}
