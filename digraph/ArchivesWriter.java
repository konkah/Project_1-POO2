package digraph;

import java.io.*;
import java.util.Collection;
import java.util.Map;

public class ArchivesWriter {
    public ArchivesWriter(String path, Map<String, Collection<String>> nodes) {
        this.path = path;
        this.nodes = nodes;
    }

    private final String path;
    private final Map<String, Collection<String>> nodes;
    private String error;

    public void writeFile() {
        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter(path);
        } catch (IOException e) {
            error = "File '" + path + "' not found or cannot be written";
            return;
        }

        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
        boolean written;

        for (int i = 0; i < nodes.size(); i++) {
            String key = getByPosition(nodes.keySet(), i);

            written = write(bufferWriter, key);
            if (!written) return;

            Collection<String> values = nodes.get(key);

            for (int j = 0; j < values.size(); j++) {
                written = write(bufferWriter, ", ");
                if (!written) return;

                written = write(bufferWriter, getByPosition(values, j));
                if (!written) return;
            }

            written = write(bufferWriter, "\n");
            if (!written) return;
        }

        try {
            bufferWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            error = "Error trying to close file '" + path + "'";
        }
    }

    private String getByPosition(Collection<String> strings, int position) {
        return strings.toArray()[position].toString();
    }

    private boolean write(BufferedWriter bufferWriter, String key) {
        try {
            bufferWriter.write(key);
            return true;
        } catch (IOException e) {
            error = "File '" + path + "' cannot be written";
            return false;
        }
    }

    public String getError() {
        return error;
    }
}
