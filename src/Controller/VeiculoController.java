package Controller;

import java.util.ArrayList;

import Model.Veiculo;

public class VeiculoController {
	
	public ArrayList<Veiculo> veiculosList;
	public ArrayList<Veiculo> veiculosOff;

	public VeiculoController() {
		
		veiculosList = new ArrayList<Veiculo>();	
		veiculosOff = new ArrayList<Veiculo>();
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
		public void removeVeiculo(int ID ) {
			for(Veiculo v : veiculosList ) {
				if(v.getID()==ID) {
					veiculosList.remove(v);
					veiculosOff.add(v);
				}			
			}		
		}


}
