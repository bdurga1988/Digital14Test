package org.example;

import java.io.IOException;

public class WriterTest {

    public void writeToWriter(Writer writer) {
        writer.write("new new stupid content !!!");
        writer.write(" task for digital14");
        writer.close();
        writer.write(" digital14");
    }

    public static void main(String[] args) throws IOException {

        WriterTest test = new WriterTest();
        //Filewriter
        Writer writer = new FileWriter();
        test.writeToWriter(writer);
        writer.stupidRemover().uppercase().duplicateRemover();
        System.out.println(writer.get());

        //StringWriter
        writer = new StringWriter();
        test.writeToWriter(writer);
        writer.stupidRemover().uppercase().duplicateRemover();
        System.out.println(writer.get());
    }
}
