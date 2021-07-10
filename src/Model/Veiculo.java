package Model;

public class Veiculo extends Object {
	
	private String ID;
    private String nome;
    private String cor;
    private String categoria;
    private Double preco;
    
    public Veiculo() {
    	
    }

    public Veiculo( String ID, String nome, String cor, String categoria, Double preco) {
    	this.setID(ID);
        this.setNome(nome);
        this.setCor(cor);
        this.setCategoria(categoria);
        this.setPreco(preco);
    }

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

 
}