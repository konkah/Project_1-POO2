package digrafo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {
	public void CreateDigraphs(/*String args[]*/) throws IOException {
		ArchivesReader reader = new ArchivesReader();

		String currentDirectory = System.getProperty("user.dir");
		String path = currentDirectory + "/documentation/Ex4_Parabens.txt";

		ArrayList<String> words = reader.BreakTextIntoWords(path);

		NodesCreator nodesCreator = new NodesCreator();

		Map<String, List<String>> nodes = nodesCreator.GroupByPreviousWord(words);
	}
}
