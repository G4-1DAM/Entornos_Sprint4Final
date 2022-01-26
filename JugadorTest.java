import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author RobertoGarciaSanchez
 *
 */

class JugadorTest {

	/**
	 * Set nombre de jugador con caracteres vacios
	 */
	@Test
	void testSetNombreJugadorVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}
	
	/**
	 * Set nombre de jugador valido con caracteres minimos '4'.
	 */
	@Test
	void testSetNombreJugadorCaracterMin() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Set nombre de jugador valido con caracteres maximos '20'
	 */
	@Test
	void testSetNombreJugadorCaracterMax() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Maridelrosalcayetana";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	
	/**
	 * Set nombre de jugador invalido con menos de 4 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoCaracterMenor4() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}
	
	/**
	 * Set nombre de jugador invalido con mas de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoCaracterMayor20() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Mariadelrosariocayetana";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}
	
	/**
	 * Set nombre de jugador invalido con caracteres numericos
	 */
	@Test
	void testSetNombreJugadorInvalidoCaracterNumerico() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana6el";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}
	//caracter igual al limite menor
	@Test
	void testSetEdadJugadorIgual18() {
	Jugador jugador=new Jugador();
	int edad =18;
	jugador.setEdad(edad);
	assertEquals(edad, jugador.getEdad());
	}
	//menor al numeto permitido
	@Test
	void testsetEdadJugadorMenor18() {
		Jugador jugador=new Jugador();
		int edad=17;
		
		jugador.setEdad(edad);
		assertNull(jugador.getEdad());
	}
	//carcater letras no validas
	@Test
	void testSetEdadJugadorCaracternoValido{
		Jugador jugador=new Jugador();
		//int edad=Integer.passerInt("quince");
		//Jugador.setEdad(edad);
		//assertNull(jugador.getEdad());
		
		assertThrows(NumberFormatException.class, () -> {
			int edad=Integer.parseInt("hola");
			jugador.setEdad(edad);
		});
		assertNull(jugador.getEdad());
	}
	//caracter limite mayor
	@Test
	void testSetEdadJugadorIgual100() {
		Jugador jugador=new Jugador();
		int edad =100;
		jugador.setEdad(edad);
		assertEquals(edad, jugador.getEdad());
		}
	//carcater mayor al limite
	@Test
	void testsetEdadJugadorMayor100() {
		Jugador jugador=new Jugador();
		int edad=105;
		jugador.setEdad(edad);
		assertNull(jugador.getEdad());
	}
	//carcater sin rellenar
	@Test
	void testsetEdadJugadorVacio() {
		Jugador jugador=new Jugador();
		int edad=(Integer)null;
		jugador.setEdad(edad);
		assertEquals(null,(Integer) jugador.getEdad());
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
