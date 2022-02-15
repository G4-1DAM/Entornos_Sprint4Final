package gestionEquipos;
/**
 * En esta clase se asignan los parametros que tendrá cada jugador
 */
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	/**
	 * Constructor vacío
	 */
	public Jugador () {
	}
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
			if(nombre.length()>3 
					&& nombre.length() <= 20 
					&& contador == 0) {
				this.nombre = nombre.toUpperCase();
			}else {
				this.nombre = null;
@@ -45,7 +47,10 @@ public void setNombreJugador(String nombre) {
	 * @param edad Define la edad del jugador
	 */
	public void setEdad(int edad) {
		if(edad >=18 && edad <= 100) {
		int edadMinima = 18;
		int edadMaxima = 100;

		if(edad >= edadMinima && edad <= edadMaxima) {
			this.edad = edad;
		}else {
			this.edad = 0;
@@ -57,7 +62,10 @@ public void setEdad(int edad) {
	 * @param idioma Define el idioma del jugador
	 */
	public void setIdioma(String idioma) {
		if("ingles".equalsIgnoreCase(idioma) || "español".equalsIgnoreCase(idioma)|| "frances".equalsIgnoreCase(idioma)|| "aleman".equalsIgnoreCase(idioma)){
		if("ingles".equalsIgnoreCase(idioma) 
				|| "español".equalsIgnoreCase(idioma) 
				|| "frances".equalsIgnoreCase(idioma)
				|| "aleman".equalsIgnoreCase(idioma)){
			this.idioma = idioma;
		}else {
			this.idioma = null;
@@ -72,16 +80,23 @@ public void setIdioma(String idioma) {
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
		int edadMinimaMunior = 18;
		int edadMaximaJunior = 25;
		int edadMinimaSenior = 25;
		int edadMaximaSeniro = 35;
		int edadMinimaMaster = 35;
		int edadMaximaMaster = 99;
		int edadSuperMaster = 100;

		if(idioma != null && nombre != null) {
			if (edad >= edadMinimaMunior && edad < edadMaximaJunior) {
				tipoJugador = "Junior";
			}else if (edad >= edadMinimaSenior && edad < edadMaximaSeniro) {
				tipoJugador = "Senior";
			}else if (edad >= edadMinimaMaster && edad < edadMaximaMaster) {
				tipoJugador = "Master";
			}else if (edad >= edadSuperMaster) {
				tipoJugador = "Super Master";
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
