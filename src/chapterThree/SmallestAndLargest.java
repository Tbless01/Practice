package chapterThree;

import java.util.Scanner;

public class SmallestAndLargest{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to input? ");
        int totalNumbers = scan.nextInt();

        int smallest = 0;
        int biggest = 0;

        for (int input = 1 ; input <= totalNumbers; input++) {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            smallest = biggest;
            if (number > biggest){
                biggest = number;}
            if (number < smallest){
                smallest = number;}
        }
        System.out.println("biggest number is: " + biggest);
        System.out.println("smallest number is: " + smallest);

    }
}

