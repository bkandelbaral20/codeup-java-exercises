import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //Printing the value of pie in 2 decimal place
        double pi = 3.14159;
        System.out.printf( "The value of pi is approximately " + "%.2f", pi);

        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println(userInput + " is the number, that user typed");

        //Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.


    }
}