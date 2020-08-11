import java.sql.SQLOutput;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please ask him a questions: ");
        String userQuestion = scan.nextLine();

        String endsWithMark = userQuestion + "?";
        System.out.println("Sure!");

        String endsWithExclamation = userQuestion + "!";
        System.out.println("Whoa, chill out!");






    }
}
