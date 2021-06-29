package concessionaria;

public class Venda {
    private Integer quantidadeDeVendas;
    private String nomeVeiculoVendido;
    private String corVeiculoVendido;
    private Double precoVeiculoVendido;

    public Venda(Integer quantidadeDeVendas, String nomeVeiculoVendido, String corVeiculoVendido, Double precoVeiculoVendido) {
        this.setQuantidadeDeVendas(quantidadeDeVendas);
        this.setNomeVeiculoVendido(nomeVeiculoVendido);
        this.setCorVeiculoVendido(corVeiculoVendido);
        this.setPrecoVeiculoVendido(precoVeiculoVendido);
    }

    public Integer getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Integer quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public String getNomeVeiculoVendido() {
        return nomeVeiculoVendido;
    }

    public void setNomeVeiculoVendido(String nomeVeiculoVendido) {
        this.nomeVeiculoVendido = nomeVeiculoVendido;
    }

    public String getCorVeiculoVendido() {
        return corVeiculoVendido;
    }

    public void setCorVeiculoVendido(String corVeiculoVendido) {
        this.corVeiculoVendido = corVeiculoVendido;
    }

    public Double getPrecoVeiculoVendido() {
        return precoVeiculoVendido;
    }

    public void setPrecoVeiculoVendido(Double precoVeiculoVendido) {
        this.precoVeiculoVendido = precoVeiculoVendido;
    }
}
