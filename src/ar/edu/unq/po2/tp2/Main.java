package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

import ar.edu.unq.po2.tp2.company.Company;
import ar.edu.unq.po2.tp2.employee.MaritalStatus;
import ar.edu.unq.po2.tp2.employee.Temporal;

public class Main {

	public static void main(String[] args) {
		
		Company cocaCola = new Company(2042341174, "CocaCola Company");
		Temporal temporal = new Temporal("Brown 5066", LocalDate.of(2000, 2, 1), LocalDate.of(2023, 12, 31),
				MaritalStatus.SOLTERO, 3000.0, "Yoel", 20);
		
		cocaCola.settleSalaries();
		
	}

}
