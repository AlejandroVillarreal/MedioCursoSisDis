package medio_curso_e8;

import java.util.ArrayList;
import java.util.Arrays;

public class Algoritmo {
	
	public Ruta encuentraRutaMasCorta(ArrayList <Ciudad> ciudades) {
		ArrayList <Ciudad> ruta_mas_corta = new ArrayList<Ciudad>(ciudades.size());
		System.out.println("Ruta inicial: "+ Arrays.toString(ciudades.toArray()));
		System.out.println("Distancia total: " + new Ruta(ciudades).CalcularDistanciaTotal());
		System.out.println("---------------------------------------------------------------");
		Ciudad ciudad = ciudades.get((int)(ciudades.size()*Math.random()));
		actualizaRutas(ruta_mas_corta,ciudades,ciudad);
		while (ciudades.size() >= 1) {
			ciudad.getSigCiudad(ciudades,ciudad);
			actualizaRutas(ruta_mas_corta,ciudades,ciudad);
		}
		return new Ruta(ruta_mas_corta);
	}
	
	private void actualizaRutas(ArrayList <Ciudad> ruta_mas_corta, ArrayList <Ciudad> ciudades, Ciudad ciudad) {
		ruta_mas_corta.add(ciudad);
		ciudades.remove(ciudad);
		System.out.println("Ciudades con ruta mas cercana: " +Arrays.toString(ruta_mas_corta.toArray()));
		System.out.println("Ciudades restantes: " +Arrays.toString(ciudades.toArray()) + "\n");
	}
	
	private Ciudad getSigCiudad(ArrayList<Ciudad> ciudades,Ciudad ciudad) {
		return ciudades.stream().min((ciudad1, ciudad2)->{
			int flag = 0;
			if(ciudad1.calculaDistancia(ciudad) < ciudad2.calculaDistancia(ciudad)) flag = -1;
			else if(ciudad1.calculaDistancia(ciudad) > ciudad2.calculaDistancia(ciudad)) flag = 1;
			return flag;
		}).get();
	}
}
