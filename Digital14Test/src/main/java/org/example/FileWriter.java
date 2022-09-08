package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter extends Writer {

    private static final String FILE_NAME = "digital14.txt";
    BufferedWriter bw;

    public FileWriter() {
        super();
        try {
            bw = Files.newBufferedWriter(Path.of(FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(String val) {
        if (!closed && val != null)
            data.append(val);
    }

    @Override
    String get() {
        File file = new File(FILE_NAME);
        writeToFileAfterAdditionalFutures();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private void writeToFileAfterAdditionalFutures() {
        try {
            bw.write(data.toString());
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
