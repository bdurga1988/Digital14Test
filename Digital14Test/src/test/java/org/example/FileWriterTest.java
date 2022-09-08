package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    FileWriter fileWriter = new FileWriter();

    @Test
    void write() {
        fileWriter.write("This is is really stupid");
        fileWriter.write(" is good");
        fileWriter.close();
        assertEquals("This is is really stupid is good", fileWriter.get(), "content should be equal");
    }

    @Test
    void writeAdditionalActions() {
        fileWriter.write("This is is really stupid");
        fileWriter.write(" is good");
        fileWriter.duplicateRemover().stupidRemover();
        fileWriter.close();
        assertEquals("This is really s***** is good", fileWriter.get(), "content should be equal");
    }

    @Test
    void writeAfterClose() {
        fileWriter.write("This is is really stupid");
        fileWriter.write(" is good");
        fileWriter.duplicateRemover();
        fileWriter.close();
        fileWriter.write("after close");
        assertEquals("This is really stupid is good", fileWriter.get(), "content should be equal");
    }

    @Test
    void writeWithoutData() {
        fileWriter.write(null);
        fileWriter.duplicateRemover();
        fileWriter.close();
        assertEquals("", fileWriter.get(), "content should be equal");
    }
}