package chapterTwo;

import java.util.Scanner;

	public class SumDigits{

		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int digits = input.nextInt();
	
		
		int first = (digits / 1000);
		int second = (digits / 100) % 10;
		int third = (digits / 10) %10;
		int fourth = digits % 10;
		int total = first + second + third + fourth;
		
		

		System.out.printf("The sum of digits is %s", total);




	}


}