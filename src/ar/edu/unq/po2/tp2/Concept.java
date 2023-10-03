package ar.edu.unq.po2.tp2;

public class Concept {

	private double amount;
	private String name;
	

	public Concept(String name, double amount) {
		setName(name);
		setAmount(amount);
		
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public double getMonto() {
		return amount;
	}

	private void setAmount(double amount) {
		this.amount = amount;
	}

}
