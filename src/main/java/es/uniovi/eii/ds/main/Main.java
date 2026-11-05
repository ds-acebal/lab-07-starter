package es.uniovi.eii.ds.main;

import es.uniovi.eii.ds.filesystem.FileSystem;
import es.uniovi.eii.ds.filesystem.output.*;

public class Main {
	
	public static void main(String[] args) {
		
		FileSystem system = new FileSystem();

		system.copy("private.txt", new Disk("copy.txt"));
		system.copy("private.txt", new Internet("156.35.233.143"));
		system.copy("private.txt", new Bluetooth("César's iPhone"));

		//-- Initial redesign --------------------------------

		print("Initial redesign");
		// ...

		//-- Modification 1 ----------------------------------

		print("Modification 1");
		// ...

		//-- Modification 2 ----------------------------------

		print("Modification 2");
		// ...

		//-- Modification 3 ----------------------------------

		print("Modification 3");
		// ...

		//-- Modification 4 ----------------------------------

		print("Modification 4");
		// ...

		// -- Modification 5 ----------------------------------

		print("Modification 5");
		// ...
	}

	private static void print(String message) {
		System.out.println("\n\n\n---------- " + message + " ----------");
	}
}
