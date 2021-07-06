package Services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Logger;
import Model.Pessoa;

public class EscreverArquivo {

	public EscreverArquivo(String arquivo, ArrayList<Pessoa> listaPessoas) throws IOException {
		
		try {
		FileWriter fw = new FileWriter(arquivo+".txt");	
		PrintWriter pw = new PrintWriter(fw);
		
			for (Object  obj : listaPessoas) {
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
