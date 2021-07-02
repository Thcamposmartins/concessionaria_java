package Model;

public class Pessoa {
	private int id;
	private int idade;
	private String nome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


}
