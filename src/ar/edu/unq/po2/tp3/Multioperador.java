package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> enteros = new ArrayList<Integer>();
	
	public void agregarEnteros(int entero) {
		enteros.add(entero);
	}
	
	public int sumar() {
		int suma = 0;
		for (int e : enteros) {
			suma += e;
		}
		return suma;
	}
	
	public int restar() {
		int resta = 0;
		for (int e : enteros) {
			resta -= e;
		}
		return resta;
	}
	
	public int mutiplicar() {
		int mutiplicacion = 0;
		for (int e : enteros) {
			mutiplicacion *= e;
		}
		return mutiplicacion;
	}

}
