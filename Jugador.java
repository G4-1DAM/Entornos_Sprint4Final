


public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}
	
	
	public void setNombreJugador(String nombre) {
		
		if(nombre!= null) {
																	//si el nnombre no contiene solo letras lo pone null
			if(nombre.length()>20||nombre.length()<4||!nombre.matches("[a-zA-Z\\t\\h]+|(^$)")) {
				this.nombre=null;
				
			}else {
				
					this.nombre=nombre.toUpperCase();
				
			    
			}
			
		}
		
		
		}
		
		
	public void setEdad(int edad) {
		if (edad>=18 && edad<=100) {
			this.edad=edad;
		}else {
			if (edad<18 && edad>100 ) {
				this.edad=0;
			}
			
		}
		
	}
	
	public void setIdioma(String idioma) {
		
			if(idioma!=null) {
				if (!idioma.equals("español") ) {
					this.idioma=null;
			}else {
				this.idioma=idioma;
			}
				
				
			}
			
			

		
		
		
		
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
	
	//Stoty 5 Carlos Soler
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
}
