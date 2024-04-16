package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}

	public double getPrecioFinal() {
		return precio * 0.9;
	}

}
