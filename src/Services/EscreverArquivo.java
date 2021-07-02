package Services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import Model.Cliente;

public class EscreverArquivo {

	public EscreverArquivo(String arquivo, ArrayList<Cliente> listaCliente) throws IOException {
		
		try {
		FileWriter fw = new FileWriter(arquivo+".txt");	
		PrintWriter pw = new PrintWriter(fw);
		
			for (Object  obj : listaCliente) {
				pw.println(obj);				
			}
			pw.flush();
			pw.close();
			fw.close();
		}
		
		catch(IOException ex) {
			Logger.getLogger(arquivo);
		};
	}
}
