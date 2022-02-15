package gestionEquipos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	 * Set nombre de jugador "null"
	 */
	@Test
	void testSetNombreJugadorNull() {
		Jugador jugador = new Jugador();
		String nombreJugador = null;
		
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
		String nombreMayusculas = "PEPE";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreMayusculas, jugador.getNombreJugador());
	}
	
	/**
	 * Set nombre de jugador valido con caracteres maximos '20'
	 */
	@Test
	void testSetNombreJugadorCaracterMax() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Maridelrosalcayetana";
		String nombreMayusculas = "MARIDELROSALCAYETANA";
		
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreMayusculas, jugador.getNombreJugador());
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
	//jorge baratech comentarios sobre edad
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
		assertEquals(0, jugador.getEdad());
	}
	
	//carcater letras no validas
	
	
	@Test
	void testSetEdadJugadorCaracternoValido(){
		Jugador jugador=new Jugador();
		
		
		NumberFormatException Thrown=assertThrows(NumberFormatException.class, () -> {
			int edad=Integer.parseInt("hola");
			jugador.setEdad(edad);
		});
		assertNull(Thrown.getCause());
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
		assertEquals(0, jugador.getEdad());
	}
	//carcater sin rellenar
	@Test
	void testsetEdadJugadorVacio() {
		Jugador jugador=new Jugador();
		int edad=0;
		jugador.setEdad(edad);
		assertEquals(0, jugador.getEdad());
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
		String idioma = null;
		
		jugador.setIdioma(idioma);
		assertEquals(null, jugador.getIdioma());
	}
	
	// STORY 5 CARLOS SOLER
	@Test
	void testSetTipoJugador18() {
		Jugador jugador = new Jugador();
		
		int edad = 18;
		String nombre = "Juan";
		String idioma = "ingles";
		
		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		assertEquals("Junior", jugador.tipoJugador());
		
		assertEquals(edad, jugador.getEdad());
		assertEquals(nombre.toUpperCase(), jugador.getNombreJugador());
		assertEquals(idioma, jugador.getIdioma());
	}
	
	@Test
	void testSetTipoJugador24() {
		Jugador jugador = new Jugador();
		
		int edad = 24;
		String nombre = "Juan";
		String idioma = "ingles";
		
		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		assertEquals("Junior", jugador.tipoJugador());
		
		assertEquals(edad, jugador.getEdad());
		assertEquals(nombre.toUpperCase(), jugador.getNombreJugador());
		assertEquals(idioma, jugador.getIdioma());
	}
	@Test
	void testSetTipoJugador100() {
		Jugador jugador = new Jugador();

		int edad = 100;
		String nombre = "Juan";
		String idioma = "ingles";

		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);

		assertEquals("Super Master", jugador.tipoJugador());

	}
	
	@Test
	void testSetTipoJugador25() {
		Jugador jugador = new Jugador();
		
		int edad = 25;
		String nombre = "Juan";
		String idioma = "ingles";
		
		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		assertEquals("Senior", jugador.tipoJugador());
		
		assertEquals(edad, jugador.getEdad());
		assertEquals(nombre.toUpperCase(), jugador.getNombreJugador());
		assertEquals(idioma, jugador.getIdioma());
	}
	
	@Test
	void testSetTipoJugador34() {
		Jugador jugador = new Jugador();
		
		int edad = 34;
		String nombre = "Juan";
		String idioma = "ingles";
		
		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		assertEquals("Senior", jugador.tipoJugador());
		
		assertEquals(edad, jugador.getEdad());
		assertEquals(nombre.toUpperCase(), jugador.getNombreJugador());
		assertEquals(idioma, jugador.getIdioma());
	}
	
	@Test
	void testSetTipoJugador35() {
		Jugador jugador = new Jugador();
		
		int edad = 35;
		String nombre = "Juan";
		String idioma = "ingles";
		
		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);
		
		assertEquals("Master", jugador.tipoJugador());
		
		assertEquals(edad, jugador.getEdad());
		assertEquals(nombre.toUpperCase(), jugador.getNombreJugador());
		assertEquals(idioma, jugador.getIdioma());
	}
	
	
	@Test
	void testSetTipoJugadorFaltaEdad() {
		Jugador jugador = new Jugador();
		
		String nombre = "Juan";
		String idioma = "ingles";
		
		jugador.setNombreJugador(nombre);
		jugador.setIdioma(idioma);
		
		assertNull(jugador.tipoJugador());

	}
	
	@Test
	void testSetTipoJugadorFaltaNombre() {
		Jugador jugador = new Jugador();
		
		int edad = 34;
		String idioma = "ingles";
		
		jugador.setEdad(edad);
		jugador.setIdioma(idioma);

		assertNull(jugador.tipoJugador());

	}
	
	@Test
	void testSetTipoJugadorFaltaIdioma() {
		Jugador jugador = new Jugador();
		
		int edad = 34;
		String nombre = "Juan";
		
		jugador.setNombreJugador(nombre);
		jugador.setEdad(edad);
		
		assertNull(jugador.tipoJugador());
	}

}
