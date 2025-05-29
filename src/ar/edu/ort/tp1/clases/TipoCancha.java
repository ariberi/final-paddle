package ar.edu.ort.tp1.clases;

public class TipoCancha {


    private static final String MSG_ERROR_SUPERFICIE =
            "La superficie no puede ser nula";
    private static final String MSG_ERROR_PARED =
            "La pared no puede ser nula";

    private Superficie superficie;
    private Pared pared;

    public TipoCancha(Superficie superficie, Pared pared) {
        this.setSuperficie(superficie);
        this.setPared(pared);
    }

    private void setSuperficie(Superficie superficie) {
        if (superficie == null) {
            throw new IllegalArgumentException(MSG_ERROR_SUPERFICIE);
        }
        this.superficie = superficie;
    }

    private void setPared(Pared pared) {
        if (pared == null) {
            throw new IllegalArgumentException(MSG_ERROR_PARED);
        }
        this.pared = pared;
    }
	
	
	  
}
