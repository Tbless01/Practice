package chapterThree;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int multiplier = 1; multiplier <= 12; multiplier++){
            System.out.printf("%d * %d = %d%n", number, multiplier, (number * multiplier));
        }

    }
}
