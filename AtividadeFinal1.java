package entidade;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AtividadeFinal11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados(); 

        char repetirPrograma;

        System.out.print("Iniciar programa? (S/N): ");
        repetirPrograma = sc.next().toUpperCase().charAt(0);

        while (repetirPrograma == 'S') {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║           MENU PRINCIPAL             ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1 - Resolver Exercício              ║");
            System.out.println("║  2 - Ver Resumo e Total              ║");
            System.out.println("║  0 - Sair                            ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n╔════════════════════════════════════════════╗");
                    System.out.println("║     MENU DE OPÇÕES - TIPO DE EXERCÍCIO     ║");
                    System.out.println("╠════════════════════════════════════════════╣");
                    System.out.println("║  [0] SEQUENCIAL                            ║");
                    System.out.println("║  [1] CONDICIONAL                           ║");
                    System.out.println("║  [2] REPETIÇÃO                             ║");
                    System.out.println("║  [3] VETOR                                 ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    System.out.print("Escolha o tipo: ");
                    int tipo = sc.nextInt();

                    if (tipo == 0) {
                        System.out.println("Exercícios Sequenciais disponíveis: 22, 29, 32, 39");
                        System.out.print("Escolha o exercício: ");
                        int ex = sc.nextInt();
                        banco.salvar("sequencial", ex);  
                        exercicios.sequencial(ex);  
                    } else if (tipo == 1) {
                        System.out.println("Exercícios Condicionais disponíveis: 1, 3, 6, 7");
                        System.out.print("Escolha o exercício: ");
                        int ex = sc.nextInt();
                        banco.salvar("condicional", ex);  
                        exercicios.condicional(ex);  
                    } else if (tipo == 2) {
                        System.out.println("Exercícios de Repetição disponíveis: 19, 24, 32, 33");
                        System.out.print("Escolha o exercício: ");
                        int ex = sc.nextInt();
                        banco.salvar("repeticao", ex);  
                        exercicios.repeticao(ex);  
                    } else if (tipo == 3) {
                        System.out.println("Exercícios de Vetor disponíveis: 36, 44, 78, 82");
                        System.out.print("Escolha o exercício: ");
                        int ex = sc.nextInt();
                        banco.salvar("vetor", ex);  
                        exercicios.vetor(ex);  
                    } else {
                        System.out.println("❌ Tipo inválido!");
                    }
                    break;

                case 2:
                    banco.mostrarResumo();
                    banco.mostrarQuantidadeTotal();
                    break;

                case 0:
                    repetirPrograma = 'N';  
                    break;

                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
                    break;
            }

            if (opcao != 0) {  
                System.out.print("\nDeseja voltar ao menu principal? (S/N): ");
                repetirPrograma = sc.next().toUpperCase().charAt(0);
            }
        }

        System.out.println("\n✅ Programa finalizado!");
        sc.close();
    }
}
