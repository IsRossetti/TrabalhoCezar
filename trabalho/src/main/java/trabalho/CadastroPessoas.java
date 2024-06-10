package trabalho;

import java.util.Scanner;

public class CadastroPessoas {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Listar todas as pessoas");
            System.out.println("3. Alterar dados de uma pessoa");
            System.out.println("4. Excluir pessoa");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            scanner.close();
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
}