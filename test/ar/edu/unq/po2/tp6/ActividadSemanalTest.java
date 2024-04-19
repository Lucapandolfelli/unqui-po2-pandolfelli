package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ActividadSemanalTest {
	
	private ActividadSemanal act1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 16, 1, Deporte.FUTBOL);
	
	@Test
	public void testCoste() {
		assertEquals(900, act1.getCoste()); // 500 + 2 * 200 = 500 + 400 = {900}
	}
	
	@Test
	public void testToString() {
		assertEquals("Deporte: FUTBOL. Dia: LUNES A LAS: 16. Duracion: 1 hora(s).", act1.toString()); 
	}

}
