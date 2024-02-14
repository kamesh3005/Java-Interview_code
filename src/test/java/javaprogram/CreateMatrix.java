package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count in the matrix..");
		int row = sc.nextInt();
		System.out.println("enter the coloum count in the matrix....");
		int colu = sc.nextInt();
		int data[][] = new int[row][colu];

		System.out.println("add the data into the matrix");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < colu; j++) {
				data[i][j] = sc.nextInt();

			}
		}

		System.out.println("print the 2D matrix");

		// for (int i = 0; i < row; i++) {

		// for (int j = 0; j < colu; j++) {
		// System.out.print(data[i][j] + " ");

		// }
		// System.out.println();
		// }

		for (int[] d : data) {
			for (int x : d) {
				System.out.print(x + " ");

			}
			System.out.println();
		}
	}

}
