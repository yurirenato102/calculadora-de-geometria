package br.com.projetoGeometria.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.projetoGeometria.modelo.Consulta;
import br.com.projetoGeometria.modelo.Hexagono;
import br.com.projetoGeometria.modelo.Poligono;
import br.com.projetoGeometria.modelo.Quadrado;
import br.com.projetoGeometria.modelo.Triangulo;

public class TesteObjetos {

	public static void main(String[] args) {
		
	//	Triangulo triangulo = new Triangulo(3,4,10,5);
		//System.out.println(triangulo.calculaArea());
		
		//Vector<Quadrado> quadrados = new Vector<Quadrado>();
		
		/**
		List<Triangulo> triangulos = new ArrayList<Triangulo>();
		triangulos.add(triangulo);
		triangulos.add(new Triangulo(20, 10));
		
		if(triangulos.isEmpty()) {
			 System.out.println("Não há triângulos na lista");
			 throw new Exception("Não há como exibir a lista");
		} else {
			for (Triangulo objetos : triangulos) {
				System.out.println(objetos.calculaArea());
			}**/
			
			
			Quadrado quadrado1 = new Quadrado(5, 5);
			Quadrado quadrado2 = new Quadrado(15, 20);
			Quadrado quadrado3 = quadrado2;
	
			ArrayList<Quadrado> quadrados = new ArrayList<Quadrado>();
			  quadrados.add(quadrado1);
			  quadrados.add(quadrado2);
			  quadrados.add(quadrado3);
			  System.out.println(quadrados.size());
			  
			 Consulta consulta = new Consulta();
			 
			 consulta.filtraListaDeQuadradoPorPerimetro(quadrados);
			
			//for (Quadrado objetosLista : quadrados) {
				
				//System.out.println("O perímetro do quadrado: " + objetosLista.calculaPerimetro());
				//System.out.println("A área do quadrado: " + objetosLista.calculaArea());
			//	System.out.println(objetosLista.calculaPerimetroQuadrado(quadrado2.getBase(),quadrado2.getAltura()));
			//	System.out.println(objetosLista.calculaPerimetroQuadrado(quadrado3.getBase(),quadrado3.getAltura()));
			//	if (quadrados.isEmpty()) {					
			//		throw new RuntimeException("A lista de quadrados está vazia");					
			//	}
			}	
		}

