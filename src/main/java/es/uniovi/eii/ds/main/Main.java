package es.uniovi.eii.ds.main;

import es.uniovi.eii.ds.filesystem.FileSystem;

public class Main {
	
	public static void main(String[] args) {
		
		FileSystem system = new FileSystem();

		system.copyFile("private.txt", "copy.txt");
		system.sendToInternet("private.txt", "156.35.233.143");
		system.sendWithBluetooth("private.txt", "César's iPhone");

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
