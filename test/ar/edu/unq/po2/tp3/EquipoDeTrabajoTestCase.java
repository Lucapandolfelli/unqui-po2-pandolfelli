package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipoDeTrabajo;
	private PersonaDos p1;
	private PersonaDos p2;
	private PersonaDos p3;
	private PersonaDos p4;
	private PersonaDos p5;

	@BeforeEach 
	public void setUp() throws Exception {
		equipoDeTrabajo = new EquipoDeTrabajo("equipo1");
		p1 = new PersonaDos("Pepito", "Perez", 30);
		p2 = new PersonaDos("Pepito", "Perez", 22);
		p3 = new PersonaDos("Pepito", "Perez", 16);
		p4 = new PersonaDos("Pepito", "Perez", 76);
		p5 = new PersonaDos("Pepito", "Perez", 54);
		equipoDeTrabajo.addPersona(p1);
		equipoDeTrabajo.addPersona(p2);
		equipoDeTrabajo.addPersona(p3);
		equipoDeTrabajo.addPersona(p4);
		equipoDeTrabajo.addPersona(p5);
	}
	
	@Test
	public void testPromEdades() {
		assertEquals(39.6, equipoDeTrabajo.promEdades());
	}
}
