package digraph;

public class StartProgram {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			createDigraph(args[i]);
		}
	}

	private static void createDigraph(String path) {
		Controller controller = new Controller(path);
		controller.createDigraph();
		String error = controller.getError();

		if (error != null) {
			System.err.println(error);
		} else {
			System.out.println("File " + path + " processed successfully");
		}
	}
}
