
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {

	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo.length()>3 && nombreEquipo.length()<=20) {
			this.nombreEquipo=nombreEquipo;

			for(int i = 0 ; i <nombreEquipo.length() ; i++) {

				if (!(nombreEquipo.toLowerCase().charAt(i)>='a' && nombreEquipo.toLowerCase().charAt(i)<='z')){
					this.nombreEquipo=null;
				}
			}
		}
	}
}
	public void setRanking(int ranking) {
		//code here

	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
