package javaprogram;

public class SecondLargestInArray {

	public static void main(String[] args) {

		int numArr[] = { 2, 10, 12, 17, 21, 9, 41, 23, 8 };

		int largest = numArr[0];
		int sec_largest = 0;

		for (int i = 0; i < numArr.length; i++) {

			if (numArr[i] > largest) {

				sec_largest = largest;
				largest = numArr[i];
			} else if (numArr[i] > sec_largest) {

				sec_largest = numArr[i];
			}
		}
		System.out.println("Second Largest number is :" + sec_largest);
		System.out.println("Largest Number is : " + largest);

	}

}
