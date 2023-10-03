package ar.edu.unq.po2.tp2;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unq.po2.tp2.employee.Employee;

public class Company {

	private int CUIT;
	private List<Employee> employees;
	private String name;

	public Company(int CUIT, String name) {
		this.CUIT = CUIT;
		this.employees = new ArrayList<Employee>();
		setName(name);
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void settleSalaries() {
		employees.stream().forEach(employee -> employee.addPaySlip(PaySlip.newPaySlipTo(employee)));
	}
		
	public double totalEmployeeWithholdings() {
		return employees.stream().mapToDouble(Employee::withholdings).sum();
	}
	
	public double totalGrossEmployeeSalaries() {
		return employees.stream().mapToDouble(Employee::grossSalary).sum();
	}

	public double totalNetEmployeeSalaries() {
		return employees.stream().mapToDouble(Employee::netSalary).sum();
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
