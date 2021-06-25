package concessionaria;

public class Sedan extends Veiculo {

    Double preco;

    public Sedan(String nome, String cor, Double preco, int qtd) {
        super(nome, cor, qtd);
        this.setPreco(preco);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
