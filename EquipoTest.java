import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		String nombreEquipo = "gdam";
		String nombreMayusculas = "GDAM";


		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreMayusculas, equipo.getNombreEquipo());	}

	/**
	 * Set nombre de equipo valido con caracteres maximos '20'
	 */
	@Test
	void testSetNombreEquipoCaracterMax() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "DesarrolloAplicacion";
		String nombreMayusculas = "DESARROLLOAPLICACION";

		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreMayusculas, equipo.getNombreEquipo());	
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
	 * @author Daniel
	 */

	// Ranking vacio
	@Test
	public void testSetRankingVacio() {
		Equipo equipo = new Equipo();
		int ranking = -1;
		
		equipo.setRanking(ranking);
		assertEquals(-1, equipo.getRanking());
	}

	// Ranking en 0
	@Test
	public void testSetRankingCero() {
		Equipo equipo = new Equipo();
		int ranking = 0;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}

	// Ranking en 10
	@Test
	public void testSetRankingMayorCero() {
		Equipo equipo = new Equipo();
		int ranking = 10;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}

	// Ranking mayor a 10
	@Test
	public void testSetRankingMayorDiez() {
		Equipo equipo = new Equipo();
		int ranking = 11;
		
		equipo.setRanking(ranking);
		assertEquals(-1, equipo.getRanking());
	}

	// Ranking menor a 10
	@Test
	public void testSetRankingMenorDiez() {
		Equipo equipo = new Equipo();
		int ranking = 9;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	 
	/**
         * @author RobertoGarciaSanchez
         *
         */
        
        //ranking igual a 7 devuelve categoria primera
        @Test
    	void categoriaEquipoPrimeraMin() {    
            Equipo equipo= new Equipo();
        	String nombreEquipo ="GDAM";
        	int ranking = 7;
        	
    		equipo.setNombreEquipo(nombreEquipo);
    		equipo.setRanking(ranking);
    		
    		assertEquals("Primera",equipo.categoriaEquipo());
    	}
        
        //ranking igual a 10 devuelve categoria primera
        @Test
    	void categoriaEquipoPrimeraMax() {    
            Equipo equipo= new Equipo();
        	String nombreEquipo ="GDAM";
        	int ranking = 10;
        	
    		equipo.setNombreEquipo(nombreEquipo);
    		equipo.setRanking(ranking);
    		
    		assertEquals("Primera",equipo.categoriaEquipo());
    	}
        
        //ranking igual a 3 devuelve categoria segunda
        @Test
    	void categoriaEquipoSegundaMin() {    
            Equipo equipo= new Equipo();
        	String nombreEquipo ="GDAM";
        	int ranking = 3;
        	
    		equipo.setNombreEquipo(nombreEquipo);
    		equipo.setRanking(ranking);
    		
    		assertEquals("Segunda",equipo.categoriaEquipo());
    	}
        
        //ranking igual a 6 devuelve categoria segunda
        @Test
    	void categoriaEquipoSegundaMax() {    
            Equipo equipo= new Equipo();
        	String nombreEquipo ="GDAM";
        	int ranking = 6;
        	
    		equipo.setNombreEquipo(nombreEquipo);
    		equipo.setRanking(ranking);
    		
    		assertEquals("Segunda",equipo.categoriaEquipo());
    	}
        
        //ranking menor de 3 devuelve categoria tercera
        @Test
    	void categoriaEquipoTercera() {    
            Equipo equipo= new Equipo();
        	String nombreEquipo ="GDAM";
        	int ranking = 2;
        	
    		equipo.setNombreEquipo(nombreEquipo);
    		equipo.setRanking(ranking);
    		
    		assertEquals("Tercera",equipo.categoriaEquipo());
    	}
        
        //Campos nombre vacio. No devuelve categoria.
        @Test
    	void categoriaEquipoCampoNombreVacio() {
        	Equipo equipo= new Equipo();
        	int ranking= 7;
        	String categoria= "";
    		
        	equipo.setRanking(ranking);
    		 
    		assertEquals("",equipo.categoriaEquipo());
        }
        
      //Campos ranking vacio. No devuelve categoria.
        @Test
    	void categoriaEquipoCampoRankingVacio() {
        	Equipo equipo= new Equipo();
        	String nombreEquipo ="GDAM";
        	String categoria= "";
        	
        	equipo.setNombreEquipo(nombreEquipo);
    		 
    		assertEquals("",equipo.categoriaEquipo());
        }
}
