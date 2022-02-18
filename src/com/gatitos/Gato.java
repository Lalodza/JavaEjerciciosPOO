package com.gatitos;

public class Gato {
	
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//Constructor
	public Gato(String nombre, int patas, boolean adoptado) {
		super();
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		if(patas >= 0 && patas < 5) {
			this.patas = patas;
		}else {
			throw new IllegalArgumentException("El numero de patas no es valido");
		}
		
	}

	public boolean isAdoptado() { //es "is" porque hace una pregunta
		return adoptado;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	//metodo toSting
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	
}
