package concessionaria;

public class CadastrarPessoas {
	

	public CadastrarPessoas() {
		
	}
	public Cliente CadastrarCliente(int id, String nome, String cpf, String email){
		Cliente cliente = new Cliente(id, nome, cpf, email);		
		return cliente;
	}
	
	public Funcionario CadastrarFuncionario(int id, String nome, double salario){
		Funcionario funcionario = new Funcionario(id, nome, salario);
		return funcionario;
	}

}
