package Modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Resultados{
	
	ArrayList<Partido> partidos = new ArrayList<>();
	private String ruta;

	public Resultados(String ruta) {
		this.ruta=ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}
	
	public ArrayList<Partido> setResultados(){
		try {
			for(String linea:Files.readAllLines(Paths.get(this.ruta))) {
				String local=linea.split(";")[0];
				String visitante=linea.split(";")[3];
				int golesLocal=Integer.valueOf(linea.split(";")[1]);
				int golesVisitante=Integer.valueOf(linea.split(";")[2]);
				Partido partido=setPartido(local,visitante,golesLocal,golesVisitante);
				this.partidos.add(partido);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.partidos;
	}
	
	public Partido setPartido(String local,String visitante,int golesLocal,int golesVisitante) {
		Equipo l=new Equipo(local);
		Equipo v=new Equipo(visitante);
		Partido partido=new Partido(l,v);
		if(golesLocal>golesVisitante) {
			partido.setResultado(Resultado.LOCAL);
		}else if(golesLocal<golesVisitante) {
			partido.setResultado(Resultado.VISITANTE);
		}
		else {
			partido.setResultado(Resultado.EMPATE);
		}
		return partido;
	}
	
	public void mostrar_Resultados() {
		ArrayList<Partido> partidos = this.getPartidos();
		for(int i=0;i<partidos.size();i++) {
			System.out.println(partidos.get(i).getLocal().getNombre()+" vs "+partidos.get(i).getVisitante().getNombre()+" Ganador: "+partidos.get(i).getResultado());
		}
	}
}
