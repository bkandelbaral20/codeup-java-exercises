package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    //creating constructor of an class
    public Input() {
        this.scan = new Scanner(System.in);
    }

    //creating String get String() method
    public String getString() {
        String userInput = "";
        System.out.println("please type here: ");
         userInput = scan.next();
        return userInput;
    }

    //boolean yesNo() method
    public boolean yesNo() {
        System.out.println("Please enter the boolean value here:");
        String userInput1 = scan.next();
        if (userInput1.equalsIgnoreCase("yes") || userInput1.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    //int getInt(int min, int max) method
    public int getInt(int min, int max) {
        // i.e. see if number is between 1 and 10
        System.out.println("please enter a int number here between 1 - 10 :");
        boolean doAgain = true;
        int num = 0;
        do {
            num = scan.nextInt();
            if (num < min || num > max) {
                System.out.printf("\nThe integer %d is out of range\n", num);
                System.out.printf("Enter an integer between %d and %d: ", min, max);
            } else {
                doAgain = false; // they did enter a number within range, so break while
            }
        } while (doAgain); // if we get a correct number (1 < x < 10), break out of while
        return num;
    }


    //int getInt()
    public int getInt() {
        System.out.println("Please enter another int number here:");
        int num = 0;
        num = scan.nextInt();
        return num;
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a double type of number here range from 1-10:");
        boolean doAgain = true;
        double num = 0;
        do {
            num = scan.nextDouble();
            if (num < min || num > max) {
                System.out.printf("\nThe integer %d is out of range\n", num);
                System.out.printf("Enter an integer between %d and %d: ", min, max);
            } else {
                doAgain = false; // they did enter a number within range, so break while
            }
        } while (doAgain); // if we get a correct number (1 < x < 10), break out of while
        return num;
    }

    //double getDouble()
    public double getDouble() {
        System.out.println("Please enter the double type of number here:");
        double num = 0;
        num = scan.nextDouble();
        return num;
    }
}