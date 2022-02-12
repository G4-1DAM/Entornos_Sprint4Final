/**
 * Esta clase asigna a los equipos los objetos Equipo y Jugador
 * */

public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;

	/**
	 * Constructor vacio de AsignarEquipo
	 */
	public AsignarEquipo() {
		
	} 

	/**
	 * Este método setea un Equipo pasandole como parámetros el Equipo equipo.
	 * @param equipo El parámetro Equipo equipo define el nombre del equipo y su Raking 
	 * */
	public void setEquipo(Equipo equipo) {
		int rankingMin = 0;
		int rankingMax = 10;
		
		if (equipo != null 
				&& equipo.getNombreEquipo() != null 
				&& equipo.getRanking() >= rankingMin
				&& equipo.getRanking() <= rankingMax) {
			this.equipo = equipo;
		}
	}
	/**
	 * Este método setea un Jugador pasandole como parámetros el Jugador jugador
	 * @param jugador El parámetro Jugador jugador define el nombre de jugador,
	 * su idioma y edad.
	 * */
	public void setJugador(Jugador jugador) {
		int edadMin = 18;
		int edadMax = 100;

		if (jugador != null 
				&& jugador.getNombreJugador() != null
				&& jugador.getIdioma() != null
				&& jugador.getEdad() >= edadMin 
				&& jugador.getEdad() <= edadMax) {
			this.jugador = jugador;
		}

	}

	/**
	 * @return equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}
	/**
	 * @return jugador
	 */
	public Jugador getJugador() {
		return jugador;
	}

}
