package chapterTwo;

import java.util.Scanner;

	public class ConvertPounds{

		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		double number = input.nextDouble();

		
		double totalNumber = number * 0.454;
		

		System.out.printf("%s pounds is %s kilograms", number, totalNumber );




	}


}