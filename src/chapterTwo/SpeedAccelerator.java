package chapterTwo;

import java.util.Scanner;

	public class SpeedAccelerator{

		public static void main(String[] args){
			
		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed: ");
		double speed = input.nextDouble();

		System.out.print("Enter accelerator: ");
		double accelerator = input.nextDouble();
	
		
		double speedSquare = speed * speed;
		double acceleratorTwo = accelerator * 2;
		double length = speedSquare / acceleratorTwo;
		

		System.out.printf("The minimum runway length for this airplane is %s", length);




	}


}