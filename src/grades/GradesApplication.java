package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        System.out.println(" Welcome ! \n");
        System.out.println(" Here are the GitHub usernames of our students:");

        HashMap<String, Student> students = new HashMap<>();

        //student name objects
        Student student1 = new Student("Sanju");
        Student student2 = new Student("Binju");
        Student student3 = new Student("Bijit");
        Student student4 = new Student("Santosh");

        //each student object 3 grades
        student1.addGrade(96);
        student1.addGrade(54);
        student1.addGrade(87);

        student2.addGrade(89);
        student2.addGrade(100);
        student2.addGrade(78);

        student3.addGrade(98);
        student3.addGrade(73);
        student3.addGrade(80);

        student4.addGrade(83);
        student4.addGrade(98);
        student4.addGrade(63);


        //student Github usernames
        students.put("bkandel56", student1);
        students.put("sanju21", student2);
        students.put("Bijit91", student3);
        students.put("Santosh56", student4);

//        Print the list of GitHub usernames out to the console, and ask the user which student they would like to see
//        more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given
//        input does not match up with a key in your map, tell the user that no users with that username were found. If
//        the given username does exist, display information about that student, including their name and their grades.

        System.out.print("| ");
        for (String username : students.keySet()) {
            System.out.print(username + " |  ");
        }
        Scanner scan = new Scanner(System.in);
       boolean again = false;
        do {

            System.out.println(" \n What student would you like to see more information on?");
            String userInput = scan.nextLine(); // either a string, or empty string
            System.out.println(userInput);

            if (students.containsKey(userInput)) {
                Student name = students.get(userInput);
                System.out.println("Name: " + name.getName() + "- GitHub Username: " + userInput);
                System.out.println("Current Average: " + name.getGradeAverage());
            } else System.out.print("Sorry, no student found with the GitHub username of \"" + userInput + "\".\n" +
                    " Would you like to see another student?(y/n)\n> ");
        } while(again = true);
    }
}

