package pl.javastart.zadania00;

import pl.javastart.przyklady00.Person;

public class Employee extends Person{
	
	/**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;*/
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(){}
	public Employee(String firstName,String lastName, double salary){
		super(firstName, lastName);
		this.salary=salary;
	}
	@Override
	public String toString() {
		return super.toString() + ", wyp³ata " + salary;
	}


}
