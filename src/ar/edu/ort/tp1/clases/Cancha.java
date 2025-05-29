package ar.edu.ort.tp1.clases;

public class Cancha {
		
	private String nombre;	
	private String direccion;
	private TipoCancha tipo;
	
	public Cancha(String nom, String dir, TipoCancha tipo) {
		this.nombre = nom;
		this.direccion = dir; 
		this.tipo = tipo;
	}
	
	public TipoCancha getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return "Cancha " + nombre +"-" + direccion +"-"+ tipo ;
	}
	
	
	
	
	
	
}
