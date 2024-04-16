package ar.edu.unq.po2.tp5;

public abstract class Producto implements Pagable {
	
	private String nombre;
	protected double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		setStock(stock);
	}

	public int getStock() {
		return stock;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		setStock(getStock() - 1);
	}
	
	public void registrarEnCaja(Caja caja) {
		caja.incrementarMontoAPagar(this.getPrecioFinal());
		this.decrementarStock();
	}
	
	public abstract double getPrecioFinal();

}
