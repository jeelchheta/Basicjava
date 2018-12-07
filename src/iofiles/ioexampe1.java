package iofiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ioexampe1 {
	public static void main(String args[]) throws IOException {

		// File ob = new File("C:\\Users\\Galaxy\\Downloads\\jarvis.png");
		// ob.createNewFile();
		// System.out.print("File is exsist " + ob.exists());

		File file = new File("C:\\Users\\Galaxy\\Downloads\\jarvis.txt");

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();

	}

}
