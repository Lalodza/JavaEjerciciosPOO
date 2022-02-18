package com.generation;

public class Main {

	public static void main(String[] args) {
		
		Tacos taquito1 = new Tacos("Masa Azul","Suadero",2,"Mediana",30);
		
//		taquito1.tipoDeTortilla = "Masa Azul";
//		taquito1.tipoDeGuisado = "Suadero";
//		taquito1.numeroDeTortilla = 2;
//		taquito1.tamanoDeTortilla = "Mediana";
//		taquito1.precio = 30;
		taquito1.subirPrecio(5.5f);
		System.out.println("Taco 1 "+taquito1.toString());

	//	Tacos taquito2 = new Tacos();
		Tacos taquito2 = new Tacos("Harina","Bistec",1,"Grande",42.6f);
		/*
		taquito2.tipoDeTortilla = "Harina";
		taquito2.tipoDeGuisado = "Bistec";
		taquito2.numeroDeTortilla = 1;
		taquito2.tamanoDeTortilla = "Grande";
		taquito2.precio = 42.6f;
		taquito2.tipoDeTortilla = "Trigo";
		*/
		System.out.println("Taco 2 "+taquito2.toString());
		
		Tacos taquito3 = new Tacos("Maiz");
		System.out.println(taquito1);
		System.out.println(taquito2);
		System.out.println(taquito3);
		
		Tacos t1 = new Tacos();
		t1.setTipoDeTortilla("A mano");
		t1.setTipoDeGuisado("Barbacoa");
		t1.setNumeroDeTortilla(2);
		t1.setTamanoDeTortilla("grande");
		t1.setPrecio(25);
		System.out.println("\n\n\nEl taco encapsulado es: "+t1);
	}

}
