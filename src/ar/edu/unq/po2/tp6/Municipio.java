package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

public class Municipio {
	
	private List<ActividadSemanal> listaActividadesSemanales = new ArrayList<ActividadSemanal>();
	
	public void agregarActividadSemanal(ActividadSemanal actividad) {
		listaActividadesSemanales.add(actividad);
	}
	
	public int getActividadesSemanales() {
		return listaActividadesSemanales.size();
	}
	
	private List<ActividadSemanal> actividadesDe(Deporte deporte) {
		return listaActividadesSemanales
				.stream()
				.filter(actividad -> actividad.getDeporte() == deporte)
				.toList();
	}
	
	public List<ActividadSemanal> actividadesDeFutbol() {
		return this.actividadesDe(Deporte.FUTBOL);
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		return listaActividadesSemanales
				.stream()
				.filter(actividad -> actividad
						.getDeporte()
						.getComplejidad() == complejidad)
				.toList();
	}
	
	public int horasTotales() {
		return listaActividadesSemanales
				.stream()
				.mapToInt(actividad -> actividad.getDuracion())
				.sum();
	}
	
	public ActividadSemanal menorCostoDe(Deporte deporte) {
		return this.actividadesDe(deporte)
				.stream()
				.min(Comparator.comparing(ActividadSemanal::getCoste))
				.orElseThrow(NoSuchElementException::new);
	}
	
	public void imprimirActividades() {
		listaActividadesSemanales.forEach(ActividadSemanal::toString);
	}

}
