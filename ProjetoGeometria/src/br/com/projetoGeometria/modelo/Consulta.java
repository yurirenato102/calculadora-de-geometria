package br.com.projetoGeometria.modelo;

import java.util.List;

public class Consulta {
	
	//Classe em construção

	public void filtraListaDeQuadradoPorPerimetro(List<Quadrado> quadrados) {
	    quadrados.forEach(q -> 
	    System.out.println(q.calculaPerimetro()));
		}
}
