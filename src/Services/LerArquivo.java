package Services;

import java.io.BufferedReader;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	@SuppressWarnings("unchecked")
	List<Object> object = (List<Object>) new Object();
	
	public LerArquivo(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
			object.add(0, linha);			
		}
		System.out.println(object);
		buffRead.close();
	}

}
