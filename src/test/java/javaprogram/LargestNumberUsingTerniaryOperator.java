package javaprogram;

import java.util.Scanner;

public class LargestNumberUsingTerniaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 numbers....");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int larg = num1 > num2 ? num1 : num2;
		int largest = larg > num3 ? larg : num3;
		System.out.println("The largest number is =" + largest);

	}

}
