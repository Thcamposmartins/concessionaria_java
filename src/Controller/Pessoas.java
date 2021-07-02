package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Cliente;
import Model.Funcionario;

public class Pessoas {
	

	public Pessoas() {
		
	}
	public Cliente CadastrarCliente(int id, String nome, String cpf, String email){
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
	    	ArrayList<Object> c = null ;
	    	c.add(clientes.getId());
	    	c.add(clientes.getEmail());
	    	c.add(clientes.getNome());
	    	c.add(clientes.getTelefone());
	    	c.add(clientes.getCpf());

	        return c;
	    }


}
