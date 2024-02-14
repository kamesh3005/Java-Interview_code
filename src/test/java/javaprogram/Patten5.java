package javaprogram;

public class Patten5 {

	public static void main(String[] args) {
				//A-Z:65 to 90
				//a-z: 97 to122
		int alpha = 65;//A=65,a=97
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alpha+i)  + " ");
			}
			//alpha +=1;
			System.out.println();
		}

	}

}
