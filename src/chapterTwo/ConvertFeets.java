package chapterTwo;

import java.util.Scanner;

	public class ConvertFeets{

		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double number = input.nextDouble();

		
		double totalNumber = number * 0.305;
		

		System.out.printf("%s feet is %s meters", number, totalNumber );




	}


}