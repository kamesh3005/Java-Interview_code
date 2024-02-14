package javaprogram;

public class AmstrongNumber {

	public static boolean isAmstrongNumber(int num) {

		if (num < 0) {
			return false;

		}
		if (num >= 0 && num <= 9) {
			return true;
		}

		int power = power(num);
		int copynum = num;
		int sum = 0;
		while (copynum != 0) {

			int lastDigit = copynum % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {

				factor = factor * lastDigit;
			}
			sum = sum + factor;
			copynum = copynum / 10;
		}
		if (sum == num) {
			return true;

		}
		return false;
	}

	private static int power(int num) {
		int n = 0;
		while (num != 0) {

			n++;
			num = num / 10;
		}

		return n;

	}

	public static void main(String[] args) {

		// System.out.println(isAmstrongNumber(0));
		//System.out.println(isAmstrongNumber(9));
		// System.out.println(isAmstrongNumber(-1));
		System.out.println(isAmstrongNumber(153));

	}

}
