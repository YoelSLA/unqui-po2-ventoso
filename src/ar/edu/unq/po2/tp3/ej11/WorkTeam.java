package ar.edu.unq.po2.tp3.ej11;

import java.util.ArrayList;

public class WorkTeam {
	
	private String name;
	private ArrayList<Person> people;
	
	public WorkTeam(String name) {
		setName(name);
		this.people = new ArrayList<Person>();
		
	}
	
	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Person> getPeople() {
		return people;
	}
	
	public double averageAgeOfPeople() {
		return people.stream().mapToInt(person -> person.getAge()).sum() / people.size();
	}
	
	public void addPerson(Person person) {
		people.add(person);
		
	}

}
