package br.com.projetoGeometria.action;

import java.util.Scanner;

import br.com.projetoGeometria.modelo.Hexagono;
import br.com.projetoGeometria.modelo.Quadrado;
import br.com.projetoGeometria.modelo.Triangulo;

public class MetodoIniciadorDaCalculadora {

	public  void declaraFiguras() {
		//Abre as opções para o usuário escolher  a figura desejada
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor," +  "escolha o número de uma das figuras que deseje  montar: 1 - Quadrado, "
				+ "2 - Triângulo ou 3 - Hexágono regular");
		int numeroSelecionado = sc.nextInt();
		//Condição , caso seja escolhido o quadrado
		if(numeroSelecionado == 1) {
			System.out.println("Por favor, digite o lado do quadrado");
			double lado = sc.nextDouble();
			//Declara o objeto quadrado, a partir do lado informado.
			Quadrado quadrado = new Quadrado(lado,lado);
			//Pergunta ao usuário se ele gostaria de calcular a área e o perímetro do quadrado
			System.out.println("Gostaria de saber qual a área e o perímetro do quadrado ? Se sim, escreva S. Se não, escreva N");
			sc.nextLine();
			String condicao = sc.nextLine();
			     if (condicao.equals("S")) {
			    	 //Retorna área e perímetro do quadrado
			        System.out.println("Área: " + quadrado.calculaArea());
			        System.out.println("Perímetro: " + quadrado.calculaPerimetro());
			        } else {
			        	//Encerra o programa 
			    	  System.out.println("Obrigado por utilizar o programa até aqui!");
			    	  sc.close();
			         }
             }
		      
		else if (numeroSelecionado == 2) {
		  System.out.println("Por favor, digite o valor  da base do triângulo!");
		  double base = sc.nextDouble();
		  System.out.println("Por favor , digite a altura do triângulo!");
		  double altura= sc.nextDouble();
		  System.out.println("Vamos lá! Digite o valor do primeiro lado do triângulo!");
		  double lado1 = sc.nextDouble();
		  System.out.println("Vamos lá! Digite o valor do segundo lado do triângulo!");
		  double lado2 = sc.nextDouble();
		  Triangulo triangulo = new Triangulo(lado1,lado2,base,altura);
		  //Pergunta ao usuário se ele gostaria de calcular a área e o perímetro do triângulo
		  System.out.println("Vamos ver se é um triângulo válido..");
		  triangulo.condicaoExistencia();
		  System.out.println("Gostaria de saber qual a área e o perímetro do triângulo ? Se sim, escreva S. Se não, escreva N");
		  sc.nextLine();
		  String condicao = sc.nextLine();
		     if (condicao.equals("S")) {
		    	 //Retorna área e perímetro do triângulo
		        System.out.println("Área: " + triangulo.calculaArea());
		        System.out.println("Perímetro: " + triangulo.calculaPerimetro());
		          } else {
		        	//Encerra o programa 
		    	     System.out.println("Obrigado por utilizar o programa até aqui!");
		    	     sc.close();
		          }
	          }
        
		else if (numeroSelecionado == 3) {
			  System.out.println("Por favor, digite o valor  do lado do hexágono!");
			  double lado = sc.nextDouble();
			  Hexagono hexagono = new Hexagono(lado);
			  //Pergunta ao usuário se ele gostaria de calcular a área e o perímetro do hexágono
			  System.out.println("Gostaria de saber qual a área e o perímetro do hexágono ? Se sim, escreva S. Se não, escreva N");
			  sc.nextLine();
			  String condicao = sc.nextLine();
			     if (condicao.equals("S")) {
			    	 //Retorna área e perímetro do hexágono
			        System.out.println("Área: " + hexagono.calculaArea());
			        System.out.println("Perímetro: " + hexagono.calculaPerimetro());
			          } else {
			        	//Encerra o programa 
			    	     System.out.println("Obrigado por utilizar o programa até aqui!");
			    	     sc.close();
			          }
		          }
        //Volta para a chamada inicial do método.
           RetomarProgramaDoInicio retorno = new RetomarProgramaDoInicio();
           retorno.perguntaSeQuerRepetirACalculadora();
	       }
	
}
