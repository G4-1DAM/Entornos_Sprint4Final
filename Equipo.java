
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {

	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		//code here
	}
	public void setRanking(int ranking) {
		// Ranking vacío
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
	
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
