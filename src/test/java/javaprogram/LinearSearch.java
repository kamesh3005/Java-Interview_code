package javaprogram;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Element....");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter a arr[" + i + "]");
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the search Element....");
		int element = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {

				System.out.println("Element found at the position of " + i);
				found = true;
				break;
			}

		}
		if (found == false) {

			System.out.println("Element not found");
		}

	}

}
