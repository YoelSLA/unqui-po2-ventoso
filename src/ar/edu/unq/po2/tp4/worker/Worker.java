package ar.edu.unq.po2.tp4.worker;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp4.income.Income;

public class Worker {

	private List<Income> incomes;
	
	public Worker() {
		this.incomes = new ArrayList<Income>();
	}

	public void addIncome(Income income) {
		incomes.add(income);
	}

	public double getAmountTaxable() {
		return incomes.stream().mapToDouble(income -> income.getAmountTaxable()).sum();
	}

	public double getIncomeToPay() {
		return getTotalEarned() * 0.02;
	}

	public double getTotalEarned() {
		return incomes.stream().mapToDouble(income -> income.getAmount()).sum();
	}

	public List<Income> getIncomes() {
		return incomes;
	}

}
