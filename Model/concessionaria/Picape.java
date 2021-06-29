package concessionaria;

public class Picape extends Veiculo {
    private double preco;

    public Picape(String nome, String cor, double preco, int qtd) {
        super(nome, cor, qtd);
        this.setPreco(preco);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}