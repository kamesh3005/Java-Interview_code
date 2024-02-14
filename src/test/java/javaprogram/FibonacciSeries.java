package javaprogram;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1;

		System.out.print(n1 + " " + n2);
		int sum = 0;
		for (int i = 2; i <10; i++) {

			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.print(" " + sum);

		}

	}

}
