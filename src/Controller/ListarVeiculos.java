package Controller;

/*import Model.Hatch;
import Model.Picape;
import Model.SUV;
import Model.Sedan;*/
import Model.Veiculo;

public class ListarVeiculos {

    public ListarVeiculos() {

    }
    
	public void ListarVeiculosEstoque(Veiculo veiculo) {
		for(Veiculo veiculo : produto) {
			System.out.println(veiculo);
		}
	}
	

	/*
   	public void ListarVeiculosEstoque(Picape picape, SUV suv, Sedan sedan,Hatch hatch ) {
		if (picape.getQtd()!=0) {System.out.println(
				"\nPicape"+
				"\nNome: "+ picape.getNome() +
				"\nCor: "+ picape.getCor() +
				"\nPreco: "+ picape.getPreco()+
				"\nQuantidade "+ picape.getQtd());
		}
		if (suv.getQtd()!=0) {System.out.println(		
				"\n\nSUV"+		
				"\nNome: "+ suv.getNome() +
				"\nCor: "+ suv.getCor() +
				"\nPreco: "+ suv.getPreco()+
				"\nQuantidade "+ suv.getQtd());
		}
		if (sedan.getQtd()!=0) {System.out.println(		
				"\n\nSedan"+	
				"\nNome: "+ sedan.getNome() +
				"\nCor: "+ sedan.getCor() +
				"\nPreco: "+ sedan.getPreco()+
				"\nQuantidade "+ sedan.getQtd());
		}
		if (hatch.getQtd()!=0) {System.out.println(
				"\n\nHatch"+	
				"\nNome: "+ hatch.getNome() +
				"\nCor: "+ hatch.getCor() +
				"\nPreco: "+ hatch.getPreco()				+
				"\nQuantidade "+ hatch.getQtd());
		}
    }
   	public void ListarVeiculosTodos(Picape picape, SUV suv, Sedan sedan,Hatch hatch ) {
		
		System.out.println(
				"\nPicape"+
				"\nNome: "+ picape.getNome() +
				"\nCor: "+ picape.getCor() +
				"\nPreco: "+ picape.getPreco()+
				"\n\nSUV"+		
				"\nNome: "+ suv.getNome() +
				"\nCor: "+ suv.getCor() +
				"\nPreco: "+ suv.getPreco()+
				"\n\nSedan"+	
				"\nNome: "+ sedan.getNome() +
				"\nCor: "+ sedan.getCor() +
				"\nPreco: "+ sedan.getPreco()+
				"\n\nHatch"+	
				"\nNome: "+ hatch.getNome() +
				"\nCor: "+ hatch.getCor() +
				"\nPreco: "+ hatch.getPreco()
		)
    }*/

}