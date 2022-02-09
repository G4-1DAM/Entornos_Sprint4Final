public class Equipo {
	private String nombreEquipo;
	private int ranking=-1;

	public Equipo() {

	}

	public void setNombreEquipo(String nombreEquipo) {
		int contador = 0;
		if(nombreEquipo != null) {
			String nombreEquipoMayusculas = nombreEquipo.toUpperCase();
			for (int i = 0; i < nombreEquipoMayusculas.length(); i++) {
				char letra = nombreEquipoMayusculas.charAt(i);
				if (letra >= 65 && letra <= 90) {

				} else {
					contador++;
				}

			}
		}
		if(nombreEquipo != null) {
			if (nombreEquipo.length() > 3 && nombreEquipo.length() <= 20 && contador == 0) {

				this.nombreEquipo = nombreEquipo.toUpperCase();
			} else {
				this.nombreEquipo = null;
			}
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

	public String categoriaEquipo() {
		String categoria = "";

		if (ranking != -1 && nombreEquipo != null) {

			if (ranking >= 7 && ranking <= 10) {
				categoria = "Primera";
			}

			else if (ranking >= 3 && ranking <= 6) {
				categoria = "Segunda";
			}

			else if (ranking < 3) {
				categoria = "Tercera";
			}
		}
		return categoria;
	}
}
