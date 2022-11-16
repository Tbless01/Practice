package chapterTwo;

import java.util.Scanner;

	public class Comparison1{


	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.println("Enter first number");

	int highestNumber = input.nextInt();
	int lowestNumber = highestNumber;

	System.out.println("Enter second number");

	int userInput = input.nextInt();
	if(userInput > highestNumber) highestNumber = userInput;
	if(userInput < lowestNumber) lowestNumber = userInput;

	System.out.println("Enter third number");

	userInput = input.nextInt();
	if(userInput > highestNumber) highestNumber = userInput;
	if(userInput < lowestNumber) lowestNumber = userInput;

	System.out.println("Enter fourth number");

	userInput = input.nextInt();
	if(userInput > highestNumber) highestNumber = userInput;
	if(userInput < lowestNumber) lowestNumber = userInput;

	System.out.println("Enter fifth number");

	userInput = input.nextInt();
	if(userInput > highestNumber) highestNumber = userInput;
	if(userInput < lowestNumber) lowestNumber = userInput;


	
	System.out.printf("LowestNumber is %d%n HighestNumber is %d%n", lowestNumber, highestNumber);




	}

}