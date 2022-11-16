package chapterTwo;

import java.util.Scanner;

public class SeparateNumber{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int number, number1, number2, number3, number4, number5;

        System.out.print("Enter a number with 5 digits number: ");
        number = in.nextInt();

        number1 = number / 10000;
        number2 = (number % 10000) / 1000;
        number3 = ((number % 10000) % 1000) / 100;
        number4 = (((number % 10000) % 1000) % 100) / 10;
        number5 = (((number % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%s%d%s%d%s%d%s%d%n", number1, " ", number2, " ", number3, " ", number4, " ", number5);
 

   }


}