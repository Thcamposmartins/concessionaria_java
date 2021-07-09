package Model;

public class Hatch extends Veiculo {
    
    Double preco;

    public Hatch(String nome, String cor, Double preco, int qtd) {
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