package ar.edu.unq.po2.tp2.employee;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unq.po2.tp2.paySlip.Concept;

public class Permanent extends Employee {

	private int antiquity;
	private int quantityOfChildren;

	public Permanent(String adress, int antiquity, LocalDate birthDate, MaritalStatus maritalStatus,
			double minimumSalary, String name, int quantityOfChildren) {
		super(adress, birthDate, maritalStatus, minimumSalary, name);
		setAntiquity(antiquity);
		setQuantityOfChildren(quantityOfChildren);

	}

	@Override
	public ArrayList<Concept> concepts(ArrayList<Concept> concepts) {
		final ArrayList<Concept> conceptsPermanent = new ArrayList<>();
		conceptsPermanent.add(new Concept("Child Allowance: ", childAllowance()));
		conceptsPermanent.add(new Concept("Marital Allowance: ", maritalAllowance()));
		conceptsPermanent.add(new Concept("Antiquity: ", getAntiquity() * 50));
		return super.concepts(concepts);
	}

	@Override
	public double duesToAPensionFund() {
		return amountGrossSalaryOf(15);
	}

	@Override
	public double grossSalary() {
		return super.grossSalary() + familyAllowance();
	}

	@Override
	public double medicalInsurance() {
		return amountGrossSalaryOf(10) + amountToQuantityOfChildren(20);
	}

	private int amountToQuantityOfChildren(int amount) {
		return amount * getQuantityOfChildren();
	}

	private double childAllowance() {
		return amountToQuantityOfChildren(150);
	}

	private double familyAllowance() {
		return childAllowance() + maritalAllowance() + getAntiquity() * 50;
	}

	private double maritalAllowance() {
		return (getMaritalStatus().equals(MaritalStatus.CASADO)) ? 100 : 0;
	}

	public int getAntiquity() {
		return antiquity;
	}

	public int getQuantityOfChildren() {
		return quantityOfChildren;
	}

	public void setAntiquity(int antiquity) {
		this.antiquity = antiquity;
	}

	public void setQuantityOfChildren(int quantityOfChildren) {
		this.quantityOfChildren = quantityOfChildren;
	}

}
