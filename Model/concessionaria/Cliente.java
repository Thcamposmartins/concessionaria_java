package concessionaria;

public class Cliente extends Pessoa {
	private String cpf;	

	public Cliente(int id, String nome, String cpf) {
		super(id, nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
