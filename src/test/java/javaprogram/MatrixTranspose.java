package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row in the matrix....");
		int no_rows = sc.nextInt();
		System.out.println("Enter the number of coloum in the matrix....");
		int no_colu = sc.nextInt();
		int[][] matrix = new int[no_rows][no_colu];
		int[][] transpose = new int[no_colu][no_rows];

		System.out.println("Enter the data for the matrix...");
		for (int i = 0; i < no_rows; i++) {
			for (int j = 0; j < no_colu; j++) {
				matrix[i][j] = sc.nextInt();

			}

		}
		System.out.println("Print input the matrix...");
		for (int i = 0; i < no_rows; i++) {
			for (int j = 0; j < no_colu; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();

		}

		for (int i = 0; i < no_rows; i++) {
			for (int j = 0; j < no_colu; j++) {
				transpose[j][i] = matrix[i][j];// transpose the matrix

			}

		}
		System.out.println("print the transpose matrix...");
		for (int[] r : transpose) {

			System.out.println(Arrays.toString(r));
		}

	}
}