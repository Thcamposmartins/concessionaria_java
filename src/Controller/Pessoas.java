package Controller;

import java.util.ArrayList;

import Model.Pessoa;

public class Pessoas {
	
	ArrayList<Pessoa> pessoasList;

	public Pessoas() {
		
		pessoasList = new ArrayList();		
	}
	
	/*public Pessoa CadastrarCliente(int id, String nome, String cpf, String email){
		
		Cliente cliente = new Cliente(id, nome, cpf, email);	
		
		return cliente;
	}
	
		 public boolean incluir(Cliente cliente) throws Exception {
			 
			 Cliente cl = new Cliente();
			 
			 cl.setId(cliente.getId());
			 cl.setNome(cliente.getNome());
			 cl.setEmail(cliente.getEmail());
			 cl.setTelefone( cliente.getTelefone());
			 cl.setCpf(cliente.getCpf());			       
			       return true;
			    }
	   

		public void excluir(int id) throws Exception {
	    	//implementar excluir
	    }

	    public boolean editar(Cliente cliente) throws Exception {
	    	
	    	 Cliente cl = new Cliente();
			 
			 cl.setId(cliente.getId());
			 cl.setNome(cliente.getNome());
			 cl.setEmail(cliente.getEmail());
			 cl.setTelefone( cliente.getTelefone());
			 cl.setCpf(cliente.getCpf());			       
			       return true;
	    }

	    public static ArrayList<Object> pesquisar(Cliente clientes) throws Exception {
	    	
	    	ArrayList<Object> c = null;
	    	
	    	c.add(clientes.getId());
	    	c.add(clientes.getEmail());
	    	c.add(clientes.getNome());
	    	c.add(clientes.getTelefone());
	    	c.add(clientes.getCpf());

	        return c;
	    }*/
	    //NOVO TESTE
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
