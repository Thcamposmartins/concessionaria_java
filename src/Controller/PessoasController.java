package Controller;

import java.util.ArrayList;

import Model.Pessoa;
import Model.Veiculo;

public class PessoasController {
	
	public ArrayList<Pessoa> pessoasList;
	public ArrayList<Pessoa> pessoasEcluidas;

	public PessoasController() {
		
		pessoasList = new ArrayList<Pessoa>();
		pessoasEcluidas = new ArrayList<Pessoa>();
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
		public void removePessoa(int ID ) {
			for(Pessoa p : pessoasList ) {
				if(p.getId()==ID) {
					pessoasList.remove(p);
					pessoasEcluidas.add(p);
				}			
			}		
		}


}
