package ar.edu.ort.tp1.clases;



public class ClaseControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**ERROR TRACKS**");

		App aplicacion = new App();

		agregarIntegranteAmateur(aplicacion, "@ale", 38, "M", "Belgrano", 18, 9, Categoria.C7,
				new EstiloJuego(Posicion.DRIVE, Pala.DIAMANTE), "Fines de semana - Mixto", "Bimestral");
		agregarIntegranteAmateur(aplicacion, "lucasMan", 35, "M", "Núñez", 19, 10, Categoria.C6,
				new EstiloJuego(Posicion.DRIVE, Pala.DIAMANTE), "Fines de semana - Masculino", "Mensual");
		agregarIntegranteAmateur(aplicacion, "lucasMan", 35, "M", "Núñez", 19, 10, Categoria.C6,
				new EstiloJuego(Posicion.DRIVE, Pala.DIAMANTE), "Fines de semana - Masculino", "Mensual");
		agregarIntegranteAmateur(aplicacion, "LorenaB", 30, "F", "Núñez", 20, 11, Categoria.C3,
				new EstiloJuego(Posicion.DRIVE, Pala.DIAMANTE), "Fines de semana - Mixto", "Semanal");
		agregarIntegranteAmateur(aplicacion, "AugustoLan", 35, "M", "Núñez", 14, 10, Categoria.C6,
				new EstiloJuego(Posicion.REVES, Pala.DIAMANTE), "Fines de semana - Mixto", "Semanal");
		agregarIntegranteAmateur(aplicacion, "LioM.", 35, "M", "Flores", 17, 10, Categoria.C6,
				new EstiloJuego(Posicion.DRIVE, Pala.DIAMANTE), "Fines de semana - Mixto", "Mensual");
		agregarIntegranteCompetitivo(aplicacion, "CR7", 25, "M", "Saavedra", 18, 9, Categoria.C6,
				new EstiloJuego(Posicion.AMBAS, Pala.DIAMANTE), 3);
		agregarIntegranteCompetitivo(aplicacion, "MadMen", 22, "M", "Urquiza", 26, 10, Categoria.C2,
				new EstiloJuego(Posicion.DRIVE, Pala.DIAMANTE), 4);
		agregarIntegranteCompetitivo(aplicacion, "SophieMarzau", 33, "F", "Núñez", 36, 28, Categoria.C1,
				new EstiloJuego(Posicion.DRIVE, Pala.LAGRIMA), 7);
		agregarIntegranteCompetitivo(aplicacion, "LucasLeal", 42, "M", "Palermos", 21, 15, Categoria.C5,
				new EstiloJuego(Posicion.DRIVE, Pala.REDONDA), 4);
		agregarIntegranteAmateur(aplicacion, "pedroAldo", 35, "M", "Quilmes", 13, 8, Categoria.C5,
				new EstiloJuego(Posicion.REVES, Pala.DIAMANTE), "Entre semana - Mixto", "Mensual");
		agregarIntegranteCompetitivo(aplicacion, "SabrinaZarra", 30, "F", "Almagro", 16, 10, Categoria.C3,
				new EstiloJuego(Posicion.DRIVE, Pala.REDONDA), 3);
		agregarIntegranteCompetitivo(aplicacion, "MadMax", 26, "M", "Almagro", 18, 15, Categoria.C4,
				new EstiloJuego(Posicion.DRIVE, Pala.REDONDA), 2);
		agregarIntegranteCompetitivo(aplicacion, "MurielZeta", 26, "F", "Almagro", 18, 15, Categoria.C2,
				new EstiloJuego(Posicion.AMBAS, Pala.REDONDA), 4);
		agregarIntegranteCompetitivo(aplicacion, "CrisZeta", 17, "M", "Almagro", 18, 15, Categoria.C2,
				new EstiloJuego(Posicion.AMBAS, Pala.REDONDA), 5);
		agregarIntegranteCompetitivo(aplicacion, "FedeLopez", 27, "M", "Almagro", 21, 15, Categoria.C2,
				new EstiloJuego(Posicion.AMBAS, Pala.REDONDA), 5);

		agregarPartido(aplicacion, null, null, null, null, null, null);
		agregarPartido(aplicacion, "Jue 28/11", "18:30", "Masculino",
				new Cancha("El Portón", "Pedraza 1234", new TipoCancha(Superficie.CEMENTO, Pared.BLINDEX)),
				new String[][] { { "pedroAldo", "LucasLeal" }, { "@ale", "AugustoLan" } },
				new int[][] { { 6, 4, 7 }, { 3, 6, 5 } });
		agregarPartido(aplicacion, "Vie 29/11", "20:30", "Mixto",
				new Cancha("Araoz", "Araoz 2345", new TipoCancha(Superficie.CESPED_ARTIFICAL, Pared.BLINDEX)),
				new String[][] { { "MadMen", "SabrinaZarra" }, { "MadMax", "pedroAldo" } },
				new int[][] { { 6, 3, 5 }, { 4, 6, 7 } });
		agregarPartido(aplicacion, "Sab 30/11", "16:00", "Mixto",
				new Cancha("Las Palmas", "Bompland 562", new TipoCancha(Superficie.SINTÉTICO, Pared.MURO)),
				new String[][] { { "MurielZeta", "FedeLopez" }, { "LorenaB", "CR7" } },
				new int[][] { { 6, 6, 7 }, { 4, 3, 5 } });
		// agregarPartido(aplicacion, "Lun 02/12", "19:30","Femenino", new
		// String[][]{{"SabrinaZarra","LorenaB"},{"MurielZeta", "SophieMarzau"}},new
		// int[][]{{6, 6, 5}, {4, 4, 7}} );*/

		// p.conformarResultado();
		System.out.println("");
		System.out.println("**ULTIMOS PARTIDOS JUGADOS**");
		aplicacion.conformarResultado();

	}

	public static void agregarPartido(App aplicacion, String dia, String hora, String modalidad, Cancha cancha,
			String[][] jugadores, int[][] setsJugados) {

		try {
			aplicacion.agregarPartidosJugados(new Partido(dia, hora, modalidad, cancha, jugadores, setsJugados));
		} catch (IllegalArgumentException e) {
			System.out.println("-->" + e.getMessage());
		}

	}

	public static void agregarIntegranteCompetitivo(App aplicacion, String nick, int edad, String genero, String zona,
			int jugados, int ranking, Categoria cat, EstiloJuego estilo, int torneos) {

		try {
			aplicacion.agregarIntegrantes(
					new IntegranteCompetitivo(nick, edad, genero, zona, jugados, ranking, cat, estilo, torneos));
		} catch (IllegalArgumentException e) {
			System.out.println("-->" + e.getMessage());
		}

	}

	public static void agregarIntegranteAmateur(App aplicacion, String nick, int edad, String genero, String zona,
			int jugados, int ranking, Categoria cat, EstiloJuego estilo, String preferencias, String frecuencia) {

		try {
			aplicacion.agregarIntegrantes(new IntegranteAmateur(nick, edad, genero, zona, jugados, ranking, cat, estilo,
					preferencias, frecuencia));
		} catch (IllegalArgumentException e) {
			System.out.println("-->" + e.getMessage());
		}

	}

}
