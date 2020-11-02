package digraph;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Controller {
	public Controller(String path) {
		pathReader = path;
		pathWriter = path.replace(".txt", ".csv");
	}

	private final String pathReader;
	private final String pathWriter;

	public void CreateDigraphs() throws IOException {
		ArchivesReader reader = new ArchivesReader(pathReader);
		List<String> words = reader.getWords();

		NodesCreator nodesCreator = new NodesCreator(words);
		Map<String, Collection<String>> nodes = nodesCreator.getNodes();

		ArchivesWriter writer = new ArchivesWriter(pathWriter, nodes);
		writer.WriteFile();
	}
}
