package digrafo;

import java.io.IOException;

public class StartProgram {
	public static void main(String args[]) {
		Controller controller = new Controller();
		try {
			controller.main(args);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
