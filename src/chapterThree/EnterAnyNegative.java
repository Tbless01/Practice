package chapterThree;

import java.util.Scanner;

public class EnterAnyNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenNumber = 0;
        int oddNumber = 0;
        int number = 1;
        System.out.println("Enter a number, enter any negative number to exit: ");
        int digits = input.nextInt();
        while (digits >= 0) {
            if (digits % 2 == 0) {
                evenNumber = evenNumber + 1;
            } else {
                oddNumber = oddNumber + 1;
            }
            number = number + 1;
            System.out.println("Enter a number, enter any negative number to exit: ");
            digits = input.nextInt();
        }
        System.out.println("There are " + evenNumber + " even numbers");
        System.out.println("There are " + oddNumber + " odd numbers");

    }
}