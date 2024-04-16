package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaDelServicio;
	
	public Impuesto(double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}
	
	public double getTasaDelServicio() {
		return tasaDelServicio;
	}

	public double getMontoAPagar() {
		return getTasaDelServicio();
	}

}
