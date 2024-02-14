package javaprogram;

public class FindMinAndMaxFromPositiveNumber {

	public static void maxNumber(int a, int b, int c) {
		int max = 0;
		while (a > 0 || b > 0 || c > 0) {
			a--;
			b--;
			c--;
			max++;

		}
		System.out.println(max);

	}

	public static void minNumber(int a, int b, int c) {

		int min = 0;
		while (a > 0 && b > 0 && c > 0) {
			a--;
			b--;
			c--;
			min++;

		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		//maxNumber(12, 10, 8);
		//maxNumber(12, 100, 81);
		//maxNumber(0, 89, 8);
		//maxNumber(0, 0, 8);
		//maxNumber(12, 12, 8);
		//maxNumber(12, 10, 109);
		minNumber(12, 10, 6);

	}

}
