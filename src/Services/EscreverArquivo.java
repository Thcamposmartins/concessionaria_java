package Services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Logger;
import Model.Pessoa;
import Model.Veiculo;
import Model.Venda;

public class EscreverArquivo {
	
	public EscreverArquivo(){
		
	};

	public void EscreverArquivoPessoa(ArrayList<Pessoa> listaPessoas) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("pessoas.txt");	
		PrintWriter pw = new PrintWriter(fw);
		
			for (Pessoa  obj : listaPessoas) {	
				pw.println("------------------------------------------------");
				pw.println("ID: "+ obj.getId());
				pw.println("Nome: "+obj.getNome());
				pw.println("Idade: "+obj.getIdade());
				pw.println("CPF: "+obj.getCpf());
				pw.println("E-mail: " + obj.getEmail());
				pw.println("Telefone: " + obj.getTelefone());
				pw.println("-------------------------------------------------");
				
			}
			pw.flush();
			pw.close();
			fw.close();
		}
		
		catch(IOException ex) {
			Logger.getLogger("Pesoas");
		};
	}
	public void EscreverArquivoVeiculos(ArrayList<Veiculo> listaveiculos) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("veiculos.txt");	
		PrintWriter pw = new PrintWriter(fw);
		
			for (Veiculo  obj : listaveiculos) {
				pw.println("-------------------------------------------------");
				pw.println("ID: " + obj.getID());	
				pw.println("Nome: " + obj.getNome());	
				pw.println("Cor: " + obj.getCor());	
				pw.println("Categoria: " + obj.getCategoria());	
				pw.println("Valor: "+ obj.getPreco());	
				pw.println("--------------------------------------------------");
			}
			pw.flush();
			pw.close();
			fw.close();
		}
		
		catch(IOException ex) {
			Logger.getLogger("Veiculos");
		};
	}
	public void EscreverArquivoVendas(ArrayList<Venda> listaVendas) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("vendas.txt");	
		PrintWriter pw = new PrintWriter(fw);
		
			for (Venda  obj : listaVendas) {
				pw.println("-------------------------------------------------");
				pw.println("Id: " + obj.getId());	
				pw.println("Veiculo: " + obj.getVeiculo());	
				pw.println("Cor: " + obj.getCor());	
				pw.println("Categoria: " + obj.getCategoria());	
				pw.println("Preço: "+ obj.getPreco());	
				pw.println("--------------------------------------------------");
			}
			pw.flush();
			pw.close();
			fw.close();
		}
		
		catch(IOException ex) {
			Logger.getLogger("Vendas");
		};
	}
}
