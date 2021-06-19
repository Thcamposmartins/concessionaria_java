package concessionaria;

public class Cliente extends Pessoa {
	private String cpf;
	private String email;	

	public Cliente(int id, String nome, String cpf, String email) {
		super(id, nome);
		this.setCpf(cpf);
		this.setEmail(email);
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
