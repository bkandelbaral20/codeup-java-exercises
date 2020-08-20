package grades;
 import java.util.*;
 import java.util.Collections;

public class Student {

    private String name;
//    private  String grades;
    static private ArrayList<Integer> grades = new ArrayList<>();
    static private ArrayList<String> grade = new ArrayList<>(Arrays.asList("90,56,78,88,67,99,89"));

   // Default constructor
    public Student (){}

    //constructor
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public ArrayList<Integer> addGrade(int grade){
        return grades;
    }

    // returns the average of the students grades
//    public double getGradeAverage(){
//    }

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println("WElcome ! \n");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println(stu.getName());
        System.out.println(stu.addGrade(90));
    }
}
