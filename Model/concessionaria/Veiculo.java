package concessionaria;

public class Veiculo {

    private String nome;
    private String cor;
    private int qtd;

    public Veiculo(String nome, String cor, int qtd) {
        this.setNome(nome);
        this.setCor(cor);
        this.setQtd(qtd);
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

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
 
}