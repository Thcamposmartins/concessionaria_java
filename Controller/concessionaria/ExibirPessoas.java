package concessionaria;

public class ExibirPessoas {

	public ExibirPessoas() {
		
	}
	public void ExibirFuncionario(Funcionario funcionario){
		funcionario.getId();
		funcionario.getNome();
		funcionario.getSalario();
		System.out.println(
				"\nID: "+funcionario.getId() +
				"\nNome: "+ funcionario.getNome() +
				"\nSalario: "+ funcionario.getSalario());	
	}
	public void ExibirCliente(Cliente cliente){
		cliente.getId();
		cliente.getNome();
		cliente.getCpf();
		cliente.getEmail();
		
		System.out.println(
				"\nID: "+cliente.getId() +
				"\nNome: "+ cliente.getNome() +
				"\nCPF: "+ cliente.getCpf() +
				"\nEmail: " + cliente.getEmail());
	}
}



