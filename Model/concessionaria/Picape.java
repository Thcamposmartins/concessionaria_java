package concessionaria;

public class Picape extends Veiculo {

    Double preco;

    public Picape(String nome, String cor, Double preco) {
        super(nome, cor);
        this.setPreco(preco);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}