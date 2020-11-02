package digraph;

import java.io.IOException;
import java.util.*;

public class Controller {
	public void CreateDigraphs(String pathReader) throws IOException {
		ArchivesReader reader = new ArchivesReader();

		String pathWriter = pathReader.replace(".txt", ".csv");

		ArrayList<String> words = reader.BreakTextIntoWords(pathReader);

		NodesCreator nodesCreator = new NodesCreator();

		Map<String, Collection<String>> nodes = nodesCreator.GroupByPreviousWord(words);

		ArchivesWriter writer = new ArchivesWriter();

		writer.WriteFile(pathWriter, nodes);
	}
}
