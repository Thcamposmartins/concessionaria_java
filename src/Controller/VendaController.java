package Controller;

import java.util.ArrayList;

import Model.Venda;

public class VendaController {
	
	public ArrayList<Venda> vendasList;

	public VendaController() {
		
		vendasList = new ArrayList<Venda>();		
	}	

	    public ArrayList<Venda> getVendaList() {
			return vendasList;
		}

		public void setVendaList(ArrayList<Venda> vendasList) {
			this.vendasList = vendasList;
		}

		public void addVendas(Venda listVenda) {
			vendasList.add(listVenda);
			
		}	
		public void venderVeiculo(int id) {
			
		}


}
