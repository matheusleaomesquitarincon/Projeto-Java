package entidade;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AtividadeFinal1 {
	public static void Menu() {
		  System.out.println("+ Menu de opções de tipo de estrutura +\n");
		  System.out.println("           |Sequencial  = 0| \n           |Condicional = 1| \n           |Repetição   = 2|\n");
		  System.out.println("Escolha o tipo de exercício desejado: ");
	}
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       
		int sequencial = 0, condicional = 0, repeticao = 0, tipoexercicio;
		int ex;
		char repetir;
		 
		List<Integer> exerciciosSequencial = new ArrayList<>();
		List<Integer> exerciciosCondicional = new ArrayList<>();
		List<Integer> exerciciosRepeticao = new ArrayList<>();
			
		System.out.println("Iniciar programa?(Sim=S ou Não=N):");
	    repetir = sc.next().charAt(0); 
		
		while (repetir == 'S') {
			
			  Menu();
			  tipoexercicio = sc.nextInt();	
			  
			  while (tipoexercicio < 0 || tipoexercicio > 2){	
                    System.out.println("Erro!");			  
	 		        System.out.println("Escolha apenas 0, 1 ou 2: ");
			        tipoexercicio = sc.nextInt();			  
		      }
			  
 		      if (tipoexercicio == 0) {
 			      System.out.println("+ Menu de exercícios sequencial +");
			      System.out.println("    - Ex:22  Ex:32  Ex:39 - \n ");
			      System.out.print("Escolha qual número do exercício desejado  \nEx:");
 			      ex = sc.nextInt();
 				  
				  while (ex != 22 && ex != 32 && ex != 39){
				        System.out.println("Erro!");	
                        System.out.println("Escolha apenas 22, 32 ou 39: ");			  
					    ex = sc.nextInt(); 
 				  }
			      sequencial++;
				  exerciciosSequencial.add(ex);


			      if (ex == 22) {
  			  	      System.out.println("Exercício 22 (ler dados e calcular IMC) = \n");
			          System.out.println("-INÍCIO-\n");
			          
			          double imc, peso, altura;
			          
			          System.out.println("Seu peso:");
			          peso = sc.nextDouble();
			          System.out.println("Sua altura:");
			          altura = sc.nextDouble();
			          
			          imc = peso / (altura * altura);
			          
			          System.out.printf("IMC = %.2f%n" , imc);
 	
			     }
			     else if (ex == 32) {
  			  	          System.out.println("Exercício 32 (ler data em formato 'ddmmaaaa' e imprimir em formato 'mmddaaaa') = \n");
				          System.out.println("-INÍCIO-\n");
				          
				          int dia, mes, ano;
				          
				          System.out.println("Dia do seu nascimento(2 dígitos): ");
				          dia = sc.nextInt();
				          System.out.println("Mês do seu nascimento(2 dígitos): ");
				          mes = sc.nextInt();
				          System.out.println("Ano do seu nascimento(4 dígitos): ");
				          ano = sc.nextInt();
				          
				          System.out.println("Formato ddmmaaaa = " + dia+"/"+mes+"/"+ano);
				          System.out.println("Formato mmddaaa = " + mes+"/"+dia+"/"+ano);
				          			          
			     }
			     else {
  			          System.out.println("Exercício 39 (ler raio e calcular: área e comprimento de um círculo) = \n");
			          System.out.println("-INÍCIO-\n");
			          
			          double area, comprimento, raio;
			          
			          System.out.println("Informe o raio: ");
			          raio = sc.nextDouble();
			          
			          area = 3.14 * (raio * raio);
			          comprimento = 2 * 3.14 * raio;
 			          
			          System.out.println("Área = " + area);
			          System.out.println("Comprimento = " + comprimento);
 			          
			     }
				 
		      }
 		      else if (tipoexercicio == 1) {
 			          System.out.println("+ Menu de exercícios condicional +");
			          System.out.println("     - Ex:1  Ex:3  Ex:6 - \n ");
		  	          System.out.print("Escolha qual número de exercício desejado  \nEx:");
			          ex = sc.nextInt();
					  
					  while (ex != 1 && ex != 3 && ex != 6){
				             System.out.println("Erro!");	
                             System.out.println("Escolha apenas 1, 3 ou 6: ");			  
					         ex = sc.nextInt(); 
 				      }
			          condicional++;
				      exerciciosCondicional.add(ex);
 			      
			          if (ex == 1) {
 				          System.out.println("Exercício 1 (ler 3 números inteiros e mostrar o maior deles) = \n");
				          System.out.println("-INÍCIO-\n");
						  
						  int n1, n2, n3;
		                  int maior = 0, menor = 0;
		
		                  System.out.println("Informe um número: ");
		                  n1 = sc.nextInt();
		                  System.out.println("Informe outro número: ");
		                  n2 = sc.nextInt();
	                      System.out.println("Informe outro número: ");
		                  n3 = sc.nextInt();
		
	                      if (n1 > n2 && n1 > n3) {
		                      maior = n1;
		                  }
	                      else if (n2 > n1 && n2 > n3) {
			                       maior = n2;
		                  }
		                  else {
		                        maior = n3;
		                  }	
		                  System.out.println("Maior: " + maior);
					  
			          }
			          else if (ex == 3) {
 				               System.out.println("Exercício 3 (ler valores para a,b e c e imprimir se é triângulo e o tipo) = \n");
					           System.out.println("-INÍCIO-\n");
							   
							   int a, b, c;
		                       String tipoTriangulo = "";
		                       String triangulo = "";
		    
		                       System.out.println("Informe o valor de a: ");
		                       a = sc.nextInt();
		                       System.out.println("Informe o valor de b: ");
		                       b = sc.nextInt();
		                       System.out.println("Informe o valor de c: ");
		                       c = sc.nextInt();
		 
		                       if (a > b + c && b > a + c && c > a + b) {
		                           System.out.println("Triângulo.");
		                       }
		 
		                       else if (a == b && b == c) {
		                     	        System.out.println("Tipo = equilátero");
		                       }
		                       else if (a == b && a != c) {
		                    	        System.out.println("Tipo = isósceles");
		                       }
		                       else if (a != b && a != c && b != c) {
		                                System.out.println("Tipo = escaleno");
	                           }
		                       else {
			                        System.out.println("Não é triângulo.");
		                       }
								   
			          }
			          else {
 			               System.out.println("Exercício 6 (ler um número e imprimir se é um quadrado perfeito ou nãO) = \n");
				           System.out.println("-INÍCIO-\n");
						   
						   int n;
	                       double raiz;
	    
	                       System.out.println("Informe um número desejado: ");
	                       n = sc.nextInt();
	    
	                       Math.sqrt(n);
	                       raiz = Math.sqrt(n);
 	    
	   
 	                       if (n % raiz == n * (1/3)) {
	    	                   System.out.println("Quadrado perfeito.");
	                       }
	                       else {
	    	                    System.out.println("Não é um quadrado perfeito."); 
	                       }
	                       	   
			          }
		      }
 		      else {
 			       System.out.println("+ Menu de exercícios repetição +");
			       System.out.println("    - Ex:19  Ex:32  Ex:33  - \n ");
			       System.out.print("Escolha qual número de exercício desejado  \nEx:");
			       ex = sc.nextInt();
			       		   
				   while (ex != 19 && ex != 32 && ex != 33){
				         System.out.println("Erro!");	
                         System.out.println("Escolha apenas 19, 32 ou 33: ");			  
					     ex = sc.nextInt(); 
 				   }
			       repeticao++;
				   exerciciosRepeticao.add(ex);

			       if (ex == 19) {
 			           System.out.println("Exercício 19 (ler números inteiros, fazer a média e imprimir os multiplos de 8) = \n");
			           System.out.println("-INÍCIO-\n");
			           
			           double media;	
			   	       int contador = 0;
			   	       int totalMoito = 0;
			           int soma = 0;		
			   	       int n;
			   		
			   	       System.out.println("Informe números inteiros ou -1 para sair: ");
			   	       n = sc.nextInt();
			   	
			   	       while (n > -1) {
			   		         contador++;
			   		         soma += n;
			   		         System.out.println("Número lido = " + n); 
			   		
			   		         if (n % 8 == 0) {
			   			         totalMoito++;
			     		     }
			   		         System.out.println("Informe números inteiros ou -1 para sair: ");
			   		         n = sc.nextInt();
			     	   }
			           media = (double) soma / contador;
			   	       System.out.println("Total múltiplos de 8 = " + totalMoito);	
			   	       System.out.println("Media = " + media);
			   	       
			       }
			       else if (ex == 32) {
 				            System.out.println("Exercício 32 (ler números e imprimir divisores) = \n");
				            System.out.println("-INÍCIO-\n");
				            int n;
				       	    System.out.println("Informe um número aleatório ou 0 para terminar: ");
				      	    n = sc.nextInt();
				      	  
				      	    while (n > 0) {
				      		  
				      	         for (int i = 1; i <= n; i++) {
				      		      if (n % i == 0) {
				      			      System.out.println(i);
				      		      }
				      		   
				      	         }
				      	         System.out.println("Informe outro número aleatório ou 0 para terminar: ");
				      	         n = sc.nextInt();
				       	    }  
				      	  
			        }
			        else {
 			            System.out.println("Exercício 33 (soma de uma sequência de inteiros) = \n");
			            System.out.println("-INÍCIO-\n");
			            
			            int n;
			            System.out.print("Informe a quantidade: ");
			            n = sc.nextInt();
			            
			            int soma = 0;
			            for (int i = 0; i < n; i++) {
			                 System.out.print("Digite um valor: ");
			    			 int valor;
			                 valor = sc.nextInt();
			                 soma += valor;
			            }
			            System.out.println("Soma: " + soma);

			        }

		       }
 		       System.out.println("\nRepetir programa? (Sim=S ou Não=N):");
		       repetir = sc.next().charAt(0);
		
		 }
		 System.out.println("Quantidade de exercícios de sequencial = " + sequencial);
		 System.out.println("Exercícios escolhidos = " + exerciciosSequencial);
		 System.out.println("Quantidade de exercícios de condicional = " + condicional);
		 System.out.println("Exercícios escolhidos = " + exerciciosCondicional);
		 System.out.println("Quantidade de exercícios de repetição = " + repeticao);
		 System.out.println("Exercícios escolhidos = " + exerciciosRepeticao);

		



}

}	

	
