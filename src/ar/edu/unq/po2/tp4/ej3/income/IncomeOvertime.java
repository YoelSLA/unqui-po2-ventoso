package ar.edu.unq.po2.tp4.ej3.income;

import java.time.Month;

public class IncomeOvertime extends Income {

	private int quantityOvertime;

	public IncomeOvertime(double amount, String concept, Month monthOfPerception, int quantityOvertime) {
		super(amount, concept, monthOfPerception);
		setQuantityOvertime(quantityOvertime);
	}

	public double getAmountTaxable() {
		return 0;
	}

	public int getQuantityOvertime() {
		return quantityOvertime;
	}

	public void setQuantityOvertime(int quantityOvertime) {
		this.quantityOvertime = quantityOvertime;
	}

}
