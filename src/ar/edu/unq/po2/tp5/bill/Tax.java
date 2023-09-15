package ar.edu.unq.po2.tp5.bill;

import ar.edu.unq.po2.tp5.Agency;

public class Tax extends Bill {

	private Agency agency;
	private double serviceRate;

	public Tax(double serviceRate) {
		setServiceRate(serviceRate);
	}

	@Override
	public double getPrice() {
		return serviceRate;
	}

	public Agency getAgency() {
		return agency;
	}

	public double getServiceRate() {
		return serviceRate;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public void setServiceRate(double serviceRate) {
		this.serviceRate = serviceRate;
	}




}
