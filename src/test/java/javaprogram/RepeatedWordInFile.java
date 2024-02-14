package javaprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class RepeatedWordInFile {

	public static String path = "/home/kamesh/Desktop/demo.txt";

	public static void main(String[] args) throws IOException {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		String currentLine = reader.readLine();

		while (currentLine != null) {
			String[] words = currentLine.toLowerCase().split(" ");

			for (String word : words) {

				if (!word.isBlank()) {

					if (hmap.containsKey(word)) {

						hmap.put(word, hmap.get(word) + 1);
					} else {

						hmap.put(word, 1);
					}
				}
			}
			currentLine = reader.readLine();

		}
		hmap.forEach((k,v)->System.out.println(k +" :"+v));

	}

}
