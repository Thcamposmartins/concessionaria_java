package Model;

public class Cliente extends Pessoa {
	private String cpf;
	private String email;	
	private String telefone;
	
	public Cliente() {
		
	}
	public Cliente(int id, String nome, String cpf, String email) {
		super(id, nome);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setTelefone(telefone);
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
