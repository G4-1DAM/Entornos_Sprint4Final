import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

	@Test
	void testAsignarEquipo() {
		fail("Not yet implemented");
	}
	
	/**
	 * @author RobertoGarciaSanchez
	 *
	 */
	
	/*Asignar equipo que no exista*/
	//CREO QUE ESTÁ MAL, O NO ES ESTO LO QUE HAY QUE HACER
	@Test
	void testSetEquipoNoExiste() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		
		/*
		*Creamos un equipo que no exista(CREO QUE NO ES ASÍ)*
		Equipo equipo = new Equipo();
		String nombreEquipo ="";
		int ranking=0;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		*/
		/*Asignar el equipo creado en asignar equipo*
		asignarEquipo.setEquipo(equipo);
		*/
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(null);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(null, (Integer) equipoGuardado.getRanking());
	}	
	
	/*Asignar equipo que exista y tenga todos los campos válidos*/
	@Test
	void testSetEquipoCamposValidos() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con todos los campos válidos*/
		Equipo equipo = new Equipo();
		String nombreEquipo ="GDAM";
		int ranking = 0;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertEquals(nombreEquipo, equipoGuardado.getNombreEquipo());
		assertEquals(ranking, equipoGuardado.getRanking());
	}
	
	/*Asignar equipo que exista, pero tenga campo nombre no válido*/
	@Test
	void testSetEquipoNombreNoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con campo nombre no válido*/
		Equipo equipo = new Equipo();
		String nombreEquipo ="1DAM";
		int ranking = 0;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(null);
		assertEquals(null, equipoGuardado.getNombreEquipo());//No se guardará porque el nombre no es válido
		assertEquals(ranking, equipoGuardado.getRanking());
	}
	
	/*Asignar equipo que exista, pero no tenga nombre*/
	@Test
	void testSetEquipoSinNombre() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo sin nombre*/
		Equipo equipo = new Equipo();
		int ranking = 0;
		equipo.setRanking(ranking);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(null);
		assertEquals(null, equipoGuardado.getNombreEquipo());//No se guardará porque no tiene nombre
		assertEquals(ranking, equipoGuardado.getRanking());
	}
	
	/*Asignar equipo que exista, pero tenga campo ranking no válido*/
	@Test
	void testSetEquipoRankingNoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con campo nombre no válido*/
		Equipo equipo = new Equipo();
		String nombreEquipo ="GDAM";
		int ranking= 11;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(null);
		assertEquals(nombreEquipo, equipoGuardado.getNombreEquipo());
		assertEquals(null, (Integer) equipoGuardado.getRanking());//No se guardará porque el ranking no es válido
	}
	
	/*Asignar equipo que exista, pero no tenga ranking*/
	@Test
	void testSetEquipoSinRanking() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo sin ranking*/
		Equipo equipo = new Equipo();
		String nombreEquipo ="GDAM";
		equipo.setNombreEquipo(nombreEquipo);		
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(null);
		assertEquals(nombreEquipo, equipoGuardado.getNombreEquipo());
		assertEquals(null, (Integer) equipoGuardado.getRanking());//No se guardará porque no hay ranking
	}
	
	/**
	 * @author Carlos Soler Garcia
	 *
	 */

	/*Asignar jugador que no exista (Es decir, es nulo)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Asignamos un jugador que puede tener campos válidos pero que no existe*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista y tenga todos sus campos válidos*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Carlos";
		int edadValida = 25;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista, pero su nombre sea inválido
	(podeis poner cualquier nombre no válido, porque ya se prueba
	todas las combinaciones posibles en el anterior)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Novalido";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista, pero no tenga nombre (es decir,
	habéis creado el jugador pero no habéis puesto el nombre con setnombre)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";

		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista, pero su edad sea inválida
	(podeis poner cualquier edad no válida, porque ya se prueba
	todas las combinaciones posibles en el anterior)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 15;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(null, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista, pero no tenga edad(es decir,
	habéis creado el jugador pero no habéis puesto el nombre con setedad)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = ;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);

		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(null, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista, pero su idioma sea inválido
	(podeis poner cualquier idioma no válido, porque ya se prueba
	todas las combinaciones posibles en el anterior)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Dumitrescu";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que exista, pero no tenga idioma(es decir,
	habéis creado el jugador pero no habéis puesto el idioma con setIdioma)*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(null);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
}

