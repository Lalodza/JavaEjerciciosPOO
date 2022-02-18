package com.generation;

public class Tacos {

	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanoDeTortilla;
	private float precio = 0.0f;

	public Tacos() {
		
	}
	
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public Tacos(String tipoDeTortilla,String tipoDeGuisado,
			int numeroDeTortilla, String tamanoDeTortilla,
			float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanoDeTortilla = tamanoDeTortilla;
		this.precio = precio;
	}
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido ");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}

	void subirPrecio(float aumento) {
		precio += aumento;
	}
	
	//===============Metodo para encapsular===============
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanoDeTortilla() {
		return tamanoDeTortilla;
	}

	public void setTamanoDeTortilla(String tamanoDeTortilla) {
		if(tamanoDeTortilla.toLowerCase() == "grande" || tamanoDeTortilla.toLowerCase() == "chica" || tamanoDeTortilla.toLowerCase() == "mediana"  ) {
			this.tamanoDeTortilla = tamanoDeTortilla;
		}else {
			throw new IllegalArgumentException("Tamaño incorrecto, debe ser chica, grande o mediana");
		}
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanoDeTortilla=" + tamanoDeTortilla + ", precio=" + precio + "]";
	}
	
	
	
}
