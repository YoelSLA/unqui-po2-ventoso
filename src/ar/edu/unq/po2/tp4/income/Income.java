package ar.edu.unq.po2.tp4.income;

import java.time.Month;

public class Income {

	private double amount;
	private String concept;
	private Month monthOfPerception;
	
	public Income(double amount, String concept, Month monthOfPerception) {
		setAmount(amount);
		setConcept(concept);
		this.monthOfPerception = monthOfPerception;
	}

	public double getAmountTaxable() {
		return getAmount();
	}

	public double getAmount() {
		return amount;
	}
	
	public String getConcept() {
		return concept;
	}
	
	public Month getMonthOfPerception() {
		return monthOfPerception;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setConcept(String concept) {
		this.concept = concept;
	}





}
