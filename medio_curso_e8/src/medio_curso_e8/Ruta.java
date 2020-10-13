package medio_curso_e8;

import java.util.ArrayList;
import java.util.Arrays;

public class Ruta {
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

	public Ruta(ArrayList<Ciudad> ciudades) {
		this.ciudades.addAll(ciudades);
		
	}
	
	public ArrayList<Ciudad> getCiudades(){
		return ciudades;
	}
	
	public int CalcularDistanciaTotal() {
		int total_ciudades = this.getCiudades().size();
		return (int)(this.getCiudades().stream().mapToDouble(x -> {
			int indice_ciudad = this.getCiudades().indexOf(x);
			double returnValue = 0;
			if(indice_ciudad < total_ciudades - 1)returnValue = x.calculaDistancia(this.getCiudades().get(indice_ciudad + 1));
			return returnValue;
		}).sum() + this.getCiudades().get(total_ciudades - 1).calculaDistancia(this.getCiudades().get(0)));
	}
	
	public String toString() {
		return Arrays.toString(ciudades.toArray());
	}
}
