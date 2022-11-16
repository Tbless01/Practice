import java.util.Scanner;

public class SingleSelection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        if(userInput > 10){
            System.out.println("Out of Range");
        }
        else {if(userInput % 2 == 0)
            System.out.println("It is an even number");
            else {
            System.out.println("This is odd");
        }
        }
    }
}
