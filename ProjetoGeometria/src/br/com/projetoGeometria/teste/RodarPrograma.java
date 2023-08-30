package br.com.projetoGeometria.teste;

import java.util.Scanner;

import br.com.projetoGeometria.action.MetodoIniciadorDaCalculadora;
import br.com.projetoGeometria.action.RetomarProgramaDoInicio;
import br.com.projetoGeometria.modelo.Hexagono;
import br.com.projetoGeometria.modelo.Quadrado;
import br.com.projetoGeometria.modelo.Triangulo;

public class RodarPrograma {
	
	/**
	 * 
	 * 
	 * Basta iniciar  essa classe!
	 * Botão direito->Run As -> Java Application
	 * 
	 *
	 * @Yuri.Renato
	 */

	public static void main(String[] args) {
		
		// Pede o Nome do usuário
		Scanner teste = new Scanner(System.in);
		System.out.println("Olá, preencha o seu nome");
		String testeString = teste.nextLine();
		System.out.println("Obrigado, " + testeString + "! Agora vamos começar!");
		//chama o método que inicia a interação com a montagem da calculadora 
		MetodoIniciadorDaCalculadora iniciador = 
		new MetodoIniciadorDaCalculadora();
		iniciador.declaraFiguras();
		
		//Lê a partir de uma String
       // Scanner sc2 = new Scanner(texto);
	}
}		
	
