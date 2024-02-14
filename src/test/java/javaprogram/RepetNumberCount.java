package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepetNumberCount {

	public static void getDigitCount(long num) {

		Map<Long, Integer> digmap = new HashMap<Long, Integer>();
		while (num != 0) {

			long lastdigit = num % 10;
			if (digmap.containsKey(lastdigit)) {

				digmap.put(lastdigit, digmap.get(lastdigit) + 1);
			} else {

				digmap.put(lastdigit, 1);
			}
			num = num / 10;

		}
		Set<Long> keySet = digmap.keySet();
		for (Long key : keySet) {

			System.out.println(" " + key + " -" + digmap.get(key));
		}
	}

	public static void main(String[] args) {
		getDigitCount(1212345167);

	}

}
