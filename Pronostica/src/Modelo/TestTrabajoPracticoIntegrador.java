package Modelo;

import java.util.ArrayList;

public class TestTrabajoPracticoIntegrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resultados resultado=new Resultados("src\\Archivos\\resultados.txt");
		ArrayList<Partido> resultadosDeLaFecha=resultado.setResultados();
		System.out.println("Resultados de la Fecha");
		resultado.mostrar_Resultados();
		
		
		System.out.println("----------------------------------------");
		
		Usuario user1=new Usuario(1,"Celeste Severich","41578642");
		ArrayList<Partido> pronosticoDeUser1=user1.setPartidos("src\\Archivos\\pronosticos.txt");
		System.out.println("Pronostico de "+user1.getNombreCompleto());
		user1.mostrar_Pronosticos();
		System.out.println("----------------------------------------");
		
		int contador=0;
		for (int i = 0; i < resultadosDeLaFecha.size(); i++) {
			if(resultadosDeLaFecha.get(i).getResultado()==pronosticoDeUser1.get(i).getResultado()) {
				contador+=1;
			}
		}
		System.out.println("----------------------------------------");
		System.out.println(user1.getNombreCompleto()+" su puntaje en esta fecha fue de "+contador);
		
		
	}

}
