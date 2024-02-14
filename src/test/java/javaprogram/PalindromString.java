package javaprogram;

public class PalindromString {

	public static void main(String[] args) {

		String name = "morning";
		String rev = "";
		String org_string;
		org_string = name;

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}

		if (org_string.equals(rev)) {

			System.out.println(org_string + " is Palindrome String");
		} else {

			System.out.println(org_string + " is Not-Palindrome String");
		}

	}

}
