public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      
      
      public AsignarEquipo() {
    	  
      }
 
      public void setEquipo(Equipo equipo) {
    	   if(equipo !=null && equipo.getNombreEquipo()!=null && equipo.getRanking()>=0 && equipo.getRanking()<=100) {
  			     this.equipo= equipo;
    	   }
      }     
      
      public void setJugador(Jugador jugador) {
  		
    	  if(jugador !=null && jugador.getNombreJugador()!=null && jugador.getIdioma()!=null && jugador.getEdad()>=17 && jugador.getEdad()<=100) {
    		  this.jugador = jugador;
    	  }
   
      }
      
      public Equipo getEquipo(){
          return equipo;
      }
      
      public Jugador getJugador(){
         return jugador;
      }
      
}
