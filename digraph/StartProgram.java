package digraph;

import java.nio.file.Paths;

public class StartProgram {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++) {
			createDigraph(args[i]);
		}
	}

	private static void createDigraph(String path) {
		Controller controller = new Controller(path);
		controller.createDigraph();
		String error = controller.getError();

		if (error != null) {
			System.out.println(error);
		}
	}

	private static final String currentDirectory = System.getProperty("user.dir");

	private static String getPath(String file) {
		return Paths.get(currentDirectory, "documentation", file).toString();
	}
}
