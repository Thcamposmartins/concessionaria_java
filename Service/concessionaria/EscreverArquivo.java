package concessionaria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

public class EscreverArquivo {

	public EscreverArquivo(String arquivo, List<Object> object) throws IOException {
		
		try {
		FileWriter fw = new FileWriter(arquivo+".txt");	
		PrintWriter pw = new PrintWriter(fw);
		
			for (Object  obj : object) {
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
