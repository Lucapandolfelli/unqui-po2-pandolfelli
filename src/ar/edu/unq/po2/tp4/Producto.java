package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	protected double precio;
	private Boolean esPrecioCuidado = false;
	
	public Producto(String n, double p) {
		this.nombre = n;
		this.precio = p;
	}
	
	public Producto(String n, double p, Boolean pc) {
		this.nombre = n;
		this.precio = p;
		this.esPrecioCuidado = pc;
	}
	
	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void aumentarPrecio(double aumento) {
		this.setPrecio(this.getPrecio() + aumento);
	}

}
