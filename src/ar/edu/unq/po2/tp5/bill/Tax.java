package ar.edu.unq.po2.tp5.bill;

public class Tax extends Bill {

	private double serviceRate;

	public Tax(double serviceRate) {
		setServiceRate(serviceRate);
	}

	@Override
	public double getPrice() {
		return serviceRate;
	}

	public double getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) {
		this.serviceRate = serviceRate;
	}




}
