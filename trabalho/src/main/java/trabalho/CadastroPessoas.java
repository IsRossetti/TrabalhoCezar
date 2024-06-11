package trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {

      private static List<Pessoa> pessoas = new ArrayList<>();

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
                adicionarPessoa(scanner);
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
    class Pessoa {
        private String nome;
        private int idade;
    
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade;
        }
    }

    private static void adicionarPessoa(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

       // Pessoa pessoa = new Pessoa(nome, idade);
       // pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    private static void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas!");
            return;
        }

        System.out.println("\nLista de pessoas:");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            System.out.println("Índice: " + i + ", Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        }
    }

    private static void alterarPessoa(Scanner scanner) {
        listarPessoas();
        System.out.print("Digite o índice da pessoa que deseja alterar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Nova idade: ");
            int novaIdade = scanner.nextInt();
            scanner.nextLine();

            Pessoa pessoa = pessoas.get(indice);
            pessoa.setNome(novoNome);
            pessoa.setIdade(novaIdade);
            System.out.println("Dados da pessoa atualizados!");
        } else {
            System.out.println("Índice inválido. Nenhuma alteração realizada.");
        }
    }
    private static void excluirPessoa(Scanner scanner) {
        listarPessoas();
        System.out.print("Digite o índice da pessoa que deseja excluir: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
            System.out.println("Pessoa removida com sucesso!");
        } else {
            System.out.println("Índice inválido. Nenhuma exclusão realizada.");
        }
    }
}