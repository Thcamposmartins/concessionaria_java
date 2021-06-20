package concessionaria;

public class CadastrarVeiculo {

    public CadastrarVeiculo() {

    }

    public Picape cadastrarPicape(String nome, String cor, Double preco) {
        Picape picape = new Picape(nome, cor, preco);
        return picape;
    }

    public SUV cadastrarSUV(String nome, String cor, Double preco) {
        SUV suv = new SUV(nome, cor, preco);
        return suv;
    }

    public Sedan cadastrarSedan(String nome, String cor, Double preco) {
        Sedan sedan = new Sedan(nome, cor, preco);
        return sedan;
    }

    public Hatch cadastrarHatch(String nome, String cor, Double preco) {
        Hatch hatch = new Hatch(nome, cor, preco);
        return hatch;
    }
    
}
