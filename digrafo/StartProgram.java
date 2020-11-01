package digrafo;

import java.io.IOException;

public class StartProgram {
	public static void main(String args[]) {
		Controller controller = new Controller();
		try {
			controller.CreateDigraphs();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
