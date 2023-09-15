package ar.edu.unq.po2.tp2.company;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.employee.Employee;
import ar.edu.unq.po2.tp2.paySlip.PaySlip;

public class Company {

	private int CUIT;
	private List<Employee> employees;
	private String name;

	public Company(int CUIT, String name) {
		this.CUIT = CUIT;
		this.employees = new ArrayList<Employee>();
		setName(name);
	}
		
	public double totalEmployeeWithholdings() {
		return employees.stream().mapToDouble(employee -> employee.withholdings()).sum();
	}
	
	public double totalGrossEmployeeSalaries() {
		return employees.stream().mapToDouble(employee -> employee.grossSalary()).sum();
	}

	public double totalNetEmployeeSalaries() {
		return employees.stream().mapToDouble(employee -> employee.netSalary()).sum();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void settleSalaries() {
		employees.stream().forEach(employee -> employee.addPaySlip(PaySlip.newPaySlipTo(employee)));
	}
	
	public int getCUIT() {
		return CUIT;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
