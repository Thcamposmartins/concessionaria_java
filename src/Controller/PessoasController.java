package Controller;

import java.util.ArrayList;

import Model.Pessoa;

public class PessoasController {
	
	public ArrayList<Pessoa> pessoasList;

	public PessoasController() {
		
		pessoasList = new ArrayList<Pessoa>();		
	}	

	    public ArrayList<Pessoa> getClienteList() {
			return pessoasList;
		}

		public void setClienteList(ArrayList<Pessoa> pessoasList) {
			this.pessoasList = pessoasList;
		}

		public void addPessoas(Pessoa listPessoa ) {
			pessoasList.add(listPessoa);
			
		}


}
