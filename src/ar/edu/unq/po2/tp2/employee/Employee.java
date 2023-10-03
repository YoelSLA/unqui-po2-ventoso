package ar.edu.unq.po2.tp2.employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ar.edu.unq.po2.tp2.Concept;
import ar.edu.unq.po2.tp2.MaritalStatus;
import ar.edu.unq.po2.tp2.PaySlip;

public abstract class Employee {

	private String adress;
	private LocalDate birthDate;
	private MaritalStatus maritalStatus;
	private double minimumSalary;
	private String name;
	private List<PaySlip> paySlips;

	public Employee(String adress, LocalDate birthDate, MaritalStatus maritalStatus, double minimumSalary,
			String name) {
		setAdress(adress);
		this.birthDate = birthDate;
		setMaritalStatus(maritalStatus);
		setMinimumSalary(minimumSalary);
		setName(name);
		this.paySlips = new ArrayList<PaySlip>();
	}
	
	public void addPaySlip(PaySlip paySlip) {
		paySlips.add(paySlip);
	}

	public int age() {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}
	
	public double amountGrossSalaryOf(int percentage) { // TEMPLATE METHOD
		return grossSalary() * (percentage / 100);
	}
	
	public List<Concept> concepts() {
		return concepts(new ArrayList<Concept>());
	}

	public List<Concept> concepts(List<Concept> concepts) {
		final List<Concept> conceptsEmployee = new ArrayList<Concept>();
		concepts.add(new Concept("Medical Insurance: ", medicalInsurance()));
		concepts.add(new Concept("Dues To A Pension Fund: ", duesToAPensionFund()));
		concepts.add(new Concept("Withholdings: ", withholdings()));
		concepts.add(new Concept("Net Salary = ", netSalary()));
		return (List<Concept>) Stream.concat((concepts.stream()), conceptsEmployee.stream())
				.collect(Collectors.toList());
	}

	public double duesToAPensionFund() {
		return 0;
	}

	public double grossSalary() {
		return getMinimumSalary();
	}

	public double medicalInsurance() {
		return 0;
	}

	public double netSalary() { // TEMPLATE METHOD
		return grossSalary() - withholdings();
	}

	public double withholdings() { // TEMPLATE METHOD
		return duesToAPensionFund() + medicalInsurance();
	}

	public String getAdress() {
		return adress;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public double getMinimumSalary() {
		return minimumSalary;
	}

	public String getName() {
		return name;
	}

	public List<PaySlip> getPaySlips() {
		return paySlips;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setMinimumSalary(double minimumSalary) {
		this.minimumSalary = minimumSalary;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
