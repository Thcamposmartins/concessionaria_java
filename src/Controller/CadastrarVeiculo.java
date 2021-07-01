package Controller;

import Model.Hatch;
import Model.Picape;
import Model.SUV;
import Model.Sedan;

public class CadastrarVeiculo {

    public CadastrarVeiculo() {

    }

    public Picape cadastrarPicape(String nome, String cor, Double preco, int qtd) {
        Picape picape = new Picape(nome, cor, preco, qtd);
        return picape;
    }

    public SUV cadastrarSUV(String nome, String cor, Double preco,int qtd) {
        SUV suv = new SUV(nome, cor, preco, qtd);
        return suv;
    }

    public Sedan cadastrarSedan(String nome, String cor, Double preco, int qtd) {
        Sedan sedan = new Sedan(nome, cor, preco, qtd);
        return sedan;
    }

    public Hatch cadastrarHatch(String nome, String cor, Double preco, int qtd) {
        Hatch hatch = new Hatch(nome, cor, preco, qtd);
        return hatch;
    }
    
}
