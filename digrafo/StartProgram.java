package digrafo;

import java.io.IOException;
import java.nio.file.Paths;

public class StartProgram {
	public static void main(String args[]) {
		Controller controller = new Controller();
		//for (int i = 0; i < args.length; i++) {
			try {
				controller.CreateDigraphs("documentation/Ex1_WantedAndWild.txt");
				controller.CreateDigraphs("documentation/Ex2_AMascaraDaMorteRubra.txt");
				controller.CreateDigraphs("documentation/Ex3_LuarDoSertao.txt");
				controller.CreateDigraphs("documentation/Ex4_Parabens.txt");
				controller.CreateDigraphs("documentation/Ex5_TresMotivosParaVacinarSeuPet.txt");
			} catch (IOException e) {
				System.out.println("It was not possible to find file ");
			}
		//}
	}

	private final String currentDirectory = System.getProperty("user.dir");

	private String getPath(String file) {
		return Paths.get(currentDirectory, "documentation", file).toString();
	}
}
