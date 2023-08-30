package br.com.projetoGeometria.modelo;

public abstract class Poligono {   

	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calculaArea() {
		return 0;
	}
	
}
