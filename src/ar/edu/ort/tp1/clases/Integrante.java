package ar.edu.ort.tp1.clases;

public class Integrante {

    private static final String MSG_ERROR_NICK =
            "Nickname no puede ser nulo o vacio";
    private static final String MSG_ERROR_EDAD =
            "El integrante no puede ser un menor";
    private static final String MSG_ERROR_GENERO =
            "El genero debe ser M o F";
    private static final String MSG_ERROR_ZONA =
            "La zona no puede ser nula o vacia";
    private static final String MSG_ERROR_PARTIDOS_JUGADOS =
            "La cantidad de partidos jugados no puede ser negativo";
    private static final String MSG_ERROR_PUNTOS =
            "La cantidad de puntos no puede ser negativo";
    private static final String MSG_ERROR_CATEGORIA =
            "La categoria no puede ser nula";
    private static final String MSG_ERROR_ESTILO_JUEGO =
            "El estilo de juego no puede ser nulo";

    private static final int EDAD_MINIMA = 18;

    private static final int PUNTOS_GANADOR = 10;

    private String nick;
    private int edad;
    private String genero;
    private String zona;
    private int partidosJugados;
    private int puntos;
    private Categoria categoria;
    private EstiloJuego estiloJuego;


    public Integrante(String nick, int edad, String genero, String zona, int partidosJugados, int puntos, Categoria categoria, EstiloJuego estiloJuego) {
        this.setNick(nick);
        this.setEdad(edad);
        this.setGenero(genero);
        this.setZona(zona);
        this.setPartidosJugados(partidosJugados);
        this.setPuntos(puntos);
        this.setCategoria(categoria);
        this.setEstiloJuego(estiloJuego);
    }

    private void setNick(String nick){
        if (nick == null || nick.isBlank()) {
            throw new IllegalArgumentException(MSG_ERROR_NICK);
        }
        this.nick = nick;
    }

    private void setEdad(int edad){
        if (edad < EDAD_MINIMA) {
            throw new IllegalArgumentException(MSG_ERROR_EDAD);
        }
        this.edad = edad;
    }

    private void setGenero(String genero){
        if (genero == null || genero.isBlank() || (!genero.equals("M") && !genero.equals("F"))) {
            throw new IllegalArgumentException(MSG_ERROR_GENERO);
        }
        this.genero = genero;
    }

    private void setZona(String zona){
        if (zona == null || zona.isBlank()) {
            throw new IllegalArgumentException(MSG_ERROR_ZONA);
        }
        this.zona = zona;
    }

    private void setPartidosJugados(int partidosJugados){
        if (partidosJugados < 0) {
            throw new IllegalArgumentException(MSG_ERROR_PARTIDOS_JUGADOS);
        }
        this.partidosJugados = partidosJugados;
    }

    private void setPuntos(int puntos){
        if (puntos < 0) {
            throw new IllegalArgumentException(MSG_ERROR_PUNTOS);
        }
        this.puntos = puntos;
    }

    private void setCategoria(Categoria categoria){
        if (categoria == null) {
            throw new IllegalArgumentException(MSG_ERROR_CATEGORIA);
        }
        this.categoria = categoria;
    }

    private void setEstiloJuego(EstiloJuego estiloJuego){
        if (estiloJuego == null) {
            throw new IllegalArgumentException(MSG_ERROR_ESTILO_JUEGO);
        }
        this.estiloJuego = estiloJuego;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public String getNick() {
        return this.nick;
    }


    public boolean mismoNick(String nick) {
        return this.nick.equals(nick);
    }

    public void sumarPuntos() {
        this.puntos+= PUNTOS_GANADOR;
    }

    @Override
    public String toString() {
        return "Categoria " + this.categoria + " - " + this.categoria.getDescripcion() +
                this.getClass().getSimpleName() + " = nickname " + this.nick + "edad " + this.edad + "genero " + this.genero + "zona " + this.zona + "partidos jugados " + this.partidosJugados + "puntos " + this.puntos + "estilo de juego " + this.estiloJuego;
    }
}
