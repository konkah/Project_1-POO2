package digrafo;

import java.io.*;
import java.util.Collection;
import java.util.Map;

public class ArchivesWriter {
    public void WriteFile(String path, Map<String, Collection<String>> nodes) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < nodes.size(); i++) {
            String key = nodes.keySet().toArray()[i].toString();

            bufferWriter.write(key);

            Collection<String> values = nodes.get(key);

            for (int j = 0; j < values.size(); j++) {
                bufferWriter.write(", ");
                bufferWriter.write(values.toArray()[j].toString());
            }

            bufferWriter.write("\n");
        }

        bufferWriter.close();
        fileWriter.close();
    }
}
