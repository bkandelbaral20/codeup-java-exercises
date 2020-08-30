package javaPractise;

//Take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class PractiseOne {
    public static void  main(String[] args) {
        System.out.println("Please enter 3 numbers");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        System.out.println("The first number is " + firstNumber);
        int secondNumber = scan.nextInt();
        System.out.println("The second number is " + secondNumber);
        int thirdNumber = scan.nextInt();
        System.out.println("The third number is " + thirdNumber);

        // calculate which one is highest
        int highest;
        if (firstNumber > secondNumber) {
            highest = firstNumber;
        } else {
            highest = secondNumber;
        }

        // Now check between max and c
        if (thirdNumber > highest) {
            highest = thirdNumber;
        }

        return highest;
    }
}
