package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	
	private Trabajador pepito;
	private Ingreso ingresoEnero;
	private Ingreso ingresoFebrero;
	private IngresoPorHorasExtras ingresoMarzo;
	
	@BeforeEach
	public void setUp() {
		pepito = new Trabajador();
		ingresoEnero = new Ingreso("enero", "", 100000);
		ingresoFebrero = new Ingreso("febrero", "", 100000);
		ingresoMarzo = new IngresoPorHorasExtras("marzo", "", 100000, 10);
		pepito.agregarIngreso(ingresoEnero);
		pepito.agregarIngreso(ingresoFebrero);
		pepito.agregarIngreso(ingresoMarzo);
	}

	@Test
	public void totalPercibido() {
		assertEquals(300000, pepito.getTotalPercibido());
	}
	
	@Test
	public void montoImponible() {
		assertEquals(200000, pepito.getMontoImponible());
	}
	
	@Test
	public void impuestoAPagar() {
		assertEquals(4000, pepito.getImpuestoAPagar());
	}

}
