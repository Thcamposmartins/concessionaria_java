package Model;

public class Venda {
    
    private Integer quantidadeDeVendas;
    private String nomeVeiculoVendido;
    private String corVeiculoVendido;
    private String categoriaVeiculoVendido;
    private Double precoVeiculoVendido;

    public Venda(Integer quantidadeDeVendas, String nomeVeiculoVendido, String corVeiculoVendido, String categoriaVeiculoVendido, Double precoVeiculoVendido) {
        this.quantidadeDeVendas = quantidadeDeVendas;
        this.nomeVeiculoVendido = nomeVeiculoVendido;
        this.corVeiculoVendido = corVeiculoVendido;
        this.categoriaVeiculoVendido = categoriaVeiculoVendido;
        this.precoVeiculoVendido = precoVeiculoVendido;
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

    public String getCategoriaVeiculoVendido() {
        return categoriaVeiculoVendido;
    }

    public void setCategoriaVeiculoVendido(String categoriaVeiculoVendido) {
        this.categoriaVeiculoVendido = categoriaVeiculoVendido;
    }
}
