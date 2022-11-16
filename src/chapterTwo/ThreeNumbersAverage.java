package chapterTwo;

import java.util.Scanner;

	public class ThreeNumbersAverage{

		public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Input 1st Number: ");
		int firstNumber = scan.nextInt();

		System.out.print("Input 2nd Number: ");
		int secondNumber = scan.nextInt();

		System.out.print("Input 3rd Number: ");
		int thirdNumber = scan.nextInt();


		
		int average = (firstNumber + secondNumber + thirdNumber)/2;
		
	

		System.out.printf("Average of the numbers is %s%n", average );
		
		
	}




}