package Model;

public class Venda {
    
	private int id;
    private String veiculo;
    private String cor;
    private String categoria;
    private Double preco;
	private String nomeComprador;
	private String cpfComprador;
	private String emailComprador;	
	private String telefoneComprador;

    public Venda() {
    	
    }
    
    public Venda(int id, String veiculo, String cor, String categoria, Double preco) {
        this.setId(id);
        this.setVeiculo(veiculo);
        this.setCor(cor);
        this.setCategoria(categoria);
        this.setPreco(preco);
    }

    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }

   public String getVeiculo() {
	   return veiculo;
   }
   
   public void setVeiculo(String veiculo) {
	   this.veiculo = veiculo;
   }
   
   public String getCor() {
	   return cor;
   }
   
   public void setCor(String cor) {
	   this.cor = cor;
   }
   
   public String getCategoria() {
	   return categoria;
   }
   
   public void setCategoria(String categoria) {
	   this.categoria = categoria;
   }
   
   public Double getPreco() {
	   return preco;
   }
   
   public void setPreco(Double preco) {
	   this.preco = preco;
   }

public String getNomeComprador() {
	return nomeComprador;
}

public void setNomeComprador(String nomeComprador) {
	this.nomeComprador = nomeComprador;
}

public String getCpfComprador() {
	return cpfComprador;
}

public void setCpfComprador(String cpfComprador) {
	this.cpfComprador = cpfComprador;
}

public String getEmailComprador() {
	return emailComprador;
}

public void setEmailComprador(String emailComprador) {
	this.emailComprador = emailComprador;
}

public String getTelefoneComprador() {
	return telefoneComprador;
}

public void setTelefoneComprador(String telefoneComprador) {
	this.telefoneComprador = telefoneComprador;
}
}
