package javaprogram;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String name = "        Welcom to      naveen      Automation      lab          " + " testing  "
				+ "  Automation " + " \n javascript \t";

		// System.out.println(name.trim());
		// System.out.println(name.replaceAll("\\s+", ""));
		// Approach 1
		String whiteSpace = "";
		for (int i = 0; i < name.length(); i++) {

			if ((name.charAt(i) != ' ') && (name.charAt(i) != '\t')) {
				whiteSpace = whiteSpace + name.charAt(i);

			}
		}
		System.out.println(whiteSpace);
		System.out.println("**********Approach 2************************");
		// Approach2
		System.out.println(name);
		String[] split = name.split("\\s");
		StringBuffer sb = new StringBuffer();
		for (String s : split) {
			sb.append(s);
		}
		System.out.println(sb);

	}

}
