package chapterTwo;

import java.util.Scanner;

public class Comparison100{
		
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Input number");
	int inputNumber = input.nextInt();
	int total = inputNumber * inputNumber + inputNumber;


	int constantNumber = 100;

	if (total == constantNumber) {
	System.out.printf("%d == %d%n", total, constantNumber);
	}

	if (total != constantNumber){
	System.out.printf("%d != %d%n", total, constantNumber);
	}

	if (total > constantNumber){
	System.out.printf("%d > %d%n", total, constantNumber);
	}

	if (total < constantNumber){
	System.out.printf("%d < %d%n", total, constantNumber);
	}

	else if (total >= constantNumber){
	System.out.printf("%d >= %d%n", total, constantNumber);
	}

	else if (total <= constantNumber){
	System.out.printf("%d <= %d%n", total, constantNumber);
	}


	}



}