package digrafo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CreatKnots {
	public ArrayList<String>AgroupAB(List<String> textArchive){
		
		/* List<String> groups = new ArrayList<String>();
		
		List<String> ab = new ArrayList<String>();*/
		
		// cria um TreeMap 
		TreeMap<String, String> groups = new TreeMap<>();
		
		// "percorre" o Arralist percando os valores e atribuidos seus pares no map groups
		for (int i=0; i < textArchive.size()-1; i++){			
			groups.put(textArchive.get(i), textArchive.get(i+1));
		}
		// imprime o resultado
		System.out.print("\n");
		System.out.print(groups);
		
		
		return null;		
	}
}
