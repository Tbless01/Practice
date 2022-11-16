package chapterTwo;

import java.util.Scanner;
		
	public class BMICalc{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Weight (Pounds)");
	int weightInPounds = input.nextInt();

	System.out.println("Height (Inches)");
	int heightInInches = input.nextInt();


	int weightTotal = weightInPounds * 703;
	int heightByTwo = heightInInches * heightInInches;

	int BMITotal = weightTotal / heightByTwo;

	System.out.printf("Your Body Mass Index is %s%n", BMITotal );


	if (BMITotal < 18.5){
	System.out.println("You are in the underweight range");


	} else if (BMITotal >= 18.5 && BMITotal <= 24.9){
	System.out.println("You are in the healthy range");


 	} else if (BMITotal >= 25 && BMITotal <= 29.9){
	System.out.println("You are in the overweight range");


	} else if (BMITotal >= 30 && BMITotal <= 39.9){
	System.out.println("You are in the obese range");
}
	
	



}






}
