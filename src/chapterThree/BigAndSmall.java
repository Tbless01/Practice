package chapterThree;

import java.util.Scanner;

public class BigAndSmall{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;

        do {

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            System.out.println("Enter number: ");
            number = input.nextInt();
        }
        while (number != 0);

        System.out.println("largest number is " + largest);
        System.out.println("smallest number is " + smallest);
    }
}
