import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //loop basics
//      a.  While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

        int i = 5;
        while ( i<= 15){
            System.out.println("i is " + i);
            i++;
        }
//        doWhile();
//        forLoop();
//        FizzBuzz();
        //Tables();
        gradesNumber();
    }


        // b. Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while
//        the number is less than 1,000,000. Output should equal:

//        public static void doWhile() {

            //1.
//            int i = 0;
//            do {
//                System.out.println(i);
//                i += 2;
//            } while (i < 100);
////
            //2.
//            int j = 100;
//            do {
//                System.out.println(j);
//                j -= 5;
//            } while (j >= -10);

            //3.
//            int k = 2;
//            do {
//                System.out.println(k);
//                k *= k;
//            } while (k < 1000000);


      //  }

//        public static void forLoop (){
//        for (int i=0 ;i<=15 ; i+=2 ){
//            System.out.println("i is " + i);
//        }
//        }

        //c.FizzBuzz
//     One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory,
//     the test is designed to assess basic looping and conditional logic skills.
//    Write a program that prints the numbers from 1 to 100.
//    For multiples of three: print “Fizz” instead of the number.
//    For the multiples of five: print “Buzz”.
//    For numbers which are multiples of both three and five: print “FizzBuzz”.

//    public static void FizzBuzz(){
//        for(int i=1; i<=100; i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else {
//                System.out.println(i);
//            }
//        }
//    }

//    Display a table of powers.
//    Prompt the user to enter an integer.
//    Display a table of squares and cubes from 1 to the value entered.
//    Ask if the user wants to continue.
//    Assume that the user will enter valid data.
//    Only continue if the user agrees to.

//    public static void Tables(){

//        System.out.println("What number would you like to go up to? : ");
//        String userInput = scan.next();
//        int input = Integer.parseInt(userInput);
//        System.out.println("Here is your table");
//
//        for(int i=1; i <= input; i++){
//            System.out.println("number | squared |  cubed \n" +
//                    "------ | ------ | ------" );
//            int squared = (int) Math.pow(i,2);
//            int cubed = (int) Math.pow(i,3);
//           // System.out.printf(%i +    | \t"" + %i +   | \t    + %i" );
//
//        }
//    }
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

    public static void gradesNumber(){
        Scanner scaner = new Scanner(System.in);
        String userGrades = scaner.next();
        System.out.println("please! enter your grades from 0 to 100:");
        int grades = 0;

        switch (grades) {
            case (100-88):
                System.out.println("Congratulation you got A");
                break;
            case 2:
                System.out.println("Congratulation you got B");
                break;
            case 3:
                System.out.println("Congratulation you got c");
                break;
            case 4:
                System.out.println("Congratulation you got D");
                break;
            case 5:
                System.out.println("Congratulation you got E");
                break;
            default:
                System.out.println("Error!");
                System.out.println("The grade you entered is not valid!");

        }
    }
    }


