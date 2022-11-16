package chapterTwo;

import java.util.Scanner;

	public class Multiples{

		public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("First Number");
		int firstNumber = scanner.nextInt();

		System.out.println("Second Number");
		int SecondNumber = scanner.nextInt();

		int firstNumberTripled = firstNumber * firstNumber * firstNumber;
		System.out.printf("Triple of first number is %d%n", firstNumberTripled );


		int SecondNumberDoubled = SecondNumber * SecondNumber;
		System.out.printf("Double of Second number is %d%n", SecondNumberDoubled );


		int remainder = SecondNumberDoubled % firstNumberTripled;
		System.out.printf("Remainder is %d%n", remainder);

		if (remainder != 0){
		System.out.print("Not a multiple");
	}

		else if (remainder == 0){
		System.out.print("It is a multiple");



	}

		

}


}