package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato("Taco",3,false);
		
		//g.nombre = "Taco";
		//g.patas = 3;
		
		g.setNombre("Misifus");
		g.setPatas(3);
		g.setAdoptado(false);
		
		System.out.println(g);
		System.out.println("Mi gato se llama "+g.getNombre());
		
		
		//excepciones
		/*
		int num1 = 5, num2 = 0;
		int resultado = num1/num2;
		System.out.println(resultado);
		*/
	}
}
