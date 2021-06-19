package concessionaria;

public class AtualizarPessoas {

	public AtualizarPessoas() {
		
	}
	public void AtualizarFuncionario(Funcionario funcionario, int id, String nome, double salario){
		funcionario.setId(id);
		funcionario.setNome(nome);
		funcionario.setSalario(salario);		
	}
	public void AtualizarCliente(Cliente cliente, int id, String nome, String cpf, String email){
		cliente.setId(id);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
	}
}
