package atividadefinal;
import java.util.Scanner;

public class exercicios {
    static Scanner sc = new Scanner(System.in);
   
    public static void sequencial(int ex) {
        switch (ex) {
            case 22:
                System.out.println("Ex. 22 - Calcular IMC");
                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();
                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();
                double imc = peso / (altura * altura);
                System.out.printf("IMC = %.2f\n", imc);
                break;
                
            case 29:
            	 double nota1, nota2, nota3, media;
            	System.out.println("Digite a nota 1");
            	 nota1 = sc.nextDouble();
            	System.out.println("Digite a nota 2");
            	 nota2 = sc.nextDouble();
            	System.out.println("Digite a nota 3");
            	 nota3 = sc.nextDouble();
            	 media = (nota1 + nota2 + nota3) / 3;
            	 System.out.printf("A Média do Aluno é: %.2f " , media);
            	break;
                 

            case 32:
                System.out.println("Ex. 32 - Converter Data");
                System.out.print("Dia: ");
                int dia = sc.nextInt();
                System.out.print("Mês: ");
                int mes = sc.nextInt();
                System.out.print("Ano: ");
                int ano = sc.nextInt();
                System.out.println("Formato mmddaaaa: " + mes + "/" + dia + "/" + ano);
                break;

            case 39:
                System.out.println("Ex. 39 - Círculo (Área e Circunferência)");
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                System.out.printf("Área: %.2f\n", 3.14 * raio * raio);
                System.out.printf("Circunferência: %.2f\n", 2 * 3.14 * raio);
                break;

            default:
                System.out.println("Exercício inválido.");
               
        }
    }

    public static void condicional(int ex) {
        switch (ex) {
            case 1:
                System.out.println("Ex. 1 - Maior de 3 Números");
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                int maior = Math.max(a, Math.max(b, c));
                System.out.println("Maior: " + maior);
                break;

            case 3:
                System.out.println("Ex. 3 - Tipo de Triângulo");
                int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
                if (x + y > z && x + z > y && y + z > x) {
                    if (x == y && y == z) System.out.println("Equilátero");
                    else if (x == y || y == z || x == z) System.out.println("Isósceles");
                    else System.out.println("Escaleno");
                } else {
                    System.out.println("Não é triângulo");
                }
                break;

            case 6:
                System.out.println("Ex. 6 - Quadrado Perfeito");
                int n = sc.nextInt();
                double raiz = Math.sqrt(n);
                if (raiz == (int) raiz) System.out.println("É quadrado perfeito.");
                else System.out.println("Não é quadrado perfeito.");
                break;

                
            case 7:
            	System.out.println("Digite sua idade:");
            	int idade = sc.nextInt();
            if (idade >= 18) {
            	System.out.println("Você é maior de idade.");
            } else if (idade >= 12) {
            	System.out.println("Você é adolescente.");
            } else {
            	System.out.println("Você é uma criança.");
            }
           break;
                
            default:
                System.out.println("Exercício inválido.");
        }
    }

    public static void repeticao(int ex) {
        switch (ex) {
            case 19:
                System.out.println("Ex. 19 - Média e múltiplos de 8");
                int soma = 0, count = 0, mult8 = 0, num;
                System.out.println("Digite números (-1 para sair):");
                while ((num = sc.nextInt()) != -1) {
                    soma += num;
                    count++;
                    if (num % 8 == 0) mult8++;
                }
                if (count > 0)
                    System.out.printf("Média: %.2f | Múltiplos de 8: %d\n", (double) soma / count, mult8);
                else
                    System.out.println("Nenhum número válido informado.");
                break;

            case 24:
            	System.out.println("Digite um número para ver a tabuada:");
            	int numero = sc.nextInt();
            	System.out.println("Tabuada de " + numero + ":");
            	int resultado;
            	for (int i = 1; i<= 10; i++) {
            	resultado =  numero * i;  
                System.out.println(numero + " X " + i + " = " + resultado);
            	}
              break;
                
                
            case 32:
                System.out.println("Ex. 32 - Divisores de Números");
                int n32;
                do {
                    System.out.print("Digite um número (>0) ou 0 para sair: ");
                    n32 = sc.nextInt();
                    if (n32 > 0){
                        System.out.print("Divisores: ");
                        for (int i = 1; i <= n32; i++) {
                            if (n32 % i == 0) System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                } while (n32 != 0);
                break;

            case 33:
                System.out.println("Ex. 33 - Soma de Inteiros");
                System.out.print("Quantos números deseja somar? ");
                int qtd = sc.nextInt(), total = 0;
                for (int i = 0; i < qtd; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    total += sc.nextInt();
                }
                System.out.println("Soma total: " + total);
                break;
                
            default:
                System.out.println("Exercício inválido.");
               
        }
    }
    public static void vetor(int ex) {
        switch (ex) {
            case 36:
            	System.out.println("Informe a quantidade de números a serem digitados: ");
            	int n = sc.nextInt();
            	int[]vect = new int[n];
            	System.out.println("Digite os números: ");
            	for(int i = 0;i < vect.length;i++) {
            		vect[i]= sc.nextInt();
            	}
            	System.out.println("Ordem digitada =");
            	for(int i = 0; i < vect.length; i++) {
                  	 System.out.print(vect[i] + " ");     	
                   }
                System.out.println("\nOrdem inversa = ");
                for (int i = vect.length - 1; i >= 0; i--) {
                   	 System.out.print(vect[i] + " ");     	
                   }
                 break;
                 
            case 44:
            	System.out.println("Informe a quantidade de números a serem digitados: ");
                 n = sc.nextInt();
                 vect = new int[n];
                
                System.out.println("Digite os números: ");
                for(int i = 0; i < vect.length; i++) {
                	vect[i] = sc.nextInt();
                }
                
                System.out.println("Números par = ");
                for(int i = 0; i < vect.length; i++) {
                	if(vect[i] % 2 == 0) {
                	   System.out.print(vect[i] + " ");
                	}
                }
              break;
              
            case 78:
            	System.out.println("Informe a quantidade de números a serem digitados: ");
        		n = sc.nextInt();
        		vect = new int[n];
        		

        		System.out.println("Digite os números: ");
        		for (int i = 0; i < vect.length; i++) {
        			vect[i] = sc.nextInt();
        		}

        		System.out.println("Números ímpar = ");
        		for (int i = 0; i < vect.length; i++) {
        			if (vect[i] % 2 != 0) {
        				System.out.print(vect[i] + " ");
        			}
        		}
        		break;
        		
            case 82:
            	System.out.println("Informe quantos produtos será lido os valores");
        		n = sc.nextInt();
        		vect =  new int[n];	
        		
         		for(int i = 0; i < vect.length; i++) {
         			System.out.println("Informe o valor do " + (i + 1) + "° produto: ");
        			vect[i] = sc.nextInt();
        		}
        		
        		double maisCaro = vect[0];

         		for(int i = 0; i < vect.length; i++) {
         			if(maisCaro < vect[i]) {
        			   maisCaro = vect[i];
        			}
        		}
        		 
        		System.out.println("Produto mais caro = " + maisCaro);
        		
            default:
                System.out.println("Exercício inválido.");
        }
        }
}







