package digraph;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Controller {
	public Controller(String path) {
		pathReader = path;
		pathWriter = path.replace(".txt", ".csv");
	}

	private String error;
	private final String pathReader;
	private final String pathWriter;

	public void createDigraph() {
		ArchivesReader reader = new ArchivesReader(pathReader);
		String error = reader.getError();
		List<String> words = reader.getWords();

		if (error != null) {
			this.error = error;
			return;
		}

		NodesCreator nodesCreator = new NodesCreator(words);
		Map<String, Collection<String>> nodes = nodesCreator.getNodes();

		ArchivesWriter writer = new ArchivesWriter(pathWriter, nodes);
		writer.writeFile();
		this.error = writer.getError();
	}

	public String getError() {
		return error;
	}
}
