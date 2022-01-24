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
		String nombreEquipo = "GDAM";
		
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
		@Test
		public void testSetRankingVacio() {
			Equipo equipo = new Equipo();
			int ranking="";
			equipo.setRanking(ranking);
			assertEquals(null, equipo.getRanking());
		}

		//Ranking en 0        

		@Test
		public void testSetRankingCero() {
			Equipo equipo = new Equipo();
			int ranking=0;
			equipo.setRanking(ranking);
			assertEquals(ranking, equipo.getRanking());
		}
		
		//Ranking mayor de 10
		
		@Test
		public void testSetRankingMayorDiez() {
			Equipo equipo = new Equipo();
			int ranking>10;
			equipo.setRanking(ranking);
			assertEquals(ranking, equipo.getRanking());
		}
		
		//Ranking mayor a 0
		
		@Test
		public void testSetRankingMayorCero() {
			Equipo equipo = new Equipo();
			int ranking>0;
			equipo.setRanking(ranking);
			assertEquals(ranking, equipo.getRanking());
		}
		
		 //Ranking menor a 10
		 
		@Test
		public void testSetRankingMenorDiez() {
			Equipo equipo = new Equipo();
			int ranking<9;
			equipo.setRanking(ranking);
			assertEquals(ranking, equipo.getRanking());
		}
		
		//Ranking igual a 10
		
		@Test
		public void testSetRankingIgualDiez() {
			Equipo equipo = new Equipo();
			int ranking=10;
			equipo.setRanking(ranking);
			assertEquals(ranking, equipo.getRanking());
		}
		
		//Ranking mayor a 10
		
		@Test
		public void testSetRankingMayorDiez() {
			Equipo equipo = new Equipo();
			int ranking>10;
			equipo.setRanking(ranking);
			assertEquals(null, equipo.getRanking());
		}
	}
	


