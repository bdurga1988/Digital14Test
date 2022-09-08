package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringWriterTest {

    StringWriter stringWriter = new StringWriter();

    @Test
    void writeWithoutAdditionalActions() {
        stringWriter.write("This is is really stupid");
        stringWriter.write(" is good");
        stringWriter.close();
        assertEquals("This is is really stupid is good", stringWriter.get(), "content should be equal");
    }

    @Test
    void writeAdditionalActions() {
        stringWriter.write("This is is really stupid");
        stringWriter.write(" is good");
        stringWriter.duplicateRemover().stupidRemover();
        stringWriter.close();
        assertEquals("This is really s***** is good", stringWriter.get(), "content should be equal");
    }

    @Test
    void writeAfterClose() {
        stringWriter.write("This is is really stupid");
        stringWriter.write(" is good");
        stringWriter.duplicateRemover();
        stringWriter.close();
        stringWriter.write("after close");
        assertEquals("This is really stupid is good", stringWriter.get(), "content should be equal");
    }

    @Test
    void writeWithoutData() {
        stringWriter.write(null);
        stringWriter.duplicateRemover();
        stringWriter.close();
        assertEquals("", stringWriter.get(), "content should be equal");
    }
}