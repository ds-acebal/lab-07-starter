package es.uniovi.eii.ds.filesystem;

import java.io.*;

public class FileSystem {

	public void copy(String name, Output output) {
		try (FileReader reader = new FileReader(name)) {
			output.open();

			int c;
			while ((c = reader.read()) != -1) {
				output.write((char) c);
			}

		} catch (IOException e) {
			throw new UncheckedIOException(e);
		} finally {
			output.close();
		}
	}
}