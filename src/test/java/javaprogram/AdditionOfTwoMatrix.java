package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count in the matrix..");
		int row = sc.nextInt();
		System.out.println("enter the coloum count in the matrix....");
		int colu = sc.nextInt();
		int matrix1[][] = new int[row][colu];
		int matrix2[][] = new int[row][colu];
		int sum[][] = new int[row][colu];

		System.out.println("add the data into the matrix1");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < colu; j++) {
				matrix1[i][j] = sc.nextInt();

			}
		}
		System.out.println("add the data into the matrix2");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < colu; j++) {
				matrix2[i][j] = sc.nextInt();

			}
		}
		System.out.println("print matrix1 data");
		for (int[] matx : matrix1) {
			System.out.println(Arrays.toString(matx));
		}
		System.out.println("print matrix2 data");
		for (int[] matx : matrix2) {
			System.out.println(Arrays.toString(matx));
		}
		System.out.println("sum of the two matrix");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < colu; j++) {

				sum[i][j] = matrix1[i][j] + matrix2[i][j];// adding two matrix
				System.out.print(sum[i][j] + " ");

			}
			System.out.println();
		}

	}

}
