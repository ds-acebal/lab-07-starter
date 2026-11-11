package es.uniovi.eii.ds.filesystem.output;

import java.io.*;

import es.uniovi.eii.ds.filesystem.Output;

public class Disk implements Output {

    private String filename;
    private FileWriter output;

    public Disk(String filename) {
        this.filename = filename;
    }

    @Override
    public void open() {
        try {
            output = new FileWriter(filename);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }   

    @Override
    public void write(char c) {
        try {
            output.append(c);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void close() {
        try {
            output.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
