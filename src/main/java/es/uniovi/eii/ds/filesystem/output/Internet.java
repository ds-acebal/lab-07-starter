package es.uniovi.eii.ds.filesystem.output;

import java.io.*;

import es.uniovi.eii.ds.filesystem.Output;

public class Internet implements Output {
    
    private String url;
    private StringWriter output;

    public Internet(String url) {
        this.url = url;
    }

    @Override
    public void open() {
        output = new StringWriter();
        System.out.println("\n--- START Internet [" + url + "]");
    }

    @Override
    public void write(char c) {
        output.append(c);
    }

    @Override
    public void close() {
        System.out.println(output.toString());
        System.out.println("--- END   Internet");
    }
}
