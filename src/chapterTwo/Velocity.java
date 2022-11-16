package chapterTwo;

import java.util.Scanner;

	public class Velocity{

		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the starting velocity (Meter/Second)");
		double V0 = input.nextDouble();

		System.out.println("Enter the ending velocity (Meter/Second)");
		double V1 = input.nextDouble();


		System.out.println("Enter the time span t (Second)");
		double t = input.nextDouble();

		double V = V1 - V0 * 1.0 ;
		double a = V / t;

		System.out.printf("The average acceleration is %s", a );




	}


}