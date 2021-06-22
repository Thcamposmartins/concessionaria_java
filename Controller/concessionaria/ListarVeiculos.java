package concessionaria;

public class ListarVeiculos {

    public ListarVeiculos() {

    }

    public void listarPicape(Picape picape) {
        picape.getNome();
		picape.getCor();
		picape.getPreco();
		
		System.out.println(
				"\nNome: "+ picape.getNome() +
				"\nCor: "+ picape.getCor() +
				"\nPreco: "+ picape.getPreco());
    }

    public void listarSUV(SUV suv) {
        suv.getNome();
		suv.getCor();
		suv.getPreco();
		
		System.out.println(
				"\nNome: "+ suv.getNome() +
				"\nCor: "+ suv.getCor() +
				"\nPreco: "+ suv.getPreco());
    }

    public void listarSedan(Sedan sedan) {
        sedan.getNome();
		sedan.getCor();
		sedan.getPreco();
		
		System.out.println(
				"\nNome: "+ sedan.getNome() +
				"\nCor: "+ sedan.getCor() +
				"\nPreco: "+ sedan.getPreco());
    }

    public void listarHatch(Hatch hatch) {
        hatch.getNome();
		hatch.getCor();
		hatch.getPreco();
		
		System.out.println(
				"\nNome: "+ hatch.getNome() +
				"\nCor: "+ hatch.getCor() +
				"\nPreco: "+ hatch.getPreco());
    }
    
}
