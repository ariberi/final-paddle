package ar.edu.ort.tp1.clases;

public class EstiloJuego {

    private static final String MSG_ERROR_POSICION =
            "La posición no puede ser nula";
    private static final String MSG_ERROR_PALA =
            "La pala no puede ser nula";

    private Posicion posicion;
    private Pala pala;

    public EstiloJuego(Posicion posicion, Pala pala) {
        this.setPosicion(posicion);
        this.setPala(pala);
    }

    private void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException(MSG_ERROR_POSICION);
        }
        this.posicion = posicion;
    }

    private void setPala(Pala pala) {
        if (pala == null) {
            throw new IllegalArgumentException(MSG_ERROR_PALA);
        }
        this.pala = pala;
    }


	
	
	
}
