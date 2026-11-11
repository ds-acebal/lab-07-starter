package es.uniovi.eii.ds.filesystem.output;

import es.uniovi.eii.ds.filesystem.Output;

public class Bluetooth implements Output {
    
    private String device;

    public Bluetooth(String device) {
        this.device = device;
    }

    @Override
    public void open() {
        System.out.println("--- START Bluetooth [" + device + "]");
    }

    @Override
    public void write(char c) {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println("--- END   Bluetooth\n");
    }
}
