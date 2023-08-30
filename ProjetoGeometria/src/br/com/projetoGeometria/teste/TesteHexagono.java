package br.com.projetoGeometria.teste;

import br.com.projetoGeometria.modelo.Hexagono;
import br.com.projetoGeometria.modelo.Poligono;

public class TesteHexagono {

	public static void main(String[] args) {
		
		Hexagono hexagono  = new Hexagono(6);
	    Hexagono hexagono2 = new Hexagono(4);
		double area = hexagono.calculaArea();
		double area2 = hexagono2.calculaArea();
		// int [] numeros = new int [] {4,6,8,10,34};
		
		System.out.println(area);
		
	}
}
