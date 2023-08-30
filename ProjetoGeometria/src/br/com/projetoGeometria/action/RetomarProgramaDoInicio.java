package br.com.projetoGeometria.action;

import java.util.Scanner;

import br.com.projetoGeometria.teste.RodarPrograma;

public class RetomarProgramaDoInicio extends MetodoIniciadorDaCalculadora {

	public void perguntaSeQuerRepetirACalculadora() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gostaria de utilizar a calculadora novamente? Se sim, digite S! Se não, digite N ");
		String condicao = sc.nextLine();
		  if(condicao.equals("S")) {
			  voltarInicioPrograma();
		  }
		  System.out.println("Obrigado por utilizar o programa;");
		  sc.close();
	}
	
	public void voltarInicioPrograma() {
		declaraFiguras();
	}
	
}
