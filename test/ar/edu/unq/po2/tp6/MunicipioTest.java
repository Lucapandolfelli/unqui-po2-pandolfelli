package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MunicipioTest {

	private Municipio muni = new Municipio();
	private ActividadSemanal act1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 16, 1, Deporte.FUTBOL);
	private ActividadSemanal act2 = new ActividadSemanal(DiaDeLaSemana.VIERNES, 12, 1, Deporte.FUTBOL);
	private ActividadSemanal act3 = new ActividadSemanal(DiaDeLaSemana.SABADO, 12, 1, Deporte.TENNIS);
	private ActividadSemanal act4 = new ActividadSemanal(DiaDeLaSemana.MARTES, 12, 1, Deporte.BASKET);
	
	@BeforeEach
	public void setUp() {
		muni.agregarActividadSemanal(act1);
		muni.agregarActividadSemanal(act2);
		muni.agregarActividadSemanal(act3);
		muni.agregarActividadSemanal(act4);
	}
	
	@Test
	public void testActividadesDeFutbol() {
		assertEquals(2, muni.actividadesDeFutbol().size()); // hay solo 2 de futbol
	}
	
	@Test
	public void testActividadesSegunComplejidad() {
		assertEquals(3, muni.actividadesDeComplejidad(2).size()); // hay 2 de futbol y 1 de basket (complejidad 2)
		assertEquals(1, muni.actividadesDeComplejidad(3).size()); // hay 1 de tennis (complejidad 3)
	}
	
	@Test
	public void testHorasTotales() {
		assertEquals(4, muni.horasTotales()); // cada actividad dura 1 hora y hay 4 
	}
	
	@Test
	public void testMenorCostoDe() {
		// act1 tiene coste de 1400 (1000 + 200 * 2) 
		// act2 tiene coste de 900 (500 + 200 * 2) 
		assertEquals(act1, muni.menorCostoDe(Deporte.FUTBOL)); 
	}

}
