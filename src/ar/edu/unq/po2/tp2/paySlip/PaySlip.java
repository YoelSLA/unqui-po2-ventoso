package ar.edu.unq.po2.tp2.paySlip;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.employee.Employee;

public class PaySlip {

	private String adress;
	private List<Concept> concepts;
	private LocalDateTime dateOfIssue;
	private String employeeName;
	private double grossSalary;
	private double minimumSalary;

	private PaySlip(String adress, List<Concept> concepts, LocalDateTime dateOfIssue, String employeeName,
			double grossSalary, double minimumSalary) {
		setAdress(adress);
		this.concepts = new ArrayList<Concept>(concepts);
		this.dateOfIssue = dateOfIssue;
		setEmployeeName(employeeName);
		setGrossSalary(grossSalary);
		setMinimumSalary(minimumSalary);
	}

	public void showInformation() {
		final ArrayList<String> strings = new ArrayList<String>();
		strings.add("Employee´s name: " + employeeName.toString());
		strings.add("Adress: " + adress.toString());
		strings.add("Date of issue: " + dateOfIssue);
		strings.add("Gross Salary: " + grossSalary);
		strings.add("Minimum Salary:" + minimumSalary);
		strings.stream().forEach(string -> System.out.println(string));
		concepts.stream().forEach(concept -> System.out.println(concept));

	}
	
	private void setAdress(String adress) {
		this.adress = adress;
	}

	private void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	private void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	private void setMinimumSalary(double minimumSalary) {
		this.minimumSalary = minimumSalary;
	}

	public static PaySlip newPaySlipTo(Employee employee) {
		return new PaySlip(employee.getAdress(), employee.concepts(), LocalDateTime.now(), employee.getName(),
				employee.grossSalary(), employee.netSalary());
	}

	public String getAdress() {
		return adress;
	}

	public List<Concept> getConcepts() {
		return concepts;
	}

	public LocalDateTime getDateOfIssue() {
		return dateOfIssue;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double getMinimumSalary() {
		return minimumSalary;
	}



}
