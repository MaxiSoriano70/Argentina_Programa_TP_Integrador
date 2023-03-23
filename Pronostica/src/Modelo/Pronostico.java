package Modelo;

public class Pronostico extends Partido{
	
	private boolean[] pronostico=new boolean[3];

	public Pronostico(Equipo local, Equipo visitante,boolean[] pronostico) {
		super(local, visitante);
		// TODO Auto-generated constructor stub
		this.pronostico=pronostico;
	}

	public boolean[] getPronostico() {
		return pronostico;
	}

	public void setPronostico(boolean[] pronostico) {
		this.pronostico = pronostico;
	}
	
	public void resultado() {
		if(this.pronostico[0]==true) {
			super.setResultado(Resultado.LOCAL);
		}
		else if(this.pronostico[1]==true) {
			super.setResultado(Resultado.EMPATE);
		}
		else if(this.pronostico[2]==true) {
			super.setResultado(Resultado.VISITANTE);
		}
	}

}
