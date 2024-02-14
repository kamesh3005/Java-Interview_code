package javaprogram;

public class MissingNumberinArray {

	public static int missingNumber(int num[], int totalcount) {

		// formula n*(n+1)/2
		int expSum = totalcount * (totalcount + 1) / 2;
		int actualSum = 0;
		for (int i : num) {
			actualSum += i;

		}
		return expSum - actualSum;
	}

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int i = missingNumber(num, 10);
		System.out.println(i);

	}

}
