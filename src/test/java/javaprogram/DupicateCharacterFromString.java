package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupicateCharacterFromString {

	public static void main(String[] args) {

		String name = "madam";
		char[] word = name.toCharArray();
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (Character w : word) {

			if (hmap.containsKey(w)) {
				hmap.put(w, hmap.get(w) + 1);

			} else {

				hmap.put(w, 1);
			}
		}

		// to print the map....
		Set<Entry<Character, Integer>> entrySet = hmap.entrySet();
		for (Entry<Character, Integer> entery : entrySet) {

			if (entery.getValue() > 1) {
				System.out.println(entery.getKey() + " :" + entery.getValue());

			}
		}

	}

}
