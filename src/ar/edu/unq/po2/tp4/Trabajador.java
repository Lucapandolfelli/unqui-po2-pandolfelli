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
		double totalImponible = 0;
		for (Ingreso i : ingresosPercibidos) {
			totalImponible += i.getMontoImponible();
	    }
		return totalImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
}
