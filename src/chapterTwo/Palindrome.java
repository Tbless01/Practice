package chapterTwo;

import java.util.Scanner;

	public class Palindrome{

		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three(3) digits number: ");
		int number = input.nextInt();

		int firstDigit = number / 100;
		int secondDigit = number %10;

	if (firstDigit == secondDigit){
System.out.printf("%s is a palindrome", number);}

	if (firstDigit != secondDigit){
System.out.printf("%s is NOT a palindrome", number);

}


	}


}