package digrafo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	public static void main(String args[]) throws IOException  {		
		// Instancia um objeto "ReadArchive".
		ReadArchive arq = new ReadArchive();
		
		// Cria um Arraylist
		List<String> textArchive = new ArrayList<String>();
		
		// cria string que irá armazenar o texto(já tratado) do arquivo 
		textArchive = createArrayText(arq);
		
		
		System.out.println(textArchive);
	}
	
	public static ArrayList<String> createArrayText(ReadArchive arq){
		String caminho = "";
		// cria um ArrayList
		List<String> txt = new ArrayList<String>();
		
		// tratamento de exerções 
		try {
			// atribui o caminho do arquivo a string caminho. 
			caminho = "/home/carlos/Documents/ESTUDOS/Unicamp/Unicamp 2020/2º Semestre/POO II - Angelis/progms/Projeto 1/codigos/src/arquivos/textoMusic.txt";
			
			// chama afunção para que irá gravar o texto do arquivo no array txt  
			txt = arq.ReadAndSeparator(caminho);
			
			return (ArrayList<String>) txt;
			
		}catch(IOException e) {
			txt.add("Error, Arquivo não encontrado!	");
			return (ArrayList<String>) txt;
		}	
	}
}








