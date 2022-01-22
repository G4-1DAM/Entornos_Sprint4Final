import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author anton
 *
 */
class EquipoTest {

	/**
	 * Set nombre de equipo con caracteres vacios
	 */
	@Test
	void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null, equipo.getNombreEquipo());
	}
	
	/**
	 * Set nombre de equipo valido con caracteres minimos '4'.
	 */
	@Test
	void testSetNombreEquipoCaracterMin() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "1DAM";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	
	/**
	 * Set nombre de equipo valido con caracteres maximos '20'
	 */
	@Test
	void testSetNombreEquipoCaracterMax() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "DesarrolloAplicacion";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo, equipo.getNombreEquipo());
	}
	
	/**
	 * Set nombre de equipo invalido con menos de 4 caracteres
	 */
	@Test
	void testSetNombreEquipoInvalidoCarcterMenor4() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "DAM";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null, equipo.getNombreEquipo());
	}
	
	/**
	 * Set nombre de equipo invalido con mas de 20 caracteres
	 */
	@Test
	void testSetNombreEquipoInvalidoCarcterMayor20() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "DesarrolloAplicacionesMultiplataforma";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null, equipo.getNombreEquipo());
	}
	
	/**
	 * Set nombre de equipo invalido con caracteres numericos
	 */
	@Test
	void testSetNombreEquipoInvalidoCarcterNumerico() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Equipo4Dam";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null, equipo.getNombreEquipo());
	}
			
	
	/**
	 * 
	 */
	@Test
	void testSetRanking() {
		fail("Not yet implemented");
	}

}
