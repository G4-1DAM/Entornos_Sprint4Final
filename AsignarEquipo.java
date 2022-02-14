package gestionEquipos;
/**
 * Esta clase asigna a los equipos los objetos Equipo y Jugador
 * */

public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;

	public AsignarEquipo() {

	} 

	/**
	 * Este método setea un Equipo pasandole como parámetros el Equipo equipo.
	 * @param equipo El parámetro Equipo equipo define el nombre del equipo entre 4 y 20
	 *  caracteres y un Raking entre 0 y 10.
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
	 * @param jugador El parámetro Jugador jugador define un nombre de jugador entre 
	 * 4 y 20 caracteres,un idioma valido y una edad entre 18 y 100.
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
	 * @return equipo Devuelve un objeto Equipo con un nombre entre 4 y 20 caracteres no numericos
	 * y un ranking entre 0 y 10.
	 */
	public Equipo getEquipo() {
		return equipo;
	}
	/**
	 * @return jugador Devuelve un objeto Jugador con un nombre entre 4 y 20 caracteres no numericos,
	 * un idioma valido y una edad entre 18 y 100.
	 */
	public Jugador getJugador() {
		return jugador;
	}

}
