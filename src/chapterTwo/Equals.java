package chapterTwo;

import java.util.Scanner;
	public class Equals{

		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = input.nextInt();

		System.out.println("Enter second number");
		int secondNumber = input.nextInt();

		System.out.println("Enter third number");
		int thirdNumber = input.nextInt();
		
		System.out.println("Enter fourth number");
		int fourthNumber = input.nextInt();


		if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber){
		System.out.println("Numbers are equal!");
		}
		
		else if (firstNumber != secondNumber && secondNumber != thirdNumber && thirdNumber != fourthNumber){
		System.out.println("Numbers are not equal!");
		}
			


	}




}