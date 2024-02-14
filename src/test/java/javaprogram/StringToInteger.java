package javaprogram;

public class StringToInteger {

	// ASCII value
	// 0-9---->48 to 57

	public static int stringToInt(String str) {
		int num = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {

			// formula
			num = num * 10 + ((int) str.charAt(i) - 48);

		}
		return num;

	}

	public static void main(String[] args) {

		String str = "123";
		// System.out.println(Integer.parseInt(str)+10);
		System.out.println(stringToInt(str)+10);

	}

}
