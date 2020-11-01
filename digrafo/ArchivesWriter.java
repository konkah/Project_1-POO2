package digrafo;

import java.io.*;
import java.util.List;
import java.util.Map;

public class ArchivesWriter {
    public void WriteFile(String path, Map<String, List<String>> nodes) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < nodes.size(); i++) {
            String key = nodes.keySet().toArray()[i].toString();

            bufferWriter.write(key);

            List<String> values = nodes.get(key);

            for (int j = 0; j < values.size(); j++) {
                bufferWriter.write(", ");
                bufferWriter.write(values.get(j));
            }

            bufferWriter.write("\n");
        }

        bufferWriter.close();
        fileWriter.close();
    }
}
