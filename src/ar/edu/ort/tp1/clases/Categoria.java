package ar.edu.ort.tp1.clases;

public enum Categoria {
	
	C1("Jugadores profesionales, PPT y APT"), 
	C2("Domina muy bien técnica y táctica"),
	C3("Técnica media y alta táctica"), 
	C4("Domina la mayoría de los golpes. Algunos Errores no forzados"),
	C5("Domina la mayoría de los golpes. Muchos errores no forzados"),
	C6("Casi domina la mayoría de golpes. Controla direcciones"),
	C7("Pocas clases. Pelotea y devuelve a baja velocidad");
	
	private String descripcion;
	
	private Categoria (String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
