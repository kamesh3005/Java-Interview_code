package javaprogram;

public class ReverseNumber {

	public static void main(String[] args) {

		long num = 12345l;

		long rev = 0;
		while (num != 0) {
			long temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;

		}
		System.out.println(rev);

	}

}
