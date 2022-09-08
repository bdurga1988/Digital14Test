package org.example;

import java.io.IOException;

public class WriterTest {

    public void writeToWriter(Writer writer) {
        writer.write("new new stupid content !!!");
        writer.write(" good job job durga");
        writer.close();
        writer.write(" maha maha");
    }

    public static void main(String[] args) throws IOException {

        WriterTest test = new WriterTest();
        Writer writer = new FileWriter();
        test.writeToWriter(writer);
        writer.stupidRemover().uppercase().duplicateRemover();
        System.out.println(writer.get());
    }
}
