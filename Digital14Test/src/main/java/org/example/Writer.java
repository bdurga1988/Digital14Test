package org.example;

public abstract class Writer {

    StringBuffer data;
    boolean closed;

    public Writer() {
        this.data = new StringBuffer();
    }

    abstract void write(String val);

    void close(){
        closed = true;
    }

    abstract String get();

    Writer lowercase() {
        data = new StringBuffer(data.toString().toLowerCase());
        return this;
    }

    Writer uppercase() {
        data = new StringBuffer(data.toString().toUpperCase());
        return this;
    }

    Writer duplicateRemover() {
        data = new StringBuffer(data.toString().replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1"));
        return this;
    }

    Writer stupidRemover() {
        data = new StringBuffer(data.toString().replaceAll("stupid", "s*****"));
        return this;
    }
}