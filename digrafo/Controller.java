package digrafo;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Controller {
	public void CreateDigraphs(/*String args[]*/) throws IOException {
		ArchivesReader reader = new ArchivesReader();

		String pathReader = getPath("Ex4_Parabens.txt");
		String pathWriter = getPath("Ex4_Parabens.csv");

		ArrayList<String> words = reader.BreakTextIntoWords(pathReader);

		NodesCreator nodesCreator = new NodesCreator();

		Map<String, Collection<String>> nodes = nodesCreator.GroupByPreviousWord(words);

		ArchivesWriter writer = new ArchivesWriter();

		writer.WriteFile(pathWriter, nodes);
	}

	private final String currentDirectory = System.getProperty("user.dir");

	private String getPath(String file) {
		return Paths.get(currentDirectory, "documentation", file).toString();
	}
}
