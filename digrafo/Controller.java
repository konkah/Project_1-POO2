package digrafo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
	public void main(String args[]) throws IOException {
		ArchivesReader reader = new ArchivesReader();

		String currentDirectory = System.getProperty("user.dir");
		String path = currentDirectory + "/documentation/Ex4_Parabens.txt";

		ArrayList<String> textArchive = reader.BreakTextIntoWords(path);

		CreatKnots classKnots = new CreatKnots();

		List<String> textKnots = classKnots.AgroupAB(textArchive);
		System.out.println(textKnots);
	}
}
