package ar.edu.unq.po2.tp2.employee;

import java.time.LocalDate;

import java.util.ArrayList;

import ar.edu.unq.po2.tp2.paySlip.Concept;

public class Temporal extends Employee {

	private LocalDate endDateDesignation;
	private int quantityOvertime;

	public Temporal(String adress, LocalDate birthDate, LocalDate endDateDesignation, MaritalStatus maritalStatus,
			double minimumSalary, String name, int quantityOvertime) {
		super(adress, birthDate, maritalStatus, minimumSalary, name);
		this.endDateDesignation = endDateDesignation;
		setQuantityOvertime(quantityOvertime);
	}

	@Override
	public ArrayList<Concept> concepts(ArrayList<Concept> concepts) {
		final ArrayList<Concept> conceptsTemporal = new ArrayList<>();
		return super.concepts(conceptsTemporal);
	}

	@Override
	public double duesToAPensionFund() {
		return amountGrossSalaryOf(10) + amountQuantityOvertimeOf(5);
	}

	@Override
	public double grossSalary() {
		return super.grossSalary() + amountQuantityOvertimeOf(40);
	}

	@Override
	public double medicalInsurance() {
		return amountGrossSalaryOf(10) + amountIsGreaterThan(50);
	}

	private int amountIsGreaterThan(int age) {
		return (age() > age) ? 25 : 0;
	}

	private double amountQuantityOvertimeOf(int quantity) {
		return getQuantityOvertime() * quantity;
	}

	public LocalDate getEndDateDesignation() {
		return endDateDesignation;
	}

	public int getQuantityOvertime() {
		return quantityOvertime;
	}

	public void setQuantityOvertime(int quantityOvertime) {
		this.quantityOvertime = quantityOvertime;
	}

}
