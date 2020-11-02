package digraph;

import java.io.IOException;
import java.nio.file.Paths;

public class StartProgram {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++) {
			try {
				Controller controller = new Controller(args[i]);
				controller.CreateDigraphs();
			} catch (IOException e) {
				System.out.println("It was not possible to read the file");
			}
		}
	}

	private final String currentDirectory = System.getProperty("user.dir");

	private String getPath(String file) {
		return Paths.get(currentDirectory, "documentation", file).toString();
	}
}
