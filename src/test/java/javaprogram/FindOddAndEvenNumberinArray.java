package javaprogram;

public class FindOddAndEvenNumberinArray {

	public static void main(String[] args) {

		int num[] = { 2, 1, 7, 3, 9, 8, 11, 17, 20, 26 };
		System.out.println("Even number is ");

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
				System.out.println();
			}

		}

		System.out.println("Odd number count is");

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 != 0) {

				System.out.print(num[i] + " ");
				System.out.println();
			}

		}

	}

}
