package digrafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
import java.io.BufferedWriter;
import java.io.FileWriter;
*/


public class ReadArchive{

	public ArrayList<String>ReadAndSeparator(String caminho) throws IOException {
	
		// Cria um Arraylist
		List<String> text = new ArrayList<String>();
		
		// tratamento de excerções
		try {
			
			// Indicamos o arquivo que será lido
			FileReader arq = new FileReader(caminho);
			
			// criamos o objeto BufferedReader que nós oferece o método de leitura readLine()
			BufferedReader buffRead = new BufferedReader(arq);
			
			// Faz a leitura da primeira linha de texto do arquivo e armazena na string "line"
			String line = buffRead.readLine();
			
			while (line != null) {			
			
				// transforma o texto de "line" em minúsculas
				line = line.toLowerCase();
				
				// separa e armazena palavra por palavra o texto de "line" para "newLine"
				String[] newLine = line.split(" ");
				
				for(int i=0; i<newLine.length; i++) {
					// tira os pontos, virgulas, aspas e travessões do texto. 
					newLine[i] = newLine[i].replace(".", "");
					newLine[i] = newLine[i].replace("-", "");
					newLine[i] = newLine[i].replace("\"\"", "");
					text.add(newLine[i]);
				}
				
				// faz a leitura da próxima linha
				line = buffRead.readLine();
			}

			// fecha o Buff
			arq.close();
		
			return (ArrayList<String>) text;
			
		}catch(IOException e) {
			text.add("Error, Arquivo não encontrado!");
			return (ArrayList<String>) text;
		}
	}
	
	
}







