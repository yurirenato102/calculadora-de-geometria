package br.com.projetoGeometria.modelo;

import java.rmi.RemoteException;
import java.security.spec.RSAOtherPrimeInfo;

import javax.swing.Action;

public class Triangulo  extends Poligono implements CalculadorDeArea,CalculadorDePerimetro  {

	private double lado1;
	private double lado2;
	
	public String IMEI;
	
	public Triangulo(double lado1, double lado2,double base, double altura) throws RuntimeException{
		this.lado1=lado1;
		this.lado2=lado2;
		super.setBase(base);
		super.setAltura(altura);
    }
	
	@Override
	public double calculaArea()  {
		double resultado = (super.getBase() * super.getAltura()) / 2;
		condicaoExistencia();
		return resultado;
	}
	
	//Condição de existência para os triângulos
   	public boolean existe=true;
   	
   	public boolean condicaoExistencia() throws RuntimeException {
		double soma  = lado1 + super.getBase();
		double soma2 = lado2 + super.getBase();
		double soma3 = lado1 + lado2;
		//Lógica usada para lançar a exceção, caso haja a desigualdade triangular
		    if(soma<=lado2 || soma2<=lado1 || soma3<=super.getBase()) {
			  throw new RuntimeException("O triângulo não atende à condição de existência. Soma entre os lados está menor que o lado restante!");	  
			 } else {
				 System.out.println("O triângulo é válido!");
				 return existe;
			 }
	}

	@Override
	public double calculaPerimetro() {
		condicaoExistencia();
		return  this.lado1 + this.lado2 + super.getBase();
	}
	
	@Override
	public int hashCode() {
		return IMEI.hashCode();
	}
	
}

