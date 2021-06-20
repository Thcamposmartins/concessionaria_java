package concessionaria;

public class Veiculo {

    private String nome;
    private String cor;

    public Veiculo(String nome, String cor) {
        this.setNome(nome);
        this.setCor(cor);
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
 
}