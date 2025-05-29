package ar.edu.ort.tp1.clases;


import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class App implements Resultable {

	private static final String MSG_ERROR_NICK =
			"Ya hay un integrante registrado con ese nickName";
	private static final String MSG_ERROR_INTEGRANTE =
			"El integrante no puede ser nulo";

	private ListaOrdenadaIntegrantesPorCategoria integrantes;
	private PilaNodos<Partido> partidos;

	public App() {
		this.integrantes = new ListaOrdenadaIntegrantesPorCategoria();
		this.partidos = new PilaNodos<Partido>();
	}
	
	
	
	public void informarRanking() {
		System.out.println("**RANKING POR CATEGORÍA ACTUALIZADO**");
		for (Categoria categoria : Categoria.values()) {
			for (Integrante integrante : this.integrantes){
				if (integrante.getCategoria().equals(categoria)){
					System.out.println(integrante);
				}
			}
		}

	}


	//En este caso se establece el primer
	//puesto del ranking por cada categoría
	private void actualizarRanking() {
		PilaNodos<Partido> aux = new PilaNodos<Partido>();
		while (!this.partidos.isEmpty()) {
			Partido partido = this.partidos.pop();
			String[] parejaGanadora = partido.obtenerParejaGanadora();
			this.asignarPuntos(parejaGanadora);
			aux.push(partido);
		}
		while (!aux.isEmpty()) {
			this.partidos.push(aux.pop());
		}
	}

	private void asignarPuntos(String[] parejaGanadora) {
		Integrante integrante1 = this.buscarIntegrante(parejaGanadora[0]);
		Integrante integrante2 = this.buscarIntegrante(parejaGanadora[1]);
		integrante1.sumarPuntos();
		integrante2.sumarPuntos();
	}

	
	
	private Integrante buscarIntegrante(String nick) {
		Integrante integrante = null;
		int i = 0;
		while (i < this.integrantes.size() && integrante == null) {
			if (this.integrantes.get(i).mismoNick(nick)) {
				integrante = this.integrantes.get(i);
			}
			i++;
		}
		return integrante;
	}

	public void agregarIntegrantes(Integrante integrante) {
		if (integrante != null){
			if (existeIntegranteConMismoNick(integrante)) {
				throw new IllegalArgumentException(MSG_ERROR_NICK);
			}
			this.integrantes.add(integrante);
		} else {
			throw new IllegalArgumentException(MSG_ERROR_INTEGRANTE);
		}
	}

	private boolean existeIntegranteConMismoNick(Integrante integrante) {
		boolean existe = false;
		int i = 0;
		while (i < this.integrantes.size() && !existe) {
			if (this.integrantes.get(i).mismoNick(integrante.getNick())) {
				existe = true;
			}
			i++;
		}
		return existe;
	}

	public void agregarPartidosJugados(Partido partido) {
		if (partido == null) {
			throw new IllegalArgumentException("El partido no puede ser nulo");
		}
		this.partidos.push(partido);
	}


	public void conformarResultado() {
		this.ultimosPartidosJugados();
		this.actualizarRanking();
		this.informarRanking();
	}

	private void ultimosPartidosJugados() {
		PilaNodos<Partido> aux = new PilaNodos<Partido>();
		while (!this.partidos.isEmpty()) {
			Partido partido = this.partidos.pop();
			System.out.println(partido);
			aux.push(partido);
		}
		while (!aux.isEmpty()) {
			this.partidos.push(aux.pop());
		}
	}
}
