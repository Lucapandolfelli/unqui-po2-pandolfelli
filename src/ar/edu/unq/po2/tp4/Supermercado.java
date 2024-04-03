package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	
	private ArrayList<Producto> catalogo = new ArrayList<Producto>();
	
	public Supermercado(String n, String d) {
		this.nombre = n;
		this.direccion = d;
	}
	
	public void agregarProducto(Producto producto) {
		catalogo.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return catalogo.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p : catalogo) {
			precioTotal += p.getPrecio();
	    }
		return precioTotal;
	}

}
