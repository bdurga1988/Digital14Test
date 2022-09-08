package org.example;

public class WriterDecorator extends Writer {

    protected Writer writer;

    public WriterDecorator(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(String val) {
        writer.write(val);
    }

    @Override
    public void close() {
        writer.close();
    }

    @Override
    public String get() {
        return writer.get();
    }
}
