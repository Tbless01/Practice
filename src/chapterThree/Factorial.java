package chapterThree;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        for (int num = number - 1; num >= 1; num--) {
            number = number * num;}
            System.out.println("Factorial is " + number);
        }

}