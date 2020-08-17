package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        System.out.println("What would you like to do ?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category \n");

        System.out.println("Enter your choice :");
        Scanner scanner = new Scanner(System.in);
        Movie[] movies= MoviesArray.findAll();
        int userInput = scanner.nextInt();
        System.out.println("You entered :" + userInput);

            if (userInput == 0) {
                System.out.println("exist");
            } else if (userInput == 1) {
                System.out.println("view all the movies");
            } else if (userInput == 2) {
                System.out.println("view movies in the animated category");
            } else if (userInput == 3) {
                System.out.println("view movies in the drama category");
            } else if (userInput == 4) {
                System.out.println("view movies in the horror category");
            } else if (userInput == 5) {
                System.out.println("view movies in the scifi category");
            } else {
                System.out.println(userInput);
            }

        }
    }

