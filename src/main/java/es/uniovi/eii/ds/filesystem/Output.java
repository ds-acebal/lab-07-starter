package es.uniovi.eii.ds.filesystem;

public interface Output {
    void open();
    void write(char c);
    void close();
}