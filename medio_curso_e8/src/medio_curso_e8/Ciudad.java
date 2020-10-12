package medio_curso_e8;

public class Ciudad {
	
	private double coordenada_x;
	private double coordenada_y;
	private String nombre;
	
	public Ciudad (String nombre,double coordenada_x, double coordenada_y){
		
		this.nombre = nombre;
		this.coordenada_x = coordenada_x;
		this.coordenada_y = coordenada_y;
		
	}
	
	public double getCoordenadaX() {
		return this.coordenada_x;
	}
	
	public double getCoordenadaY() {
		return this.coordenada_y;
	}
	
	public String getNombreCiudad() {
		return this.nombre;
	}
	//calcula distancia euclideana
	public double calculaDistancia(Ciudad ciudad) {
		double diferenciaX = (ciudad.getCoordenadaX() - this.getCoordenadaX());
		double diferenciaY = (ciudad.getCoordenadaY() - this.getCoordenadaY());
		
		return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
	}
	

}
