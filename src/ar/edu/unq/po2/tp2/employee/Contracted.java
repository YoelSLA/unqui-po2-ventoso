package ar.edu.unq.po2.tp2.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Concept;
import ar.edu.unq.po2.tp2.MaritalStatus;

public class Contracted extends Employee {

	private int contractNumber;
	private String paymentMethod;

	public Contracted(String adress, LocalDate birthDate, int contractNumber, MaritalStatus maritalStatus,
			double minimumSalary, String name, String paymentMethod) {
		super(adress, birthDate, maritalStatus, minimumSalary, name);
		setContractNumber(contractNumber);
		setPaymentMethod(paymentMethod);
	}

	@Override
	public List<Concept> concepts() {
		List<Concept> concepts = new ArrayList<>();
		concepts.add(new Concept("Contractual Administrative Expenses: ", 50));
		concepts.add(new Concept("Withholdigns = ", withholdings()));
		concepts.add(new Concept("Net Salary = ", netSalary()));
		return concepts;
	}
	
	@Override
	public double netSalary() {
		return withholdings();
	}

	@Override
	public double withholdings() {
		return 50;
	}

	public int getContractNumber() {
		return contractNumber;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
