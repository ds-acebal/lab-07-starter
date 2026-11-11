package es.uniovi.eii.ds.filesystem.output;

import es.uniovi.eii.ds.filesystem.Output;

public class Internet implements Output {
    
    private String url;

    public Internet(String url) {
        this.url = url;
    }

    @Override
    public void open() {
        System.out.println("--- START Internet [" + url + "]");
    }

    @Override
    public void write(char c) {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println("--- END   Internet\n");
    }
}
