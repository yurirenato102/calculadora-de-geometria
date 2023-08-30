package br.com.projetoGeometria.modelo;

import java.util.ArrayList;
import java.util.List;

public class Quadrado extends Poligono implements CalculadorDeArea,CalculadorDePerimetro {
	
	public  ArrayList<Quadrado> quadrados ;
	
	public Quadrado(double base, double altura) throws RuntimeException {
		setBase(base);
		setAltura(altura);
	}
	
	

	@Override
	public double calculaArea() {
		double resultado = super.getBase() * super.getAltura();
		return  resultado;
	}

	@Override
	public double calculaPerimetro() {
		//double resultado = (base*2) + (altura*2);
		return (super.getBase() * 2) + (super.getAltura() * 2);
	}
	
	public void filtraListaDeQuadradoPorPerimetro(List<Quadrado> quadrados) {
	    quadrados.forEach(q -> System.out.println(q.calculaPerimetro()));
		}
}

	

