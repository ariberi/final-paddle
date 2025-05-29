package ar.edu.ort.tp1.clases;

public class Partido {

    private static final String MSG_ERROR_DIA_JUEGO =
            "Debes colocar un día válido por partido";

    private static final int JUGADORES = 2;
    private static final int CANT_SETS = 3;
    private static final int PAREJA_1 = 0;
    private static final int PAREJA_2 = 1;

    private String diaJuego;
    private String horaJuego;
    private String modalidad;
    private String[][] parejas;
    private Cancha cancha;
    private int[][] setsJugados;

    private String[] parejaGanadora;

    public Partido(String diaJuego, String horaJuego, String modalidad, Cancha cancha, String[][] parejas, int[][] setsJugados) {
        this.setDiaJuego(diaJuego);
        this.horaJuego = horaJuego;
        this.modalidad = modalidad;
        this.cancha = cancha;
        this.parejas = parejas;
        this.setsJugados = setsJugados;
        this.parejaGanadora = new String[JUGADORES];
    }

    public String[] obtenerParejaGanadora(){
        int setGanados1 = 0;
        int setGanados2 = 0;
        String[] parejaGanadora = new String[JUGADORES];
        int i = 0;
        while (i < CANT_SETS && (setGanados1 < 2 && setGanados2 < 2)){
            if (this.setsJugados[PAREJA_1][i] > this.setsJugados[PAREJA_2][i]){
                setGanados1++;
            } else {
                setGanados2++;
            }
            i++;
        }
        if (setGanados1 > setGanados2){
            parejaGanadora = this.parejas[PAREJA_1];
        } else {
            parejaGanadora = this.parejas[PAREJA_2];
        }
        this.parejaGanadora = parejaGanadora;
        return parejaGanadora;
    }

    private void setDiaJuego(String diaJuego) {
        if (diaJuego == null || diaJuego.isBlank()) {
            throw new IllegalArgumentException(MSG_ERROR_DIA_JUEGO);
        }
        this.diaJuego = diaJuego;
    }

    public String[] getParejaGanadora() {
        return this.parejaGanadora;
    }

    @Override
    public String toString() {
        return "Partido: " + this.diaJuego + " - " + this.horaJuego + " - " + this.modalidad + " - " + this.cancha + " - " + this.parejas + " - " + this.setsJugados;
    }










	

	
}
