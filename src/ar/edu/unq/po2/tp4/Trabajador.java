package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();

	public double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso i : ingresosPercibidos) {
			totalPercibido += i.getMontoPercibido();
	    }
		return totalPercibido;
	}
	
	public double getMontoImponible() {
		
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.8;
	}
	
}
