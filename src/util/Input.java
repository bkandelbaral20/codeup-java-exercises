package util;

import java.util.Scanner;

public class Input {

    //creating class level variable or instance variable
    private Scanner scanner;

    //creating constructor of an class
    //this refers to class level object(parent object)
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //creating String get String() method
    public String getString() {
        String userInput = "";
        System.out.println("Please type here: ");
        userInput = scanner.nextLine();
        return userInput;

    }

    //boolean yesNo() method
//    public boolean yesNo() {
//        System.out.println("Please enter the Yes or No here:");
//        String userInput1 = scanner.next();
//        if (userInput1.equalsIgnoreCase("yes") || userInput1.equalsIgnoreCase("y")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    //int getInt(int min, int max) method
//    public int getInt(int min, int max)  {
//
//        try {
//            // i.e. see if number is between 1 and 10
//            System.out.println("please enter a int number here between 1 - 10 :");
//            boolean doAgain = true;
//            int num = 0;
//            do {
////                num = scanner.nextInt();
//                num = Integer.valueOf(getString());
//                if (num < min || num > max) {
//                    System.out.printf("\nThe integer %d is out of range\n", num);
//                    System.out.printf("Enter an integer between %d and %d: ", min, max);
//                } else {
//                    doAgain = false; // they did enter a number within range, so break while
//                }
//            } while (doAgain); // if we get a correct number (1 < x < 10), break out of while
//            return num;
//
//        } catch (NumberFormatException e) {
//            System.out.println("Something went wrong.");
//        }
//        return min;
//    }

        //int getInt()
        public int getInt () {
            System.out.println("Please enter another int number here:");
            int num = 0;
            num = scanner.nextInt();
            return num;
        }

//        public double getDouble ( double min, double max)  {
//            System.out.println("Please enter a double type of number here range from 1-10:");
//            boolean doAgain = true;
//            double input = 0;
//            do {
////                num = scanner.nextDouble();
//                input = Double.valueOf(this.scanner.nextLine());
//                if (num < min || num > max) {
//                    System.out.printf("\nThe number %.3f is out of range\n", num);
//                    System.out.printf("Enter an double number between %.1f and %.1f : ", min, max);
//                } else {
//                    doAgain = false; // they did enter a number within range, so break while
//                }
//            } while (doAgain); // if we get a correct number (1 < x < 10), break out of while
//            return num;
//        } catch (NumberFormatException e) {
//                System.out.println("Something went wrong in double method too.");
//            }
//            return max;
//        }

       // double getDouble()
        public double getDouble () {
            System.out.println("Please enter the double type of number here:");
            double num = 0;
            num = scanner.nextDouble();
            return num;
        }

        public void clear () {
            this.scanner.nextLine();
        }

        public long getBinary() {
    return 0;
        }
        public long getHex() {
    return 0;
        }

    }

