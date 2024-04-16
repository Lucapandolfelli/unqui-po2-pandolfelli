package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {

	private double costoPorUnidad;
	private int cantUnidades;
	
	public Servicio(double costoPorUnidad, int cantUnidades) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidades = cantUnidades;
	}
	
	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public int getCantUnidades() {
		return cantUnidades;
	}
	
	public double getMontoAPagar() {
		return getCostoPorUnidad() * getCantUnidades();
	}

}
