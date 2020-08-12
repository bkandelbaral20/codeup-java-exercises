import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //Printing the value of pie in 2 decimal place
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + "\n\n%.2f", pi);

        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        int userInput = scan.nextInt();
        System.out.println(userInput + " is the number, that user typed");

        //Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.

        System.out.println("Please! enter a three words");
        String str1, str2, str3;
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        str3 = scan.nextLine();
        System.out.println(" You entered ---- " + str1 + str2 + str3);

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //do you capture all the words?
        //Rewrite the above example using the nextLine method.

        System.out.println("Please enter a sentence :");
        String printSentence = scan.nextLine();
        // if we use next() then it will not capture all the words because of whitespaces
        System.out.println("you have entered  : " + printSentence);


        // Prompt the user to enter values of length and width of a classroom at Codeup.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        // Assume that the rooms are perfect rectangles.
        // Assume that the user will enter valid numeric data for length and width.

        System.out.println("please enter the length of your classroom :");
        String userLength = scan.nextLine();
        double length = Double.parseDouble(userLength);
        System.out.println("please enter the Width of your classroom :");
        String userWidth = scan.nextLine();
        double width = Double.parseDouble(userWidth);
        System.out.println("please enter the height of your classroom :");
        String userHeight = scan.nextLine();
        double height = Double.parseDouble(userHeight);

        // Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and
        // the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        double areaOfClass = length * width;
        System.out.printf("The area of classroom is  :  %.2f" + areaOfClass + " cm");

        double perimeterOfClass = 2 * (length + width);
        System.out.println("The perimeter of an classroom is : " + perimeterOfClass + " cm");

        double volumeOfClass = length * width * height;
        System.out.println("The volume of classroom is : " + volumeOfClass + " cm");
    }
}