package ar.edu.unq.po2.tp4.worker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.income.Income;
import ar.edu.unq.po2.tp4.income.IncomeOvertime;

class WorkerTestCase {
	
	private Worker yoel;
	private Income incomeOfJanuary;
	private Income incomeOfFebruary;
	private Income incomeOfMarch;
	private Income incomeOfApril;
	

	@BeforeEach
	void setUp() {
		yoel = new Worker();
		incomeOfJanuary = new Income(2000.0, "Part-time job", Month.JANUARY);
		incomeOfFebruary = new IncomeOvertime(4000.0, "Full-time job", Month.FEBRUARY, 5);
		incomeOfMarch = new Income(1000.0, "Internship", Month.MARCH);
		incomeOfApril = new IncomeOvertime(3000.0, "Part-time job", Month.APRIL, 3);
		
		yoel.addIncome(incomeOfJanuary);
		yoel.addIncome(incomeOfFebruary);
		yoel.addIncome(incomeOfMarch);
		yoel.addIncome(incomeOfApril);
	}
	
	@Test
	void testWorkerHasFourIncomes() {
		
		assertEquals(4, yoel.getIncomes().size());

	}
	
	@Test
	void testWorkerHasIncomeOvertimeButHasNotAmountTaxable() {
		
		
		assertEquals(0, yoel.getIncomes().size());

	}
	
	@Test
	void testTotalAmountTaxable() {
		
		assertEquals(3000.0, yoel.getAmountTaxable());
		
	}
	
	
	
	

}
