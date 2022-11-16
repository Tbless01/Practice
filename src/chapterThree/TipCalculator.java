package chapterThree;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\tWELCOME!!!");
        System.out.println("\tTO REGNOS INTERNATIONAL EATERY");
        System.out.println("");
        System.out.println("Here, we sell different kinds of delicious food and\ndeliver them right at your door step");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to order food");

        System.out.println("Press 2 to only make enquiry or know more about our eatery");
        System.out.print("==> input:");
        System.out.println("");
        int choiceOfFood = input.nextInt();
        int inquiry = 2;

        if (choiceOfFood == 1) {
            System.out.println("\tBelow are our varieties of food");
            System.out.println("Press 1 to order RICE\nPress 2 to order BEANS \nPress 3 to order RICE AND BEANS\nPress 4 to order AMALA\nPress 5 to order POUNDED YAM\nPress 6 to make enquiry or know more about our eatery");
        }
        else
            System.out.println("Thanks for visiting our site. For more enquiry");

        int option = input.nextInt();
        if (option == 1)System.out.println("Rice is available!!!\n A plate of rice is 1,500 only.\n How many plates would you like to order?");
        else if (option == 2) System.out.println("Beans is available!!!\n A plate of beans is 1,000 only. \n How many plates of beans would you like to order?");
        else if (option == 3) System.out.println("Rice AND Beans is available!!!\n A plate of rice and beans is 2,000 only. \n How many plates of rice and beans would you like to order?");
        else if (option == 4) System.out.println("Amala is available!!!\n A wrap of amala with soap is 1,200. \n How many wraps would you like to order?");
        else if (option == 5) System.out.println("Pounded Yam is available!!!\n A wrap of Pounded yam is 1000. \n How many wraps would you like to order?");
        else if (option == 6) System.out.println("Thanks for visiting our site. For more enquiry,");
        else System.out.println("Not available");

    }
}


