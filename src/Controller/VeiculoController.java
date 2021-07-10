package Controller;

import java.util.ArrayList;

import Model.Veiculo;

public class VeiculoController {
	
	public ArrayList<Veiculo> veiculosList;

	public VeiculoController() {
		
		veiculosList = new ArrayList<Veiculo>();		
	}	

	    public ArrayList<Veiculo> getVeiculoList() {
			return veiculosList;
		}

		public void setVeiculoList(ArrayList<Veiculo> veiculosList) {
			this.veiculosList = veiculosList;
		}

		public void addVeiculo(Veiculo veiculo ) {
			veiculosList.add(veiculo);
			
		}


}
