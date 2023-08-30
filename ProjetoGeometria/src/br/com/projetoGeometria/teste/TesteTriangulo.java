package br.com.projetoGeometria.teste;

import br.com.projetoGeometria.modelo.Poligono;
import java.lang.Object;
import br.com.projetoGeometria.modelo.Triangulo;

public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(6,8,10,5);
		System.out.println(triangulo.calculaArea());
		System.out.println(triangulo.calculaPerimetro());
		

	}
}
