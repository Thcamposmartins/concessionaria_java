package Controller;

import Model.Pessoa;

public class ExibirPessoas {

	public ExibirPessoas() {
		
	}

	public void ExibirCliente(Pessoa cliente){
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



