package ar.edu.ort.tp1.clases;

public class IntegranteAmateur extends Integrante {

    private static final String MSG_ERROR_PREFERENCIAS =
            "Las preferencias no pueden ser nulas o vacías";
    private static final String MSG_ERROR_FRECUENCIA =
            "La frecuencia de clases no puede ser nula o vacía";

    private String preferencias;
    private String frecuenciaClases;

    public IntegranteAmateur(String nick, int edad, String genero, String zona, int partidosJugados, int puntos, Categoria categoria, EstiloJuego estiloJuego, String preferencias, String frecuenciaClases){
        super(nick, edad, genero, zona, partidosJugados, puntos, categoria, estiloJuego);
        this.setPreferencias(preferencias);
        this.setFrecuenciaClases(frecuenciaClases);
    }

    private void setPreferencias(String preferencias){
        if (preferencias == null || preferencias.isBlank()){
            throw new RuntimeException(MSG_ERROR_PREFERENCIAS);
        }
        this.preferencias = preferencias;
    }

    private void setFrecuenciaClases(String frecuenciaClases){
        if (frecuenciaClases == null || frecuenciaClases.isBlank()){
            throw new RuntimeException(MSG_ERROR_FRECUENCIA);
        }
        this.frecuenciaClases = frecuenciaClases;
    }


}
