package org.cuatrovientos.ed;

public class Principal {

	public static void main(String[] args) {
		Customer cli1 = new Customer();
		
		cli1.name = "Ibai";
		cli1.surname = "Lejona";
		cli1.age = 18;
		
		System.out.println(cli1.toString());
	}

}
