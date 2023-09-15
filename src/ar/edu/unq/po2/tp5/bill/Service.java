package ar.edu.unq.po2.tp5.bill;

public class Service extends Bill {

	private int amountOfUnits;
	private double unitCost;

	public Service(int amountOfUnits, double unitCost) {
		setAmountOfUnits(amountOfUnits);
		setUnitCost(unitCost);
	}
	
	@Override
	public double getPrice() {
		return getAmountOfUnits() * getUnitCost();
	}

	public int getAmountOfUnits() {
		return amountOfUnits;
	}
	
	public double getUnitCost() {
		return unitCost;
	}

	public void setAmountOfUnits(int amountOfUnits) {
		this.amountOfUnits = amountOfUnits;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}





}
