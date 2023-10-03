package ar.edu.unq.po2.tp3.ej11;

import java.time.LocalDate;

public class Person {

	private String name;
	private LocalDate dateOfBirth;
	
	public Person(String name, LocalDate dateOfBirth) {
		setName(name);
		setDateOfBirth(dateOfBirth);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getAge() {
		return LocalDate.now().compareTo(dateOfBirth);
	}
	
	public boolean isLessThan(Person person) {
		return getAge() < person.getAge();
	}
	
}
