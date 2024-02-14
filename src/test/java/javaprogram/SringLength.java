package javaprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SringLength {



	


	public static void main(String[] args) {
		String str = "Automation";
		System.out.println(str.toCharArray().length);

		System.out.println(str.lastIndexOf(""));
		Matcher matcher = Pattern.compile("$").matcher(str);
		matcher.find();
		int end = matcher.end();
		System.out.println(end);
		System.out.println(str.split("").length);
		int l = new StringBuilder(str).length();
		System.out.println(l);

		int count = 0;
		for (char c : str.toCharArray()) {

			count++;
		}
		System.out.println(count);
		
	}

}
