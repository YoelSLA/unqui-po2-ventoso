package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		
		// 4
		WorkTeam po2 = new WorkTeam("po2");
		Person yoel = new Person("Yoel", LocalDate.of(2000, Month.FEBRUARY, 1));
		Person guillermo = new Person("Guillermo", LocalDate.of(1985, Month.SEPTEMBER, 7));
		Person ivan = new Person("Ivan", LocalDate.of(1993, Month.APRIL, 10));
		Person alejandra = new Person("Alejandra", LocalDate.of(1996, Month.AUGUST, 25));
		Person gabriela = new Person("Gabriela", LocalDate.of(2000, Month.FEBRUARY, 1));
		po2.addPerson(yoel);
		po2.addPerson(guillermo);
		po2.addPerson(ivan);
		po2.addPerson(alejandra);
		po2.addPerson(gabriela);
		
		// 5
		
		System.out.println(po2.averageAgeOfPeople());
		
  
	}
    

}


