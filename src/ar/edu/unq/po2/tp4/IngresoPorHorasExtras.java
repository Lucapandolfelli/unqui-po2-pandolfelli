package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int horasExtras;
	
	public IngresoPorHorasExtras(String m, String c, double mo, int h) {
		super(m, c, mo);
		this.horasExtras = h;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}

}

