package ar.edu.unq.po2.tp6;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private int horaInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int horaInicio, int duracion, Deporte deporte) {
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public int coste() {
		int coste = 0;
		if (diaDeLaSemana == DiaDeLaSemana.LUNES || 
			diaDeLaSemana == DiaDeLaSemana.MARTES || 
			diaDeLaSemana == DiaDeLaSemana.MIERCOLES) {
			coste = 500 + 200 * deporte.getComplejidad();
		} else {
			coste = 1000 + 200 * deporte.getComplejidad();
		}
		return coste;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public int getDuracion() {
		return duracion;
	}
}
