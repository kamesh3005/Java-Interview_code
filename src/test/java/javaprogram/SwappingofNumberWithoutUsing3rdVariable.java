package javaprogram;

public class SwappingofNumberWithoutUsing3rdVariable {

	public static void main(String[] args) {

		int a = 19;
		int b = 10;
		System.out.println("Before Swapping a=" + a + " " + "b=" + b);

		a = a + b;// a=19+10=29
		b = a - b;// b=29-10=19
		a = a - b;// a=29-19=10

		System.out.println("After Swapping a=" + a + " " + "b=" + b);

	}

}
