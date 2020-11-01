package digrafo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {
	public void CreateDigraphs(/*String args[]*/) throws IOException {
		ArchivesReader reader = new ArchivesReader();

		String currentDirectory = System.getProperty("user.dir");
		String pathReader = currentDirectory + "/documentation/Ex4_Parabens.txt";
		String pathWriter = currentDirectory + "/documentation/Ex4_Parabens.csv";

		ArrayList<String> words = reader.BreakTextIntoWords(pathReader);

		NodesCreator nodesCreator = new NodesCreator();

		Map<String, List<String>> nodes = nodesCreator.GroupByPreviousWord(words);

		ArchivesWriter writer = new ArchivesWriter();

		writer.WriteFile(pathWriter, nodes);
	}
}
