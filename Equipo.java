
public class Equipo {
	private String nombreEquipo;
	private int ranking;

	public Equipo() {

	}

	public void setNombreEquipo(String nombreEquipo) {
		int contador = 0;
		String nombreEquipoMayusculas = nombreEquipo.toUpperCase();
		for (int i = 0; i < nombreEquipoMayusculas.length(); i++) {
			char letra = nombreEquipoMayusculas.charAt(i);
			if (letra >= 65 && letra <= 90) {
				
			}else {
				contador ++;
			}
		
		}
		if (nombreEquipo.length() > 3 && nombreEquipo.length() <= 20 && contador==0) {
			this.nombreEquipo = nombreEquipo;
		} else {
			this.nombreEquipo = null;
		}
	}

	public void setRanking(int ranking) {
		if (ranking >= 0 && ranking <= 10) {
			this.ranking = ranking;
		} else {
			this.ranking = -1;
		}
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public int getRanking() {
		return ranking;
	}
}
