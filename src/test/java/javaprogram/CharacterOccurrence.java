package javaprogram;

public class CharacterOccurrence {

	public static void charCount(String str, char val) {

		int count = 0;

		for (Character s : str.toCharArray()) {

			if (s == val) {

				count++;
			}
		}
		System.out.println(val + " :" + count);
	}

	public static void countCharacter(String str, char val) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == val) {

				count++;
			}

		}
		System.out.println(val + " :" + count);

	}

	public static void main(String[] args) {

		String name = "kameshpichandi";
		countCharacter(name, 'e');

	}

}