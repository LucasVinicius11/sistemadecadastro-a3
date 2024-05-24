package entidades;

//Definição da classe Pessoa
public class Pessoa {

	// Atributos privados da classe Pessoa
	private String nome;
	private int idade;
	private String cpf;
	private String email;
	private String telefone;

	// Construtor da classe Pessoa que inicializa os atributos
	public Pessoa(String nome, int idade, String cpf, String email, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	// Método getter para o atributo nome
	public String getNome() {
		return nome;
	}

	// Método getter para o atributo idade
	public int getIdade() {
		return idade;
	}

	// Método getter para o atributo cpf
	public String getCpf() {
		return cpf;
	}

	// Método getter para o atributo email
	public String getEmail() {
		return email;
	}

	// Método getter para o atributo telefone
	public String getTelefone() {
		return telefone;
	}

	// Método toString sobrescrito para fornecer uma representação em String da
	// Pessoa
	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf + ", Email: " + email + ", Telefone: "
				+ telefone;
	}
}
