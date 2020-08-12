
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //loop basics
//      a.  While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
        doWhile();
        forLoop();
        FizzBuzz();
        Tables();
        gradesNumber();
    }


    // b. Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while
//        the number is less than 1,000,000. Output should equal:

    public static void doWhile() {

        //1.
        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i < 100);
//
        //2.
        int j = 100;
        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);

        // 3.
        int k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);
    }

    public static void forLoop() {
        for (int i = 0; i <= 15; i += 2) {
            System.out.println("i is " + i);
        }
    }

    //c.FizzBuzz
//     One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory,
//     the test is designed to assess basic looping and conditional logic skills.
//    Write a program that prints the numbers from 1 to 100.
//    For multiples of three: print “Fizz” instead of the number.
//    For the multiples of five: print “Buzz”.
//    For numbers which are multiples of both three and five: print “FizzBuzz”.

    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

//    Display a table of powers.
//    Prompt the user to enter an integer.
//    Display a table of squares and cubes from 1 to the value entered.
//    Ask if the user wants to continue.
//    Assume that the user will enter valid data.
//    Only continue if the user agrees to.

    public static void Tables() {
        Scanner scanner = new Scanner(System.in);
        String userResponse;
        do {
            System.out.print("Enter an integer here:");
            int userInteger = scanner.nextInt();
            System.out.println("Here is your table!\n" +
                    "number | squared | cubed\n" +
                    "------ | ------- | -----");
            for (int i = 1; i <= userInteger; i++) {
                System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
            }
            System.out.printf("\n\nWould you like to continue (y/n): ");
            userResponse = scanner.next();
        } while (userResponse.equals("y"));
    }

//    Convert given number grades into letter grades.
//
//    Prompt the user for a numerical grade from 0 to 100.
//    Display the corresponding letter grade.
//    Prompt the user to continue.
//    Assume that the user will enter valid integers for the grades.
//    The application should only continue if the user agrees to.
//    Grade Ranges:
//
//    A : 100 - 88
//    B : 87 - 80
//    C : 79 - 67
//    D : 66 - 60
//    F : 59 - 0

    public static void gradesNumber() {
        String response = "";
        int grades = 0;
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\n\n");
        do {
            System.out.print("Enter a grade: ");
            response = s.nextLine();
            try {
                grades = Integer.parseInt(response);
            } catch (NumberFormatException nfe) {
                System.out.print("INVALID ENTRY: enter an integer ");
                response = "y";
                continue;
            }
            if (grades > 100 || grades < 0) {
                System.out.print("Invalid grade: Must be 0 to 100\n\n");
                response = "y";
                continue;
            }

            // convert to letter
            String grade = "";
            if (grades > 97) grade = "A+";
            else if (grades > 93) grade = "A";
            else if (grades > 87) grade = "A-";
            else if (grades > 86) grade = "B+";
            else if (grades > 82) grade = "B";
            else if (grades > 79) grade = "B-";
            else if (grades > 76) grade = "C+";
            else if (grades > 73) grade = "C";
            else if (grades > 66) grade = "C-";
            else if (grades > 59) grade = "D";
            else grade = "F";

            // print the table
            System.out.printf("Here is the grade:\n %2s", grade);
            System.out.printf("\n\n\nWould you like to process another grade? ");
            response = s.nextLine();
            System.out.printf("\n");
            if (response == null || response.length() == 0) break;
        } while (response.charAt(0) == 'y');
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
    }

}


