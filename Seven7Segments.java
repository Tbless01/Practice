package SevenSegments;

import java.util.Scanner;

public class Seven7Segments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String[] light = new String[7];
        String binary = scanner.nextLine();
        int bin = Integer.parseInt(binary);

        for (int i = 0; i < light.length; i++) {
            if (bin == 1) {
                if (i % 3 == 0) {
                    light[i] = " # # # # ";
//                    System.out.println(light[i]);
                } else {
                    light[i] = "#";
                }
            }
            else {
                light[i] = " ";
            }
        }
        System.out.printf("""
                %s
                %s       %s
                %s
                %s       %s
                %s""",
                light[0], light[1], light[2],light[3], light[4], light[5],light[6]);
    }

}