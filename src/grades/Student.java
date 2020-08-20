package grades;
 import java.util.*;
 import java.util.Collections;

public class Student {

    private String name;
//    private  String grades;
    ArrayList<Integer> grades = new ArrayList<>();

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
        System.out.println(stu.getName());
        System.out.println(stu.addGrade(90));
    }
}
