package executaveis;

import java.util.ArrayList; // Importa a classe ArrayList
import java.util.Scanner; // Importa a classe Scanner

import entidades.Pessoa;


// Definição da classe Programa
public class Programa {

	// Declaração de uma lista estática para armazenar objetos Pessoa
	private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

	// Método principal que inicia a execução do programa
	public static void main(String[] args) {

		// Método que cadastra algumas pessoas automaticamente na lista
		cadastrarPessoasAutomaticamente();

		// Criação de um objeto Scanner para leitura de entradas do usuário
		Scanner sc = new Scanner(System.in);
		int opcao;

		// Loop do-while para exibir o menu e processar a escolha do usuário
		do {
			// Exibição do menu de opções
			System.out.println("\nSistema de Cadastro de Pessoas");
			System.out.println("1. Cadastrar nova pessoa");
			System.out.println("2. Listar pessoas cadastradas");
			System.out.println("3. Buscar pessoa por CPF");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt(); // Lê a opção escolhida pelo usuário
			sc.nextLine(); // Consome a linha nova deixada pelo nextInt

			// Switch para tratar a escolha do usuário
			switch (opcao) {
			case 1:
				// Chama o método para cadastrar uma nova pessoa
				cadastrarPessoa(sc);
				break;
			case 2:
				// Chama o método para listar todas as pessoas cadastradas
				listarPessoas();
				break;
			case 3:
				// Chama o método para buscar uma pessoa pelo CPF
				buscarPessoaPorCpf(sc);
				break;
			case 4:
				// Mensagem de saída do sistema
				System.out.println("Saindo do sistema...");
				break;
			default:
				// Mensagem para opção inválida
				System.out.println("Opção inválida. Tente novamente.");
			}

			// Loop continua enquanto a opção não for 4 (Sair)
		} while (opcao < 1 & opcao > 4);

		// Fecha o Scanner
		sc.close();
	}

	// Método para cadastrar pessoas automaticamente na lista
	private static void cadastrarPessoasAutomaticamente() {
		listaPessoas.add(new Pessoa("Lucas", 19, "123.456.789-00", "lucas@example.com", "1111-1111"));
		listaPessoas.add(new Pessoa("Alana", 18, "234.567.890-11", "alana@example.com", "2222-2222"));
		listaPessoas.add(new Pessoa("Felipe", 18, "345.678.901-22", "felipe@example.com", "3333-3333"));
		listaPessoas.add(new Pessoa("Daniela", 22, "456.789.012-33", "daniela@example.com", "4444-4444"));
		listaPessoas.add(new Pessoa("Eduardo", 35, "567.890.123-44", "eduardo@example.com", "5555-5555"));
		listaPessoas.add(new Pessoa("Fernanda", 27, "678.901.234-55", "fernanda@example.com", "6789-6789"));
		listaPessoas.add(new Pessoa("Gabriel", 32, "789.012.345-66", "gabriel@example.com", "7777-7777"));
	}

	// Método para cadastrar uma nova pessoa com dados fornecidos pelo usuário
	private static void cadastrarPessoa(Scanner sc) {
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine(); // Lê o nome
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt(); // Lê a idade
		sc.nextLine(); // Consome a linha nova deixada pelo nextInt
		System.out.print("Digite o CPF: ");
		String cpf = sc.nextLine(); // Lê o CPF
		System.out.print("Digite o email: ");
		String email = sc.nextLine(); // Lê o email
		System.out.print("Digite o telefone: ");
		String telefone = sc.nextLine(); // Lê o telefone

		// Cria um novo objeto Pessoa com os dados fornecidos e adiciona à lista
		Pessoa pessoa = new Pessoa(nome, idade, cpf, email, telefone);
		listaPessoas.add(pessoa);
		System.out.println("Pessoa cadastrada!");
	}

	// Método para listar todas as pessoas cadastradas
	private static void listarPessoas() {
		// Exibe cabeçalho das colunas
		System.out.printf("%-20s %-10s %-20s\n", "Nome", "Idade", "CPF");
		// Itera sobre a lista de pessoas e exibe cada uma
		for (Pessoa pessoa : listaPessoas) {
			System.out.printf("%-20s %-10d %-20s\n", pessoa.getNome(), pessoa.getIdade(), pessoa.getCpf());
		}
	}

	// Método para buscar uma pessoa pelo CPF
	private static void buscarPessoaPorCpf(Scanner sc) {
		System.out.print("Digite o CPF da pessoa a ser buscada: ");
		String cpf = sc.nextLine(); // Lê o CPF fornecido pelo usuário

		// Itera sobre a lista de pessoas e busca pelo CPF
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				// Se encontrar, exibe os dados da pessoa
				System.out.println(pessoa);
				return; // Retorna para sair do método após encontrar
			}
		}

		// Mensagem se a pessoa não for encontrada
		System.out.println("Pessoa não encontrada.");
	}
}
