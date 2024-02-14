package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int num[] = { 2, 5, 12, 10, 4, 23, 20, 82, 14, 9, 17 };
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the search element");
		int searchElement = sc.nextInt();

		int lower = 0;
		int upper = num.length-1;
		int middle = lower + upper / 2;
		boolean found = false;
		while (lower <= upper) {
			System.out.println("lower= " + lower + "upper= " + upper + "middle= " + middle);
			System.out.println("num[middle]= " + num[middle]);
			if (num[middle] == searchElement) {

				System.out.println("Element found at the position :" + middle);
				found = true;
				break;
			} else if (num[middle] < searchElement) {

				lower = middle + 1;
			} else if (num[middle] > searchElement) {

				upper = middle - 1;
			}
			middle = (upper + lower) / 2;

		}
		if (found == false) {

			System.out.println("Element not found...");
		}

	}

}
