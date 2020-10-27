package digrafo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassController {

	
	public static void main(String args[]) throws IOException  {		
		// Instancia um objeto "ReadArchive".
		ReadArchive arq = new ReadArchive();
		
		// Cria um Arraylist 
		ArrayList<String> textArchive = new ArrayList<String>();
		
		// armazena o texto(já tratado) do arquivo, no arraylist 
		textArchive = createArrayText(arq);
		System.out.println(textArchive);
		
		 
		// Instancia um objeto "CreatKnots".
		CreatKnots classKnots = new CreatKnots();
		
		// Cria um Arraylist 
		List<String> textKnots = new ArrayList<String>();

		// armazena o método AgroupAB que irá criar os nós 
		textKnots = classKnots.AgroupAB(textArchive);
		System.out.println(textKnots);
		
	}
	
	public static ArrayList<String> createArrayText(ReadArchive arq){
		String caminho = "";
		// cria um ArrayList
		List<String> txt = new ArrayList<String>();
		
		// tratamento de exerções 
		try {
			// atribui o caminho do arquivo a string caminho. 
			caminho = "/home/carlos/Documents/ESTUDOS/Unicamp/Unicamp 2020/2º Semestre/POO II - Angelis/progms/Projeto 1/codigos/src/arquivos/parabens_pra_voce.txt";
			
			// chama afunção para que irá ler o texto do arquivo e add no array  
			txt = arq.ReadAndSeparator(caminho);
			
			return (ArrayList<String>) txt;
			
		}catch(IOException e) {
			txt.add("Error, Arquivo não encontrado!	");
			return (ArrayList<String>) txt;
		}	
	}
}








