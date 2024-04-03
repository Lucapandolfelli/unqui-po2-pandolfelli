package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String m, String c, double mo) {
		this.mesDePercepcion = m;
		this.concepto = c;
		this.montoPercibido = mo;
	}
	
	public double montoImponible() {
		return montoPercibido;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}

}

