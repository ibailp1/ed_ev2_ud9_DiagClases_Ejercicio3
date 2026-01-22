package org.cuatrovientos.ed;

public class Customer {
	public String name;
	public String surname;
	protected int age;
	private boolean single;
	private String country;
	
	public Customer() {
		
	}
	
	public String toString() {
		return "Customer --> name: " + name + ", surname: " + surname + ", age: " + age + ", single: " + single + ", country: " + country;
	}
	
	private void doSomething() {
		
	}
}
