package javaprogram;

public class SwapingOfNumberUsing3rdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;
		System.out.println("Befor Swapping a=" + a +" "+ " b=" + b);

		c = a;//c=10
		a = b;//a=20
		b = c;//b=10

		System.out.println("After swapping a= " + a + " "+ "b= " + b);

	}

}
