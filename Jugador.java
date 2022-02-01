public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}
	
	public void setNombreJugador(String nombre) {
		//code here
	}
	
	public void setEdad(int edad) {
		if (edad>=18 && edad<=100) {
			this.edad=edad;
		}else {
			if (edad<18 && edad>=100) {
				this.edad=0;
			}
		}
		
	}
	public void setIdioma(String idioma) {
		//code here
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
