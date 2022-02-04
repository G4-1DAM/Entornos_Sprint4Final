import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

	/**
	* @author RobertoGarciaSanchez
	*
	*/
	
	/*Asignar equipo que no exista*/
	@Test
	void testSetEquipoNoExiste() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		
		Equipo equipo = null;
		asignarEquipo.setEquipo(equipo);
		
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(equipoGuardado);
		
	}	
	
	/*Asignar equipo que exista y tenga todos los campos validos*/
	@Test
	void testSetEquipoCamposValidos() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con todos los campos validos*/
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
	
	/*Asignar equipo que exista, pero tenga campo nombre no valido*/
	@Test
	void testSetEquipoNombreNoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con campo nombre no valido*/
		Equipo equipo = new Equipo();
		String nombreEquipo ="1DAM";
		int ranking = 0;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(equipoGuardado);
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
		assertNull(equipoGuardado);
	}
	
	/*Asignar equipo que exista, pero tenga campo ranking no valido*/
	@Test
	void testSetEquipoRankingNoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con campo nombre no valido*/
		Equipo equipo = new Equipo();
		String nombreEquipo ="GDAM";
		int ranking= 11;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNull(equipoGuardado);
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
		assertEquals(equipoGuardado, equipoGuardado);
	}
	
	/**
	 * @author Carlos Soler Garcia
	 *
	 */

	/*Asignar jugador que exista y tenga todos sus campos válidos*/
	@Test
	void testSetJugadorTodosCamposValidos() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Carlos";
		int edadValida = 20;
		String idiomaValido = "español";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNotNull(jugadorGuardado);
		assertEquals(nombreJugador, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/*Asignar jugador que no exista (Es decir, es nulo)*/
	@Test
	void testSetJugadorNoExiste() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Asignamos un jugador que puede tener campos válidos pero que no existe*/
		Jugador jugador = null;

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}

	/*Asignar jugador que exista, pero su nombre sea inválido
	(podeis poner cualquier nombre no válido, porque ya se prueba
	todas las combinaciones posibles en el anterior)*/
	@Test
	void testSetJugadorNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "4353";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}

	/*Asignar jugador que exista, pero no tenga nombre (es decir,
	habéis creado el jugador pero no habéis puesto el nombre con setnombre)*/
	@Test
	void testSetJugadorSinNombrePuesto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";

		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}

	/*Asignar jugador que exista, pero su edad sea inválida
	(podeis poner cualquier edad no válida, porque ya se prueba
	todas las combinaciones posibles en el anterior)*/
	@Test
	void testSetJugadorEdadInvalida() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadInvalida = 15;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadInvalida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}

	/*Asignar jugador que exista, pero no tenga edad(es decir,
	habéis creado el jugador pero no habéis puesto el nombre con setedad)*/
	@Test
	void testSetJugadorSinEdad() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		Integer edadInvalida = null ;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);

		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}

	/*Asignar jugador que exista, pero su idioma sea inválido
	(podeis poner cualquier idioma no válido, porque ya se prueba
	todas las combinaciones posibles en el anterior)*/
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaInvalido = "Dumitrescu";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaInvalido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}

	/*Asignar jugador que exista, pero no tenga idioma(es decir,
	habéis creado el jugador pero no habéis puesto el idioma con setIdioma)*/
	@Test
	void testSetJugadorSinIdioma() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();
		assertNull(jugadorGuardado);
	}
}
