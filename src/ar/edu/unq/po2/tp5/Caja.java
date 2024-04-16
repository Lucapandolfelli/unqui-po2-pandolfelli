package ar.edu.unq.po2.tp5;

public class Caja {
	
	private double totalAPagar = 0;

	public double getTotalAPagar() {
		return totalAPagar;
	}
	
	public void registrarPagable(Pagable pagable) {
		pagable.registrarEnCaja(this);
	}

	public void incrementarMontoAPagar(double precio) {
		this.totalAPagar = this.getTotalAPagar() + precio;
	}

}
