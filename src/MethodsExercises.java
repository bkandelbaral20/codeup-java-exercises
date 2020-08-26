import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println("The addition of 3 + 4 is : " + Addition(3, 4));
//        System.out.println("The subtraction of 5 - 2 is : " + Subtraction(5, 2));
//        System.out.println("The Multiplication is : " + Multiplication(2, 5));
//        System.out.println("The division of 50 by 2 is : " + Division(50, 2));
//        System.out.println("The modulus  of 11 by 4 is : " + Modulus(11, 2));
//        System.out.println("The integer is  : " + getInteger(1, 10));
//        System.out.println("The factorial of 9 is " + factorialNumber(9));
//        System.out.println(MultiplicationRecursively(5, 3));
    }

    //Addition method
//    public static double Addition(double x, double y) {
//        return x + y;
//    }

    //Subtraction method
//    public static double Subtraction(double x, double y) {
//        return x - y;
//    }

    //    // Multiplication method
//    // Create your multiplication method without the * operator (Hint: a loop might be helpful)
//    // Do the above with recursion.
//    public static double Multiplication(double x, double y) {
//        double result = 0;
//        for (int i = 0; i < y; i++) {
//            result += x;
//        }
//        return result;
//    }

//    public static int MultiplicationRecursively(int a, int b) {
//        int product = 0;
//        if (a > 0) {
//            product = (b + MultiplicationRecursively(a - 1, b));
//        } else if (a < 0) {
//            product = (0 - b) + MultiplicationRecursively(a + 1, b);
//        }
//        return product;
//
//    }

    //    //Division method
//    public static double Division(double x, double y) {
//        return x / y;
//    }

    //    //Modulus method
//    public static double Modulus(double x, double y) {
//        return x % y;
//    }

    //Create a method that validates that user input is in a certain range
//    public static int getInteger(int min, int max) {
//        // i.e. see if number is between 1 and 10
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter a valid int number here between 1 - 10 :");
//        boolean doAgain = false;
//        int num = 0;
//        do {
//            num = scanner.nextInt();
//            if (num < min || num > max) {
//                System.out.printf("The integer %d is out of range\n", num);
//                System.out.printf("Enter an integer between %d and %d: ", min, max);
//            } else {
//                doAgain = true;// they did enter a number within range, so break while
//            }
//        } while (doAgain); // if we get a correct number (1 < x < 10), break out of while
//        return num;
//    }


    //Calculate the factorial of a number
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.

    public static long factorialNumber(int num)  {
        // factorial(5) = 5 * 4 * 3 * 2 * 1
        int factorial = 1;
        int previousFactorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial * i;
        }
        return  factorial;
    }

//    Create an application that simulates dice rolling.
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants
//    to roll the dice again.
//    Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


}