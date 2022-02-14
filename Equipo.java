package gestionEquipos;

/**
 * Esta clase asigna al equipo los objetos nombreEquipo, ranking y categoriaEquipo. 
 **/

public class Equipo {
	private String nombreEquipo;
	private int ranking=-1;
	
	/**
	 * @author Antonio García Belver
	 * 
	 * Este método setea un nombreEquipo pasandole como parámetro un String nombreEquipo.
	 * 
	 * @param nombreEquipo El parámetro String nombreEquipo define el nombre del equipo
	 * con un tamaño mínimo de 4 caracteres y máximo de 20
	 * */
	
	public void setNombreEquipo(String nombreEquipo) {
		int contador = 0;
		int aMayAscii = 65;
		int zMayAscii = 90;
		int caracterMinNombre = 4;
		int caracterMaxNombre = 20;
		
		if(nombreEquipo != null) {
			
			String nombreEquipoMayusculas = nombreEquipo.toUpperCase();
			
			for (int i = 0; i < nombreEquipoMayusculas.length(); i++) {
				char letra = nombreEquipoMayusculas.charAt(i);
				if (letra >= aMayAscii && letra <= zMayAscii) {

				} else {
					contador++;
				}

			}
		}
		if(nombreEquipo != null) {
			
			if (nombreEquipo.length() >= caracterMinNombre 
					&& nombreEquipo.length() <= caracterMaxNombre 
					&& contador == 0){
				
				this.nombreEquipo = nombreEquipo.toUpperCase();
			
			} else {
				this.nombreEquipo = null;
			}
		}
	}
	
	/**
	 * @author Daniel del Toro Boigues
	 * 
	 * Este método setea un ranking pasandole como parámetros un int ranking.
	 * 
	 * @param ranking El parámetro int ranking define el ranking con valores
	 * de 0 a 10.
	 * */
	
	public void setRanking(int ranking) {
		int rankingMin = 0;
		int rankingMax = 10;
		int rankingVacio = -1;

		if (ranking >= rankingMin && ranking <= rankingMax) {
			this.ranking = ranking;
		
		} else {
			this.ranking = rankingVacio;
		}
	}

	/**
	 * @return Devuelve nombreEquipo entre 4 y 20 caracteres, sin
	 * caracteres numericos.
	 * */
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @return Devuelve ranking con valores entre 0 y 10.
	 * */
	
	public int getRanking() {
		return ranking;
	}

	/**
	 * @author Roberto Garcia Sanchez
	 * 
	 * Este método asigna una categoria al equipo, segun el ranking de este.
	 * Las categorias posibles son Primera, entre 7 y 10; Segunda, entre
	 * 3 y 6; y Tercera, menor de 3.
	 * 
	 * @return Devuelve categoriaEquipo según el ranking que posea, pudiendo ser
	 * Categoria Primera (de 7 a 10), Segunda (de 3 a 6) o Tercera (menos de 3).
	 * */
	
	public String categoriaEquipo() {
		String categoria = "";
		int rankingMinPrim = 7;
		int rankingMaxPrim = 10;
		int rankingMinSeg = 3;
		int rankingMaxSeg = 6;
		int rankingVacio = -1;

		if (ranking != rankingVacio && nombreEquipo != null) {

			if (ranking >= rankingMinPrim && ranking <= rankingMaxPrim) {
				categoria = "Primera";
			
			} else if (ranking >= rankingMinSeg && ranking <= rankingMaxSeg) {
				categoria = "Segunda";
			
			} else if (ranking < rankingMinSeg) {
				categoria = "Tercera";
			}			
		}
		
		return categoria;
	}
}
