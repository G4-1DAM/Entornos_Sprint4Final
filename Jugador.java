public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}
	
	public void setNombreJugador(String nombre) {
		int contador = 0;
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
	
	public void setEdad(int edad) {
		if(edad >=18 && edad <= 100) {
			this.edad = edad;
		}else {
			this.edad = 0;
		}
	}
	public void setIdioma(String idioma) {
		if(idioma == "ingles" || idioma == "español"|| idioma == "frances"|| idioma == "aleman") {
			this.idioma = idioma;
		}else {
			this.idioma = null;
		}
	}
	public String tipoJugador(){

		String tipoJugador = "";

		if (edad>= 18 && edad<25) {
		tipoJugador="Junior";
		}else if (edad>= 25 && edad<35) {
		tipoJugador="Senior";
		}else if (edad>=35 && edad<99) {
		tipoJugador="Master";
		}else if (edad>=100) {
		tipoJugador="Super Master";
		}

		return tipoJugador;
		}
	
	

	public String getIdioma() {
		return idioma;
	}
	
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
