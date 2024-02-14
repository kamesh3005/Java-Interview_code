package javaprogram;

public class NumberCount {

	public static void main(String[] args) {
		long num = 1234567891029333983L;
		int count = 0;

		while (num != 0) {

			num = num / 10;
			count++;

		}
		System.out.println(count);
	}

}
