package ar.edu.unq.po2.tp3;

import java.util.Date;

public class Persona {
	
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(String n, Date f) {
		this.nombre = n;
		this.fechaNacimiento = f;
	}
	
	public Persona createPersona(String nombre, Date fechaNacimiento) {
		return new Persona(nombre, fechaNacimiento);
	}

}
