package javaprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContainCount {

	public static String path = "/home/kamesh/Desktop/demo.txt";

	public static void main(String[] args) throws IOException {
		int charcount = 0;
		int linecount = 0;
		int wordcount = 0;
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		// To read the line
		//It will read the first line
		String currentLine = reader.readLine().trim();
		while (currentLine != null) {

			linecount++;

			// words
			String[] word = currentLine.split(" ");
			wordcount = wordcount + word.length;

			// line:
			for (String w : word) {
				charcount = charcount + w.length();
			}
			currentLine = reader.readLine();
		}
		System.out.println("total no.of lines :" + linecount);
		System.out.println("total no.of words :" + wordcount);
		System.out.println("total no.of char :" + charcount);

	}

}
