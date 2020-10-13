package medio_curso_e8;

import java.util.ArrayList;
import java.util.Arrays;

public class TSP {
	private ArrayList <Ciudad> ciudades_iniciales = new ArrayList<Ciudad>(Arrays.asList(
			new Ciudad("Ciudad1",535576 ,3950550),
			new Ciudad("Ciudad2",537448 ,3950559 ),
			new Ciudad("Ciudad3",537518  ,3951604 ),
			new Ciudad("Ciudad4",536538  ,3951542 ),
			new Ciudad("Ciudad5",535115  ,3951383 ),
			new Ciudad("Ciudad6",534268  ,3950869 )
			));
	
	public static void main(String[] args) {
		TSP tsp = new TSP();
		ArrayList <Ciudad> ciudades = new ArrayList<Ciudad>();
		ciudades.addAll(tsp.ciudades_iniciales);
		tsp.muestraRutaMasCorta(new Algoritmo().encuentraRutaMasCorta(ciudades));
	}
	
	private void muestraRutaMasCorta(Ruta ruta_mas_corta) {
		System.out.println("---------------------------------------------------------");
		System.out.println("La ruta mas corta: "+ ruta_mas_corta);
		System.out.println("Distancia total: " + ruta_mas_corta.CalcularDistanciaTotal());
		System.out.println("---------------------------------------------------------");
	}

}
