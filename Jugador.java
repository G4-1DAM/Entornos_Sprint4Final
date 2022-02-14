package gestionEquipos;
/**
 * En esta clase se asignan los parametros que tendrá cada jugador
 */
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	/**
	 * Este metodo convierte a mayúsculas la cadena insertada por el usuario
	 * Además hace sus comprobaciones correspondientes como por ejemplo medir
	 * que la cadena tiene la longitud detallada en las especificaiones.
	 * @param nombre Define el nombre del Jugador
	 */
	public void setNombreJugador(String nombre) {
		int contador = 0;
		if (nombre != null) {
			String nombreMayusculas = nombre.toUpperCase();
			for (int i = 0; i < nombreMayusculas.length(); i++) {
				char letra = nombreMayusculas.charAt(i);
				if (letra >= 65 && letra <= 90) {

				}else {
					contador ++;
				}

			}
			if(nombre.length()>3 && nombre.length()<=20 && contador == 0) {
				this.nombre = nombre.toUpperCase();
			}else {
				this.nombre = null;
			}
		}
	}

	/**
	 * Comprueba que la edad esté en los margenes deseados y se la aplica.
	 * @param edad Define la edad del jugador
	 */
	public void setEdad(int edad) {
		if(edad >=18 && edad <= 100) {
			this.edad = edad;
		}else {
			this.edad = 0;
		}
	}

	/**
	 * Comprueba que el idioma sea uno de los cuatro disponibles
	 * @param idioma Define el idioma del jugador
	 */
	public void setIdioma(String idioma) {
		if("ingles".equalsIgnoreCase(idioma) || "español".equalsIgnoreCase(idioma)|| "frances".equalsIgnoreCase(idioma)|| "aleman".equalsIgnoreCase(idioma)){
			this.idioma = idioma;
		}else {
			this.idioma = null;
		}
	}

	/**
	 * Le asigna un Tipo de Jugador según la edad introducida.
	 * Los cuatro valores posibles son Junior, Senior, Master y Super Master.
	 * @return Retorna el tipo de jugador.
	 */
	public String tipoJugador(){

		String tipoJugador = null;

		if(idioma!=null && nombre!=null) {
			if (edad>= 18 && edad<25) {
				tipoJugador="Junior";
			}else if (edad>= 25 && edad<35) {
				tipoJugador="Senior";
			}else if (edad>=35 && edad<99) {
				tipoJugador="Master";
			}else if (edad>=100) {
				tipoJugador="Super Master";
			}
		}
		return tipoJugador;
	}

	/**
	 * @return idioma
	 */
	public String getIdioma() {
		return idioma;
	}
	/**
	 * @return nombre
	 */
	public String getNombreJugador() {
		return nombre;
	}
	/**
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}
}
