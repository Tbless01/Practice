package chapterTwo;

import java.util.Scanner;

	public class SmallerRemainder{

		public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Input the first Number: ");
		int firstNumber = scan.nextInt();

		System.out.print("Input the second Number: ");
		int secondNumber = scan.nextInt();


		int firstRemainder = firstNumber % 6;		
		int secondRemainder = secondNumber % 6;

		if (firstNumber > secondNumber){
		System.out.printf("Result %s%n", firstNumber );
		}
		if (firstNumber < secondNumber){
		System.out.printf("Result %s%n", secondNumber );
		}
		
		if (firstNumber == secondNumber){
		System.out.println("Result 0 ");
		}

		if (firstRemainder == secondRemainder && firstNumber < secondNumber){
		System.out.printf("Result %s%n", firstNumber);
		}
		if (firstRemainder == secondRemainder && firstNumber < secondNumber){
		System.out.printf("Result %s%n", secondNumber);
		}



		
	}




}