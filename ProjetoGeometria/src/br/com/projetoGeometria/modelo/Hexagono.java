package br.com.projetoGeometria.modelo;

public class Hexagono implements CalculadorDeArea,CalculadorDePerimetro {
	
	private int totalTriangulosEquilateros = 6;
	private double valorLado;
	
	// Construir um construtor setando o lado
	public Hexagono(double lado){
		this.valorLado = lado;
	}
	
	// calcula a area do triângulo equilátero . Math.sqtr representa raiz quadrada
	private double calculaAreaTrianguloEquilatero() {
		return (this.valorLado * this.valorLado * Math.sqrt(3)) /4;
	}
	
	// calcula a área do hexágono, de forma direta
	@Override
	public double calculaArea() {
	   double resultado =  calculaAreaTrianguloEquilatero() * 6;
	   return Math.round(resultado); // Math.round
	}

	
	@Override
	public double calculaPerimetro() {
		return this.valorLado * 6;
	}
	
	
	
	
}
