package chapterTwo;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = number % 2 ;

        if (result == 0){
            System.out.printf("%s is an even number", number);
        }
        if (result != 0){
            System.out.printf("%s is not an even number", number);
        }
    }
}
