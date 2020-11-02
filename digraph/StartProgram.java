package digraph;

import java.io.IOException;
import java.nio.file.Paths;

public class StartProgram {
	public static void main(String args[]) {
		//for (int i = 0; i < args.length; i++) {
			try {
				new Controller("documentation/Ex1_WantedAndWild.txt").CreateDigraphs();
				new Controller("documentation/Ex2_AMascaraDaMorteRubra.txt").CreateDigraphs();
				new Controller("documentation/Ex3_LuarDoSertao.txt").CreateDigraphs();
				new Controller("documentation/Ex4_Parabens.txt").CreateDigraphs();
				new Controller("documentation/Ex5_TresMotivosParaVacinarSeuPet.txt").CreateDigraphs();
			} catch (IOException e) {
				System.out.println("It was not possible to find file");
			}
		//}
	}

	private final String currentDirectory = System.getProperty("user.dir");

	private String getPath(String file) {
		return Paths.get(currentDirectory, "documentation", file).toString();
	}
}
