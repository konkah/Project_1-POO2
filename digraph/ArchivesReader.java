package digraph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivesReader {
	public ArchivesReader(String path) {
		if (!path.endsWith(".txt")) {
			error = "File extension should be .txt, cannot process '" + path + "'";
			return;
		}

		this.path = path;

		FileReader fileReader;

		try
		{
			fileReader = new FileReader(path);
		} catch (FileNotFoundException e) {
			error = "File '" + path + "' not found";
			return;
		}

		BufferedReader bufferReader = new BufferedReader(fileReader);

		// Reads the first line of the file
		String line = getLine(bufferReader);

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
			line = getLine(bufferReader);
		}

		try {
			bufferReader.close();
			fileReader.close();
		} catch (IOException e) {
			error = "Error trying to close file '" + path + "'";
		}
	}

	private String getLine(BufferedReader bufferReader) {
		try {
			return bufferReader.readLine();
		} catch (IOException e) {
			error = "Cannot read file '" + path + "'";
			return null;
		}
	}

	private String path;
	private final ArrayList<String> words = new ArrayList<>();
	private String error;

	public ArrayList<String> getWords() {
		return words;
	}

	public String getError() {
		return error;
	}
}
