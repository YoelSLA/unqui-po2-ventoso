package ar.edu.unq.po2.tp2;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.company.Company;
import ar.edu.unq.po2.tp2.employee.Contracted;
import ar.edu.unq.po2.tp2.employee.MaritalStatus;
import ar.edu.unq.po2.tp2.employee.Permanent;
import ar.edu.unq.po2.tp2.employee.Temporal;

class CompanyTestCase {

	private Company cocaCola;
	private Temporal temporal;
	private Permanent permanent;
	private Contracted contracted;

	@BeforeEach
	void setup() {
		cocaCola = new Company(2042341174, "CocaCola Company");
		temporal = new Temporal("Brown 5066", LocalDate.of(2000, 2, 1), LocalDate.of(2023, 12, 31),
				MaritalStatus.SOLTERO, 3000.0, "Yoel", 20);
		permanent = new Permanent("Brown 5070", 6, LocalDate.of(1995, 7, 5), MaritalStatus.CASADO, 3200.0, "Gabriela",
				2);
		contracted = new Contracted("Brown 5080", LocalDate.of(1990, 12, 10), 1, MaritalStatus.CASADO, 4000.0,
				"Guillermo", "Efectivo");
		cocaCola.addEmployee(temporal);
		cocaCola.addEmployee(permanent);
		cocaCola.addEmployee(contracted);
	}

	@Test
	void totalAmountOfGrossSalariesOfTheCompanyEmployees() {
		final double totalAmountOfGrossSalariesEmployees = temporal.grossSalary() + permanent.grossSalary()
				+ contracted.grossSalary();

		assertEquals(cocaCola.totalGrossEmployeeSalaries(), totalAmountOfGrossSalariesEmployees, 0);
	}

	@Test
	void totalAmountOfWithholdingsOfTheCompanyEmployees() {
		final double totalAmountOfWithholdingsOfEmployees = temporal.withholdings() + permanent.withholdings()
				+ contracted.withholdings();

		assertEquals(cocaCola.totalEmployeeWithholdings(), totalAmountOfWithholdingsOfEmployees, 0);
	}

	@Test
	void totalAmountOfNetSalariesOfTheCompanyEmployees() {
		final double totalAmountOfNetSalariesEmployees = temporal.netSalary() + permanent.netSalary()
				+ contracted.netSalary();

		assertEquals(cocaCola.totalNetEmployeeSalaries(), totalAmountOfNetSalariesEmployees, 0);
	}
	
	@Test
	void companyCarriesOutSalarySettlement() {
		cocaCola.settleSalaries();
		
		assertEquals(1, temporal.getPaySlips().size());
		assertEquals(1, permanent.getPaySlips().size());
		assertEquals(1, contracted.getPaySlips().size());
	}

}
