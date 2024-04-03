package ar.edu.unq.po2.tp3;

import java.util.Date;

public class PersonaDos {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public int edad() {
		return this.edad;
	}
	
	public PersonaDos(String n, String a, int e) {
		this.nombre = n;
		this.apellido = a;
		this.edad = e;
	}

}
