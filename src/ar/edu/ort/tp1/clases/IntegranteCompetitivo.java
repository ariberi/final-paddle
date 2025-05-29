package ar.edu.ort.tp1.clases;

public class IntegranteCompetitivo extends Integrante {

    private static final String MSG_ERROR_TORNEOS_OFICIALES =
            "La cantidad de torneos oficiales no puede ser negativa";

    private int torneosOficiales;

    public IntegranteCompetitivo(String nick, int edad, String genero, String zona, int partidosJugados, int puntos, Categoria categoria, EstiloJuego estiloJuego, int torneosOficiales) {
        super(nick, edad, genero, zona, partidosJugados, puntos, categoria, estiloJuego);
        this.setTorneosOficiales(torneosOficiales);
    }

    private void setTorneosOficiales(int torneosOficiales) {
        if (torneosOficiales < 0) {
            throw new IllegalArgumentException(MSG_ERROR_TORNEOS_OFICIALES);
        }
        this.torneosOficiales = torneosOficiales;
    }
}
