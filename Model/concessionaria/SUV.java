package concessionaria;

public class SUV extends Veiculo {
    private Double preco;

    public SUV(String nome, String cor, Double preco, int qtd) {
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
