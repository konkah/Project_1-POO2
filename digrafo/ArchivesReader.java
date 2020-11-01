package digrafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivesReader {
	public ArrayList<String> BreakTextIntoWords(String path) throws IOException {
		ArrayList<String> textWords = new ArrayList<String>();
		
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferReader = new BufferedReader(fileReader);

		// Faz a leitura da primeira linha de texto do arquivo
		String line = bufferReader.readLine();

		while (line != null) {
			// change text to lower case and remove punctuation
			// to make a chart just with the words disregarding words case
			line = line.toLowerCase()
					.replace(".", "")
					.replace(",", "")
					.replace("-", "")
					.replace("\"", "");

			// split to separate text words
			String[] lineWords = line.split(" ");

			for (int i=0; i<lineWords.length; i++) {
				textWords.add(lineWords[i]);
			}

			// read next line
			line = bufferReader.readLine();
		}

		bufferReader.close();
		fileReader.close();

		return textWords;
	}
}
