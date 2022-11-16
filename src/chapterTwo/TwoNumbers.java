
package chapterTwo;

import java.util.Scanner;

	public class TwoNumbers{

		public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Input 1st Number");
		int firstNumber = scan.nextInt();

		System.out.println("Input 2nd Number");
		int secondNumber = scan.nextInt();

		
		int sum = firstNumber + secondNumber;
		int minus = firstNumber - secondNumber;
		int multiply = firstNumber * secondNumber;
		int divide = firstNumber / secondNumber;
		int remainder = firstNumber % secondNumber;
		


		System.out.printf("Output%n");
		System.out.printf("%s + %s = %s%n",firstNumber, secondNumber, sum);
		System.out.printf("%s - %s = %s%n",firstNumber, secondNumber, minus);
		System.out.printf("%s * %s = %s%n",firstNumber, secondNumber, multiply);
		System.out.printf("%s / %s = %s%n",firstNumber, secondNumber, divide);
		System.out.printf("%s mod %s = %s%n",firstNumber, secondNumber, remainder);
		

		
	}




}