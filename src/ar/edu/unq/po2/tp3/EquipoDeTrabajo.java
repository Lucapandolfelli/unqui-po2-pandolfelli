package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<PersonaDos> integrantes = new ArrayList<PersonaDos>();
	
	public EquipoDeTrabajo(String n) {
		this.nombre = n;
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public void addPersona(PersonaDos p) {
		integrantes.add(p);
	}
	
	public double promEdades() {
		double sumEdades = 0;
		for (PersonaDos p : integrantes) {
			sumEdades += p.edad();
		}
		return sumEdades / integrantes.size();
	}

}
