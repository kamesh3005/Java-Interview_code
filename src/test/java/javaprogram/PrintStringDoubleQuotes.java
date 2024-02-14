package javaprogram;

public class PrintStringDoubleQuotes {

	public static String getXpath(String name) {

		String xpath = "//[@id='" + name + "']";
		return xpath;

	}

	public static void main(String[] args) {
		System.out.println(getXpath("kamesh"));
		System.out.println(getXpath("charu"));
		System.out.println(getXpath("dinesh"));
		System.out.println(getXpath("rajan"));
		System.out.println(getXpath("kumar"));

	}

}
