package ar.edu.unq.po2.tp6;

import java.util.Comparator;
import java.util.List;

public class Municipio {
	
	private List<ActividadSemanal> listaActividadesSemanales;
	
	public void agregarActividadSemanal(ActividadSemanal actividad) {
		listaActividadesSemanales.add(actividad);
	}
	
	public List<ActividadSemanal> actividadesDeFutbol() {
		return listaActividadesSemanales.stream()
        .filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL).toList();
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		return listaActividadesSemanales.stream()
        .filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public int horasTotales() {
		return listaActividadesSemanales.stream().mapToInt(actividad -> actividad.getDuracion()).sum();
	}
	
	public ActividadSemanal menorCostoDe(Deporte deporte) {
		return listaActividadesSemanales.stream().min(Comparator.comparing(a->a.coste())).filter(actividad -> actividad.getDeporte() == deporte);
	}

}
