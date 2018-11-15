package pl.javastart.zadania;

import java.util.HashMap;
import java.util.Map;

public class Company {
	Map<String, Employee> employees = new HashMap<>();

	public Map<String, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<String, Employee> employees) {
		this.employees = employees;
	}
}
