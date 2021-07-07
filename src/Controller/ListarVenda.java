package Controller;

import Model.Venda;

public class ListarVenda {
    
    public ListarVenda() {

    }

    public void listarVendas(Venda venda) {
		
		System.out.println(
				"\nQuantidade de vendas: " + venda.getQuantidadeDeVendas() +
				"\nNome do veiculo vendido: " + venda.getNomeVeiculoVendido() +
				"\nCor do veiculo vendido: " + venda.getCorVeiculoVendido() +
                "\nCategoria do veiculo vendido:" + venda.getCategoriaVeiculoVendido() +
                "\nPreco do veiculo vendido:" + venda.getPrecoVeiculoVendido());
    }

}
