import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

	//Set equipo con valores valido con 4 caracteres
	@Test
	void testSetEquipoValidoValorMinimo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("malaga");
		
		asignarEquipo.setEquipo(equipo);
		assertNotNull(asignarEquipo.getEquipo());
        assertEquals("malaga", asignarEquipo.getEquipo().getNombreEquipo());
		
	}
	//Set equipo valido con 20 caracteres
	@Test
	void testSetEquipoValidoValorMaximo() {
		AsignarEquipo equipo = new AsignarEquipo();
		String nombreEquipo = "DesarrolloAplicacion";
		
		equipo.setEquipo(nombreEquipo);
		assertEquals(nombreEquipo, equipo.getEquipo());
		
	}
	//Set equipo con menos de 4 caracteres
	@Test
	void testSetEquipoInvalidoMenorCuatro() {
		AsignarEquipo equipo = new AsignarEquipo();
		String nombreEquipo = "Dam";
		
		equipo.setEquipo(nombreEquipo);
		assertEquals(null, equipo.getEquipo());
		
	}
	//Set equipo valido con mas de 20 caracteres
	@Test
	void testSetEquipoInvalidoValorMaximo() {
		AsignarEquipo equipo = new AsignarEquipo();
		String nombreEquipo = "DesarrolloAplicaciones";
		
		equipo.setEquipo(nombreEquipo);
		assertEquals(null, equipo.getEquipo());
		
	}
	//Set equipo con valor vacio
	@Test
	void testSetEquipoInvalidoEquipoVacio() {
		AsignarEquipo equipo = new AsignarEquipo();
		String nombreEquipo = "";
		
		equipo.setEquipo(nombreEquipo);
		assertEquals(null, equipo.getEquipo());
		
	}
	//Set equipo invalido con caracter numerico
	@Test
	void testSetEquipoInvalidoEquipoInvalidoCaracterNumerico() {
		AsignarEquipo equipo = new AsignarEquipo();
		String nombreEquipo = "DamTeam4";
		
		equipo.setEquipo(nombreEquipo);
		assertEquals(null, equipo.getEquipo());
		
	}	

	@Test
	void testSetJugador() {
		fail("Not yet implemented");
	}

}
