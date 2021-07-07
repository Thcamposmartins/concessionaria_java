package Controller;

import java.util.ArrayList;

import Model.Pessoa;

public class Pessoas {
	
	ArrayList<Pessoa> pessoasList;

	public Pessoas() {
		
		pessoasList = new ArrayList();		
	}	

	    public ArrayList<Pessoa> getClienteList() {
			return pessoasList;
		}

		public void setClienteList(ArrayList<Pessoa> pessoasList) {
			this.pessoasList = pessoasList;
		}

		public void addPessoas(Pessoa P ) {
			pessoasList.add(P);
			
		}

}
