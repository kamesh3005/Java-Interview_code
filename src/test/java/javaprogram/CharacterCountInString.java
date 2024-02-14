package javaprogram;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {

	public static void charCount(String str) {
		char[] word = str.toCharArray();
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (Character w : word) {
			if (hmap.containsKey(w)) {
				hmap.put(w, hmap.get(w) + 1);

			} else {
				hmap.put(w, 1);

			}

		}
		System.out.println(str + " :" + hmap);

	}

	public static void main(String[] args) {

		charCount("testing the application in the webbrowser");
	}

}
