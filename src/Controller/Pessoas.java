package Controller;

import java.util.ArrayList;

import Model.Pessoa;

public class Pessoas {
	
	public ArrayList<Pessoa> pessoasList;

	public Pessoas() {
		
		pessoasList = new ArrayList();		
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
