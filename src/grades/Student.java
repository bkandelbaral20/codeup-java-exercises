package grades;
 import java.util.*;
 import java.util.Collections;

public class Student {

    private String name;
//    private  String grades;
     private ArrayList<Integer> grades = new ArrayList<>();

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
        public void addGrade(int grade) {
            grades.add(grade);
        }

    // returns the average of the students grades
//    public double getGradeAverage(){
//    }

}
