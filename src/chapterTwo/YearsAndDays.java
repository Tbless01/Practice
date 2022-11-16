package chapterTwo;

import java.util.Scanner;
	public class YearsAndDays{

		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		
		int number = input.nextInt();
		
		int year = number / (60*24*365);


		double firstDecimal = number / 525600.0;
		double decimalPoint = firstDecimal % 1.0;


		double first = decimalPoint * 365;
		double second = (decimalPoint * 365)% 1;
		double days = first-second;

		System.out.printf("%s minutes is approximately %s years and %s days", number, year, days );
			

		

	}




}