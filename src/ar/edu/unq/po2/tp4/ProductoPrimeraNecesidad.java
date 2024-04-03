package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double porcentajeDeDescuento;

	/**public ProductoPrimeraNecesidad(String n, double p) {
		super(n, p);
	}
	
	public ProductoPrimeraNecesidad(String n, double p, Boolean pc) {
		super(n, p, pc);
	}*/
	
	public ProductoPrimeraNecesidad(String n, double p, Boolean pc, double d) {
		super(n, p, pc);
		this.porcentajeDeDescuento = d;
	}
	
	public double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}
	
	private double getDescuento() {
		return (precio * this.getPorcentajeDeDescuento()) / 100;
	}
	
	@Override
	public double getPrecio() {
		return precio - this.getDescuento();
	}
	
}
