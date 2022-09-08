package org.example;

public class StringWriter extends Writer {

    public StringWriter() {
        super();
    }

    @Override
    public void write(String val) {
        if (data == null)
            data = new StringBuffer();
        if (!closed && val !=null)
            data.append(val);
    }

    @Override
    public String get() {
        return data.toString();
    }
}
