package concessionaria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {

	public EscreverArquivo(String path, String texto) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(texto + "\n");
		buffWrite.close();
	}
}
