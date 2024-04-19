package ar.edu.unq.po2.tp6;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private int hora;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int hora, int duracion, Deporte deporte) {
		this.diaDeLaSemana = diaDeLaSemana;
		this.hora = hora;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public int getCoste() {
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

	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}
	
	public int getHora() {
		return hora;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public String toString() {
		return "Deporte: " + getDeporte() + ". Dia: " + getDiaDeLaSemana() + " A LAS: " + getHora() + ". Duracion: " + getDuracion() + " hora(s).";
	}
}
