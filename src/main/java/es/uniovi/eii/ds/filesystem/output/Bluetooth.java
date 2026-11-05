package es.uniovi.eii.ds.filesystem.output;

import java.io.StringWriter;

import es.uniovi.eii.ds.filesystem.Output;

public class Bluetooth implements Output {
    
    private String device;
    private StringWriter output;

    public Bluetooth(String device) {
        this.device = device;
    }

    @Override
    public void open() {
        output = new StringWriter();
        output.append("\n--- START Bluetooth [" + device + "]\n");
    }

    @Override
    public void write(char c) {
        output.append(c);
    }

    @Override
    public void close() {
        System.out.println(output.toString());
        System.out.println("--- END   Bluetooth");
    }
}
