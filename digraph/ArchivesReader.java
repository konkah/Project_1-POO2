package digraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivesReader {
	public ArchivesReader(String path) throws IOException {
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferReader = new BufferedReader(fileReader);

		// Reads the first line of the file
		String line = bufferReader.readLine();

		while (line != null) {
			// change text to lower case and remove punctuation
			// to make a chart just with the words disregarding words case
			line = line.toLowerCase()
					.replace(".", "")
					.replace(",", "")
					.replace("\"", "")
					.replace("(", "")
					.replace(")", "")
					.replace(";", "")
					.replace("!", "")
					.replace("–", "")
					.replace("?", "")
					.replace(":", "")
					.replace("”", "")
					.replace("“", "");

			// split to separate text words
			String[] lineWords = line.split(" ");

			for (int i=0; i<lineWords.length; i++) {
				if (!lineWords[i].isEmpty()) {
					words.add(lineWords[i]);
				}
			}

			// read next line
			line = bufferReader.readLine();
		}

		bufferReader.close();
		fileReader.close();
	}

	private final ArrayList<String> words = new ArrayList<String>();

	public ArrayList<String> getWords() {
		return words;
	}
}
