package javaprogram;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) {
		String name[] = { "java", "python", "orcal", "mysql", "vb", "java", "orcal" };

		System.out.println("**************HashMap******************");

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String nam : name) {
			Integer count = hmap.get(nam);
			if (count == null) {

				hmap.put(nam, 1);
			} else {

				hmap.put(nam, ++count);
			}

		}
		Set<Entry<String, Integer>> entrySet = hmap.entrySet();

		for (Entry<String, Integer> enter : entrySet) {
			if (enter.getValue() > 1) {
				System.out.println(enter.getKey());

			}

		}

	}

}
