import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void testSetNombreJugador() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}
	
	
	//Set idioma con valor valido
	@Test
	void testSetIdiomaValido() {
		Jugador jugador = new Jugador();
		String idioma = "español";
		
		jugador.setIdioma(idioma);
		assertEquals(idioma, jugador.getIdioma());
	}
	
	//Set idioma con valor no valido
	@Test
	void testSetIdiomaInvalido() {
		Jugador jugador = new Jugador();
		String idioma = "japones";
		
		jugador.setIdioma(idioma);
		assertEquals(null, jugador.getIdioma());
	}
	
	//Set idioma con valor vacio
	@Test
	void testSetIdiomaVacio() {
		Jugador jugador = new Jugador();
		String idioma = "";
		
		jugador.setIdioma(idioma);
		assertEquals(null, jugador.getIdioma());
	}

}
